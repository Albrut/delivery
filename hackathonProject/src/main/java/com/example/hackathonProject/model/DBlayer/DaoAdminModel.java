package com.example.hackathonProject.model.DBlayer;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hackathonProject.model.AdminModel;

public interface DaoAdminModel extends JpaRepository<AdminModel,Long>{
    
}
