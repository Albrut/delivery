package com.example.hackathonProject.service;

import org.springframework.stereotype.Service;

import com.example.hackathonProject.model.AdminModel;
import com.example.hackathonProject.model.DeliverModel;
import com.example.hackathonProject.model.UserModel;


@Service
public class MainPage {
    private UserModel userModel;
    private AdminModel adminModel;
    private DeliverModel deliverModel;
    private MainPage(UserModel userModel, AdminModel adminModel, DeliverModel deliverModel){
        this.adminModel = adminModel;
        this.userModel = userModel;
        this. deliverModel = deliverModel;
    }
    
    public Object getModelByRoleAndId(String role){
        switch (role) {
            case "USER":
                return userModel.s
                break;
        
            default:
                break;
        }
    }
}
