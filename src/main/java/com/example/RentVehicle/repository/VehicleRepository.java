package com.example.RentVehicle.repository;

import com.example.RentVehicle.tables.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    Vehicle getVehicleById(int serialNumber);

}
