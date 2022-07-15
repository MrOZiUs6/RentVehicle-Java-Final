package com.example.RentVehicle.services;

import com.example.RentVehicle.repository.EmployeeRepository;
import com.example.RentVehicle.tables.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;

    public Employee replaceEmployee( Employee newEmployee, int id) {
        Employee employee = repository.getEmployeeById(id);
        employee.setSurname(newEmployee.getSurname());
        employee.setName(newEmployee.getName());
        employee.setPatronymic(newEmployee.getPatronymic());
        employee.setLogin(newEmployee.getLogin());
        employee.setPassword(newEmployee.getPassword());
        employee.setIdRole(newEmployee.getIdRole());
        repository.save(employee);
        return employee;
    }
}
