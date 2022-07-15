package com.example.RentVehicle.repository;

import com.example.RentVehicle.tables.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee getEmployeeById(int idEmployee);
}
