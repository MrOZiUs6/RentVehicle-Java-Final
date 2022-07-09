package com.example.RentVehicle.repository;

import com.example.RentVehicle.tables.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public
interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee getEmployeeById(int ID_Employee);
}
