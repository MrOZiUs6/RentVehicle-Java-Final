package com.example.RentVehicle.repository;

import com.example.RentVehicle.tables.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface ContractRepository extends JpaRepository<Contract, Long> {
    Contract getContractById(int ID_Contract);
}
