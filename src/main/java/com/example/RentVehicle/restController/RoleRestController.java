package com.example.RentVehicle.restController;

import com.example.RentVehicle.exception.NotFound;
import com.example.RentVehicle.repository.RoleRepository;
import com.example.RentVehicle.services.RoleService;
import com.example.RentVehicle.tables.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
class RoleRestController {

    @Autowired
    RoleRepository repository;

    @Autowired
    RoleService service;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    List<Role> all() {
        return repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    Role newRole(@RequestBody Role newRole) {
        return repository.save(newRole);
    }

    // Single item

    @GetMapping("/{id}")
    Role one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new NotFound(id));
    }

    @PutMapping("/{id}")
    Role replaceRole(@RequestBody Role newRole, @PathVariable int id) {

        return service.replaceRole(newRole, id);
    }

    @DeleteMapping("/{id}")
    void deleteRole(@PathVariable int id) {
        Role role = repository.getRoleById(id);
        repository.delete(role);
    }
}
