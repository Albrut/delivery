package com.example.hackathonProject.model;

import java.util.Collection;
import java.util.List;

import com.example.hackathonProject.model.constants.Roles;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Data
public class UserModel{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @Column(unique = true)
    private  String userLogin;

    private  String userPassword;
    @Enumerated(EnumType.STRING)
    Roles role;
    @OneToMany(mappedBy = "user")
    private List<OrderModel> orders;

}
