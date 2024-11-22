package com.example.hackathonProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.hackathonProject.model.DBlayer.DaoAdminModel;
import com.example.hackathonProject.model.DBlayer.DaoDeliverModel;
import com.example.hackathonProject.model.DBlayer.DaoUserModel;

@Service
public class MainPage {

    private final DaoAdminModel daoAdminModel;
    private final DaoUserModel daoUserModel;
    private final DaoDeliverModel daoDeliverModel;

    @Autowired
    public MainPage(DaoAdminModel daoAdminModel, DaoUserModel daoUserModel, DaoDeliverModel daoDeliverModel) {
        this.daoAdminModel = daoAdminModel;
        this.daoUserModel = daoUserModel;
        this.daoDeliverModel = daoDeliverModel;
    }

    public Object getModelByRoleAndId(String role, Long id) {
        switch (role) {
            case "USER":
                return daoUserModel.findById(id).orElse(null); 
            case "ADMIN":
                return daoAdminModel.findById(id).orElse(null); 
            case "DELIVER":
                return daoDeliverModel.findById(id).orElse(null); 
            default:
                throw new IllegalArgumentException("Unknown role: " + role); 
        }
    }
}
