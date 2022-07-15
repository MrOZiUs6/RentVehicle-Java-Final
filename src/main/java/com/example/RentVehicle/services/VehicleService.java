package com.example.RentVehicle.services;

import com.example.RentVehicle.repository.VehicleRepository;
import com.example.RentVehicle.tables.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    @Autowired
    VehicleRepository repository;

    public Vehicle replaceVehicle( Vehicle newVehicle, int id) {
        Vehicle vehicle = repository.getVehicleById(id);
        vehicle.setIdModelType(newVehicle.getIdModelType());
        vehicle.setLifeTime(newVehicle.getLifeTime());
        vehicle.setRentalPrice(newVehicle.getRentalPrice());
        repository.save(vehicle);
        return vehicle;
    }
}
