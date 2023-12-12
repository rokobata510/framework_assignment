package com.beadando.beadando.controller;

import com.beadando.beadando.entity.Employee;
import com.beadando.beadando.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/post/employee")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);

    }
    @GetMapping("/get/employees")
    public List<Employee> getEmployees()
    {
        return employeeService.getEmployees();

    }
    @GetMapping("/get/employee/{employeeId}")
    public Employee getEmployee(@PathVariable Integer employeeId)
    {
        return employeeService.getEmployees(employeeId);
    }
    @DeleteMapping("/delete/employee/{employeeId}")
    public void deleteEmployee(@PathVariable Integer employeeId)
    {
        employeeService.deleteEmployee(employeeId);
    }
    @PutMapping("/put/employee")
    public Employee updateEmployee(@RequestBody Employee employee)
    {
         return employeeService.updateEmployee(employee);
    }
}
