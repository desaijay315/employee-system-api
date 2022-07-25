package com.dailycodebuffer.Employee.services;

import com.dailycodebuffer.Employee.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();

    boolean deleteEmployee(Long id);

    Employee getAllEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);
}
