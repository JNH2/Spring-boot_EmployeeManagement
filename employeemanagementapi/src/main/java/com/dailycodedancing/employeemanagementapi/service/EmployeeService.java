package com.dailycodedancing.employeemanagementapi.service;
import java.util.List;

import com.dailycodedancing.employeemanagementapi.entity.Employee;
public interface EmployeeService {
    Employee getEmployeeByFirstName(String firstName);
    Employee getEmployeeById(long id);
    Employee getEmployeeByLastName(String lastName);
    void deleteEmployeeById(long id);
    Employee createEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee updateEmployee(long id, Employee eployee);
}