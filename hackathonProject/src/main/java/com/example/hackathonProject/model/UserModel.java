package com.example.hackathonProject.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class UserModel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private  String username;
    private  String password;
    
    @OneToMany(mappedBy = "user")
    private List<OrderModel> orders;

}
