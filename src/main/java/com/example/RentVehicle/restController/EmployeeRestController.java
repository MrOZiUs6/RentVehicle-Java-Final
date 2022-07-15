package com.example.RentVehicle.restController;

import com.example.RentVehicle.exception.NotFound;
import com.example.RentVehicle.repository.EmployeeRepository;
import com.example.RentVehicle.services.EmployeeService;
import com.example.RentVehicle.tables.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {

    @Autowired
    EmployeeRepository repository;

    @Autowired
    EmployeeService service;

    @GetMapping("/all")
    List<Employee> all() {
        return repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/all")
    Employee newEmployee(@RequestBody Employee newEmployee) {
        return repository.save(newEmployee);
    }

    // Single item

    @GetMapping("/{id}")
    Employee one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new NotFound(id));
    }

    @PutMapping("/{id}")
    Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable int id) {

        return service.replaceEmployee(newEmployee, id);
    }

    @DeleteMapping("/{id}")
    void deleteEmployee(@PathVariable int id) {
        Employee employee = repository.getEmployeeById(id);
        repository.delete(employee);
    }
}
