package com.example.RentVehicle.services;

import com.example.RentVehicle.repository.ModelRepository;
import com.example.RentVehicle.tables.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelService {

    @Autowired
    ModelRepository repository;

    public Model replaceModel( Model newModel, int id) {
        Model model = repository.getModelById(id);
        model.setModelType(newModel.getModelType());
        model.setNumberOfWheels(newModel.getNumberOfWheels());
        model.setNumberOfSeats(newModel.getNumberOfSeats());
        model.setWheelSize(newModel.getWheelSize());
        model.setWheelType(newModel.getWheelType());
        model.setFrameType(newModel.getFrameType());
        repository.save(model);
        return model;
    }
}
