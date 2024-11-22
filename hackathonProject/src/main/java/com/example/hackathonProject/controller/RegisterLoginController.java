package com.example.hackathonProject.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/auth")
@RestController
public class RegisterLoginController {

    @GetMapping("/")
    public String mainPage() {
        return "";
    }

    @PostMapping("/register")
    public String register (@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/login")
    public String getMethodName(@RequestParam String reqString) {
        return "got";
    }
    
    
    
}
