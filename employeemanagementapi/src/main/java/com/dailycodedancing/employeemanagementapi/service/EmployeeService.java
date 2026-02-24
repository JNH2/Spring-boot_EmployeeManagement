package com.dailycodedancing.employeemanagementapi.service;
import java.util.List;

import com.dailycodedancing.employeemanagementapi.entity.EmployeeEntity;
public interface EmployeeService {
    EmployeeEntity getEmployeeByFirstName(String firstName);
    EmployeeEntity getEmployeeById(long id);
    EmployeeEntity getEmployeeByLastName(String lastName);
    void deleteEmployeeById(long id);
    EmployeeEntity createEmployee(EmployeeEntity employee);
    List<EmployeeEntity> getAllEmployees();
    EmployeeEntity updateEmployee(long id, EmployeeEntity employee);
}