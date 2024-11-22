package com.example.hackathonProject.model;


import com.example.hackathonProject.model.constants.SizesOfOrderConstants;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String startPoint;
    private String endPoint;
    private int priceOrder;

    @Enumerated(EnumType.STRING)
    private SizesOfOrderConstants sizesOfOrder;
}