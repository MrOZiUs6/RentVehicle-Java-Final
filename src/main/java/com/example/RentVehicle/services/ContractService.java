package com.example.RentVehicle.services;

import com.example.RentVehicle.repository.ContractRepository;
import com.example.RentVehicle.tables.Contract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContractService {

    @Autowired
    ContractRepository repository;

    public Contract replaceContract( Contract newContract, int id) {
        Contract contract = repository.getContractById(id);
        contract.setDateOfConclusion(newContract.getDateOfConclusion());
        contract.setIdEmployee(newContract.getIdEmployee());
        contract.setDocumentNumber(newContract.getDocumentNumber());
        contract.setSerialNumber(newContract.getSerialNumber());
        contract.setFinalPrice(newContract.getFinalPrice());
        repository.save(contract);
        return contract;
    }
}
