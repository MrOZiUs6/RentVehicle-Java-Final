package com.example.RentVehicle.repository;

import com.example.RentVehicle.tables.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface ClientRepository extends JpaRepository<Client, Long> {
    Client getClientById(Long Document_Number);
}
