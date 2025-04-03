package com.charithm.pet_clinic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "Welcome to Pet Clinic REST API!";
    }

    @GetMapping("/test")
    public String test() {
        return "Pet Clinic application is running successfully!";
    }
} 