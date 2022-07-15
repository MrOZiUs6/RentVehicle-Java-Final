package com.example.RentVehicle.restController;

import com.example.RentVehicle.exception.NotFound;
import com.example.RentVehicle.repository.ClientRepository;
import com.example.RentVehicle.services.ClientService;
import com.example.RentVehicle.tables.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
class ClientRestController {

    @Autowired
    ClientRepository repository;

    @Autowired
    ClientService service;

    @GetMapping("/all")
    List<Client> all() {
        return repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/all")
    Client newClient(@RequestBody Client newClient) {
        return repository.save(newClient);
    }

    // Single item

    @GetMapping("/{id}")
    Client one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new NotFound(id));
    }

    @PutMapping("/{id}")
    Client replaceClient(@RequestBody Client newClient, @PathVariable  Long id) {

        return service.replaceClient(newClient, id);
    }

    @DeleteMapping("/{id}")
    void deleteClient(@PathVariable Long id) {
        Client client = repository.getClientById(id);
        repository.delete(client);
    }
}
