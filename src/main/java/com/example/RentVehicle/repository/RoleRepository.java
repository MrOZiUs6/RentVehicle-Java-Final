package com.example.RentVehicle.repository;

import com.example.RentVehicle.tables.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface RoleRepository extends JpaRepository<Role, Long> {
    Role getRoleById(int idRole);
}
