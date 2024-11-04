package com.example.products_management.controller;

import com.example.products_management.entity.Order;
import com.example.products_management.entity.Product;
import com.example.products_management.entity.User;
import com.example.products_management.service.OrderService;
import com.example.products_management.service.ProductService;
import com.example.products_management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserService userService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private ProductService productService;

    @Transactional
    @GetMapping()
    public String adminDashboard(Model model) {
        String currentUserEmail = SecurityContextHolder.getContext().getAuthentication().getName();
        User currentUser = userService.findUserByEmail(currentUserEmail);

        if (currentUser == null) {
            throw new RuntimeException("Authenticated user not found in the database.");
        }

        List<User> customers = userService.findAllCustomers().stream().filter(user -> user.getRoles().stream().anyMatch(role -> role.getRoleName().equals("ROLE_CUSTOMER"))).toList();
        model.addAttribute("users", customers);

        List<Order> orders = orderService.getAllOrders();
        model.addAttribute("orders", orders);

        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);

        return "admin";
    }

    @GetMapping("/view-customer/{email}")
    public String showUserPage(@PathVariable("email") String email, Model model) {
        User user = userService.findUserByEmail(email);
        model.addAttribute("user", user);
        return "view-customer";
    }

    @PostMapping("/ordered-products")
    public String orderedProducts(Model model) {
        String currentUserEmail = SecurityContextHolder.getContext().getAuthentication().getName();
        User currentUser = userService.findUserByEmail(currentUserEmail);

        if (currentUser == null) {
            throw new RuntimeException("Authenticated user not found in the database.");
        }

        List<User> customers = userService.findAllCustomers().stream().filter(user -> user.getRoles().stream().anyMatch(role -> role.getRoleName().equals("ROLE_CUSTOMER"))).toList();
        model.addAttribute("users", customers);

        List<Order> orders = orderService.getOrdersForUser(currentUser.getId());
        model.addAttribute("orders", orders);

        return "ordered-products";
    }

    @GetMapping("/add-product")
    public String showAddProductPage(Model model) {
        model.addAttribute("product", new Product());
        return "add-product";
    }

    @PostMapping("/add-product")
    public String addProduct(@ModelAttribute("product") Product product) {
        productService.saveProduct(product);
        return "redirect:/admin?added";
    }

    @GetMapping("/edit-product/{id}")
    public String showEditProductPage(@PathVariable("id") int productId, Model model) {
        Product product = productService.getProductById(productId);
        model.addAttribute("product", product);
        return "edit-product";
    }

    @PostMapping("/edit-product/{id}")
    public String updateProduct(@PathVariable("id") int productId, @ModelAttribute("product") Product product) {
        productService.update(productId, product);
        return "redirect:/admin?edited";
    }

    @GetMapping("/delete-product/{id}")
    public String deleteProduct(@PathVariable("id") int productId) {
        productService.deleteProduct(productId);
        return "redirect:/admin";
    }

    @PostMapping("/orders/approve/{id}")
    public String approveOrder(@PathVariable("id") int orderId) {
        orderService.changeOrderStatus(orderId, "Accepted");
        return "redirect:/admin";
    }

    @PostMapping("/orders/reject/{id}")
    public String rejectOrder(@PathVariable("id") int orderId) {
        orderService.changeOrderStatus(orderId, "Rejected");
        return "redirect:/admin";
    }
}