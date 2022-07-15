package com.example.RentVehicle.restController;

import com.example.RentVehicle.exception.NotFound;
import com.example.RentVehicle.repository.VehicleRepository;
import com.example.RentVehicle.services.VehicleService;
import com.example.RentVehicle.tables.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicle")
public class VehicleRestController {

    @Autowired
    VehicleRepository repository;

    @Autowired
    VehicleService service;

    @GetMapping("/all")
    List<Vehicle> all() {
        return repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/all")
    Vehicle newVehicle(@RequestBody Vehicle newVehicle) {
        return repository.save(newVehicle);
    }

    // Single item

    @GetMapping("/{id}")
    Vehicle one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new NotFound(id));
    }

    @PutMapping("/{id}")
    Vehicle replaceVehicle(@RequestBody Vehicle newVehicle, @PathVariable int id) {

        return service.replaceVehicle(newVehicle, id);
    }

    @DeleteMapping("/{id}")
    void deleteVehicle(@PathVariable int id) {
        Vehicle vehicle = repository.getVehicleById(id);
        repository.delete(vehicle);
    }
}
