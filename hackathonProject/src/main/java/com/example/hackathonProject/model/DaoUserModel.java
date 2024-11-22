package com.example.hackathonProject.model;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface DaoUserModel extends JpaRepository<UserModel, Long> {
    List<UserModel> findByUsername(String username);
    
}
