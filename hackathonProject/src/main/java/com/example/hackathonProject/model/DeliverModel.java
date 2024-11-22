package com.example.hackathonProject.model;



import com.example.hackathonProject.model.constants.ConstantsOfTransport;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class DeliverModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String deliverLogin;
    private String deliverPassword;

    @Enumerated(EnumType.STRING)
    private ConstantsOfTransport typeOfTransport;
    
    
}
