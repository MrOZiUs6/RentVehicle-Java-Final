package com.example.RentVehicle.services;

import com.example.RentVehicle.repository.RoleRepository;
import com.example.RentVehicle.tables.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    RoleRepository repository;

    public Role replaceRole( Role newRole, int id) {
        Role role = repository.getRoleById(id);
        role.setNameRole(newRole.getNameRole());
        repository.save(role);
        return role;
    }
}
