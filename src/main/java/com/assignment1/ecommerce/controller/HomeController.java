package com.assignment1.ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "Welcome to Ecommerce API! Use /api/categories, /api/products, /api/roles, or /api/users for endpoints.";
    }
}