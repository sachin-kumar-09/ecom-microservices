package com.ecommerce.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/auth/test")
    public String test() {
        return "JWT validation successful!";
    }
}