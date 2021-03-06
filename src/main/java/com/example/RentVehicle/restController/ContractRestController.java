package com.example.RentVehicle.restController;

import com.example.RentVehicle.exception.NotFound;
import com.example.RentVehicle.repository.ContractRepository;
import com.example.RentVehicle.services.ContractService;
import com.example.RentVehicle.tables.Contract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contract")
public class ContractRestController {

    @Autowired
    ContractRepository repository;

    @Autowired
    ContractService service;

    @GetMapping("/all")
    List<Contract> all() {
        return repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/all")
    Contract newContract(@RequestBody Contract newContract) {
        return repository.save(newContract);
    }

    // Single item

    @GetMapping("/{id}")
    Contract one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new NotFound(id));
    }

    @PutMapping("/{id}")
    Contract replaceContract(@RequestBody Contract newContract, @PathVariable int id) {

        return service.replaceContract(newContract, id);
    }

    @DeleteMapping("/{id}")
    void deleteContract(@PathVariable int id) {
        Contract contract = repository.getContractById(id);
        repository.delete(contract);
    }
}
