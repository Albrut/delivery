package com.example.hackathonProject.model.DBlayer;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hackathonProject.model.OrderModel;

public interface DaoOrderModel extends JpaRepository<OrderModel, Long> {
    
}
