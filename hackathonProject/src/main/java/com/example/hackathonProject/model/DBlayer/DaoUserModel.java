package com.example.hackathonProject.model.DBlayer;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hackathonProject.model.UserModel;

import java.util.List;


public interface DaoUserModel extends JpaRepository<UserModel, Long> {
    List<UserModel> findByUsername(String username);
    
}
