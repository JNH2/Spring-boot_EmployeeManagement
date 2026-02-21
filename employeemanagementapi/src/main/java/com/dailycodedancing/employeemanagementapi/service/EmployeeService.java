package com.dailycodedancing.employeemanagementapi.service;

import com.dailycodedancing.employeemanagementapi.entity.Employee;
public interface EmployeeService {
    Employee getEmployeeByFirstName(String firstName);
    Employee getEmployeeById(long id);
    Employee getEmployeeByLastName(String lastName);
    void deleteEmployeeById(long id);
}