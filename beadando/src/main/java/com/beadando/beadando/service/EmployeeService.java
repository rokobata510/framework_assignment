package com.beadando.beadando.service;

import com.beadando.beadando.dao.EmployeeDao;
import com.beadando.beadando.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;
    public Employee saveEmployee(Employee employee){
        return employeeDao.save(employee);
    }
    public List<Employee>  getEmployees(){
        List<Employee> employees = new ArrayList<>();
        employeeDao.findAll().forEach(employees::add);
        return employees;
    }
    public Employee getEmployees(Integer employeeId)
    {
        return employeeDao.findById(employeeId).orElseThrow();
    }

    public void deleteEmployee(Integer employeeId) {
        employeeDao.deleteById(employeeId);
    }
    public Employee updateEmployee(Employee employee)
    {
        return employeeDao.save(employee);
    }
}
