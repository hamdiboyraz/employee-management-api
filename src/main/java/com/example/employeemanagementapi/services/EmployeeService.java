package com.example.employeemanagementapi.services;

import com.example.employeemanagementapi.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();
}

