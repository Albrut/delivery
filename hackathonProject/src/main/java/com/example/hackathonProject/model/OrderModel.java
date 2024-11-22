package com.example.hackathonProject.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.example.hackathonProject.model.constants.SizesOfOrderConstants;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class OrderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String startPoint;
    private String endPoint;
    private BigDecimal priceOrder;
    private LocalDateTime timeWhenCreatedOrder;
    
    private int orderWidth;
    private int orderHeight;
    private int orderLength;

    @Enumerated(EnumType.STRING)
    private SizesOfOrderConstants sizesOfOrder;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel user;
}
