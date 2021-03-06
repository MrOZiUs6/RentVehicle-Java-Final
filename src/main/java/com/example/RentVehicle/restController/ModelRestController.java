package com.example.RentVehicle.restController;

import com.example.RentVehicle.exception.NotFound;
import com.example.RentVehicle.repository.ModelRepository;
import com.example.RentVehicle.services.ModelService;
import com.example.RentVehicle.tables.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/model")
public class ModelRestController {

    @Autowired
    ModelRepository repository;

    @Autowired
    ModelService service;

    @GetMapping("/all")
    List<Model> all() {
        return repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/all")
    Model newModel(@RequestBody Model newModel) {
        return repository.save(newModel);
    }

    // Single item

    @GetMapping("/{id}")
    Model one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new NotFound(id));
    }

    @PutMapping("/{id}")
    Model replaceModel(@RequestBody Model newModel, @PathVariable int id) {

        return service.replaceModel(newModel, id);
    }

    @DeleteMapping("/{id}")
    void deleteModel(@PathVariable int id) {
        Model model = repository.getModelById(id);
        repository.delete(model);
    }
}
