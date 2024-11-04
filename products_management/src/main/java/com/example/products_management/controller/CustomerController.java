package com.example.products_management.controller;

import com.example.products_management.entity.*;
import com.example.products_management.repository.CartItemRepository;
import com.example.products_management.service.*;
import org.aspectj.apache.bcel.generic.ClassGen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.math.BigDecimal;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private ProductService productService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private UserService userService;

    @Autowired
    private CartService cartService;

    @Autowired
    private CartItemService cartItemService;

    @Autowired
    CartItemRepository cartItemRepository;

    @GetMapping
    public String customerDashboard(Model model) {
        String currentUserEmail = SecurityContextHolder.getContext().getAuthentication().getName();
        User currentUser = userService.findUserByEmail(currentUserEmail);
        model.addAttribute("user", currentUser);

        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);

        List<Order> orders = orderService.getOrdersForUser(currentUser.getId());
        model.addAttribute("orders", orders);

        Cart cart = cartService.getCartForUser(currentUser);
        List<CartItem> cartItems = cartItemService.getCartItemsForCart(cart);
        model.addAttribute("cartItems", cartItems);

        BigDecimal totalAmount = cartService.calculateTotalAmount(cartItems);
        model.addAttribute("totalAmount", totalAmount);

        return "customer";
    }

    @GetMapping("/view-customer/{email}")
    public String showUserPage(@PathVariable("email") String email, Model model) {
        User user = userService.findUserByEmail(email);
        model.addAttribute("user", user);
        return "view-profile";
    }

    @GetMapping("/edit-profile/{email}")
    public String showEditProfileForm(Model model, Principal principal) {
        String email = principal.getName();
        User user = userService.findUserByEmail(email);
        model.addAttribute("user", user);
        return "edit-profile";
    }

    @PostMapping("/edit-profile/{email}")
    public String updateProfile(@ModelAttribute("user") User user, Principal principal) {
        String email = principal.getName();
        user.setEmail(email);
        userService.updateCustomerProfile(user);
        return "redirect:/customer/view-customer/"+email;
    }

    @GetMapping("/delete-profile/{email}")
    public String deleteProfile(@PathVariable String email, Principal principal) {
        String currentUserEmail = principal.getName();
        if (currentUserEmail.equals(email)) {
            userService.deleteByEmail(email);
        }
        return "redirect:/login?profiledeleted";
    }

//    @GetMapping("/orders")
//    public String orderHistory(Model model) {
//        List<Order> orders = orderService.getAllOrders();
//        model.addAttribute("orders", orders);
//        return "order-history";
//    }

    @GetMapping("/cart")
    public String customerCart(Model model) {
        String currentUserEmail = SecurityContextHolder.getContext().getAuthentication().getName();
        User currentUser = userService.findUserByEmail(currentUserEmail);

        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);

        Cart cart = cartService.getCartForUser(currentUser);
        List<CartItem> cartItems = cartItemService.getCartItemsForCart(cart);
        model.addAttribute("cartItems", cartItems);

        List<Order> orders = orderService.getOrdersForUser(currentUser.getId());
        model.addAttribute("orders", orders);

        BigDecimal totalAmount = cartService.calculateTotalAmount(cartItems);
        model.addAttribute("totalAmount", totalAmount);

        return "cart";
    }

    @PostMapping("/cart/add/{productId}")
    public String addProductToCart(@PathVariable("productId") int productId) {
        String currentUserEmail = SecurityContextHolder.getContext().getAuthentication().getName();
        User currentUser = userService.findUserByEmail(currentUserEmail);

        Product product = productService.getProductById(productId);
        if (product.getProdStockQuantity() <= 0) {
            return "redirect:/customer/cart";
        }

        Cart cart = cartService.getCartByUser(currentUser);
        if (cart == null) {
            cart = new Cart();
            cart.setUser(currentUser);
            cartService.createCart(cart);
        }

        List<CartItem> existingItems = cartItemService.getCartItemsByCart(cart);
        boolean itemFound = false;
        for (CartItem existingItem : existingItems) {
            if (existingItem.getProduct().getId() == productId) {
                existingItem.setQuantity(existingItem.getQuantity() + 1);
                cartItemService.createCartItem(existingItem);
                itemFound = true;
                break;
            }
        }

        if (!itemFound) {
            CartItem cartItem = new CartItem();
            cartItem.setCart(cart);
            cartItem.setProduct(product);
            cartItem.setQuantity(1);
            cartItem.setPrice(product.getProdPrice());
            cartItemService.createCartItem(cartItem);
        }

        product.setProdStockQuantity(product.getProdStockQuantity() - 1);
        productService.saveProduct(product);

        return "redirect:/customer/cart";
    }

    @PostMapping("/cart/remove/{productId}")
    public String removeProductFromCart(@PathVariable("productId") int productId) {
        String currentUserEmail = SecurityContextHolder.getContext().getAuthentication().getName();
        User currentUser = userService.findUserByEmail(currentUserEmail);

        Cart cart = cartService.getCartByUser(currentUser);
        if (cart == null || cart.getCartItems().isEmpty()) {
            return "redirect:/customer/cart";
        }

        List<CartItem> existingItems = cart.getCartItems();
        for (CartItem existingItem : existingItems) {
            if (existingItem.getProduct().getId() == productId) {
                int quantityToRemove = existingItem.getQuantity();
                Product product = existingItem.getProduct();
                product.setProdStockQuantity(product.getProdStockQuantity() + quantityToRemove);
                productService.saveProduct(product);
                cartItemService.removeCartItem(cart, productId);
                break;
            }
        }
        return "redirect:/customer/cart";
    }

