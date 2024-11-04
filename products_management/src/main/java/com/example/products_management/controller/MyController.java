package com.example.products_management.controller;

import com.example.products_management.entity.*;
import com.example.products_management.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.List;

@Controller
@RequestMapping("/")
public class MyController {

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @GetMapping("/home")
    public String homePage(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);

        return "home";
    }

    @GetMapping("/register")
    public String registrationPage(Model model) {
        model.addAttribute("user",new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") User user){
        user.setPassword("{noop}"+user.getPassword());
        userService.saveUser(user);
        return "redirect:/login?success";
    }
}