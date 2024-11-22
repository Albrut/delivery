package com.example.hackathonProject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hackathonProject.service.MainPage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/account")
public class MainPageController {
    private MainPage mainPageservice;
    public MainPageController(MainPage mainPageservice){
        this.mainPageservice = mainPageservice;
    }

    @GetMapping("/get")
    public Object mainPage(@RequestParam String role, @RequestParam Long id) {
        return mainPageservice.getModelByRoleAndId(role, id);
    }
    
}
