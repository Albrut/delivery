package com.example.hackathonProject.model.DBlayer;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hackathonProject.model.UserModel;



public interface DaoUserModel extends JpaRepository<UserModel, Long> {
    UserModel findByUserLogin(String userLogin);

}
