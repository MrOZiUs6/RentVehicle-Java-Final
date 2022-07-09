package com.example.RentVehicle.repository;

import com.example.RentVehicle.tables.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long> {
    Model getModelById(int ID_Model_Type);
}
