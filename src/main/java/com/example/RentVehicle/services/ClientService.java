package com.example.RentVehicle.services;

import com.example.RentVehicle.repository.ClientRepository;
import com.example.RentVehicle.tables.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClientService {

    @Autowired
    ClientRepository repository;

    public Client replaceClient( Client newClient, Long id) {
        Client client = repository.getClientById(id);
        client.setSurname(newClient.getSurname());
        client.setName(newClient.getName());
        client.setPatronymic(newClient.getPatronymic());
        client.setTelephoneNumber(newClient.getTelephoneNumber());
        client.setPassword(newClient.getPassword());
        repository.save(client);
        return client;
    }
}
