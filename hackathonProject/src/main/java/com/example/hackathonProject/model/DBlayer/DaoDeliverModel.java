package com.example.hackathonProject.model.DBlayer;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hackathonProject.model.DeliverModel;
import java.util.Optional;


public interface DaoDeliverModel extends JpaRepository<DeliverModel, Long>{
    Optional findById(Long id);
}
