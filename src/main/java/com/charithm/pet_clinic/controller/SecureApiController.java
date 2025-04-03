package com.charithm.pet_clinic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class SecureApiController {

    @GetMapping("/test")
    public ResponseEntity<Map<String, Object>> secureTest() {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Successfully accessed secure endpoint!");
        response.put("timestamp", LocalDateTime.now().toString());
        response.put("status", "success");
        
        return ResponseEntity.ok(response);
    }
} 