//    @PostMapping("/cart/submit")
//    public String submitOrder(Principal principal) {
//        String currentUserEmail = principal.getName();
//        User currentUser = userService.findUserByEmail(currentUserEmail);
//
//        Cart cart = cartService.getCartByUser(currentUser);
//
//        try {
//            for (CartItem item : cart.getCartItems()) {
//                orderService.submitOrder(currentUser, item.getProduct().getId(), item.getQuantity());
//            }
//        } catch (Exception e) {
//            return "redirect:/cart?error=" + e.getMessage();
//        }
//        return "redirect:/customer/cart";
//    }

    @PostMapping("/cart/submit")
    public String submitCart(@AuthenticationPrincipal UserDetails userDetails, RedirectAttributes redirectAttributes) {
        String email = userDetails.getUsername(); // Get the current user's email
        User user = userService.findUserByEmail(email);
        List<CartItem> cartItems = cartService.getCartItemsForUser(user);

        if (cartItems.isEmpty()) {
            redirectAttributes.addFlashAttribute("error", "Your cart is empty!");
            return "redirect:/customer/cart"; // Redirect to cart if empty
        }

        // Calculate the total amount
        BigDecimal totalAmount = BigDecimal.ZERO;
        for (CartItem item : cartItems) {
            BigDecimal productPrice = item.getProduct().getProdPrice();
            BigDecimal quantity = BigDecimal.valueOf(item.getQuantity());
            totalAmount = totalAmount.add(productPrice.multiply(quantity));
        }

        Order order = new Order();
        order.setUser(user);
        order.setOrderStatus("Pending");
        order.setOrderTotalAmount(totalAmount);

        List<OrderItem> orderItems = createOrderItems(cartItems, order);
        order.setOrderItems(orderItems);

        orderService.saveOrder(order);

        cartService.clearCart(email);

        redirectAttributes.addFlashAttribute("success", "Your order has been placed successfully!");
        return "redirect:/customer";
    }

    private List<OrderItem> createOrderItems(List<CartItem> cartItems, Order order) {
        List<OrderItem> orderItems = new ArrayList<>();
        for (CartItem cartItem : cartItems) {
            OrderItem orderItem = new OrderItem();
            orderItem.setUser(order.getUser());
            orderItem.setProduct(cartItem.getProduct());
            orderItem.setOrderQuantity(cartItem.getQuantity());
            orderItem.setOrderPrice(cartItem.getProduct().getProdPrice());
            orderItem.setOrder(order);
            if (orderItem.getUser() == null) {
                throw new RuntimeException("User in OrderItem is null");
            }
            orderItems.add(orderItem);
        }
        return orderItems;
    }
}