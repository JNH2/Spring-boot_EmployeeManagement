package com.dailycodedancing.employeemanagementapi.service;

import com.dailycodedancing.employeemanagementapi.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private List<Employee> employeeList = new ArrayList<>();
    
    //add example list here using setter
    public EmployeeServiceImpl() {
        employeeList.add(new Employee("Ming", "Li", 3, "li@example.com", "Sales"));
    }
    
    
    @Override
    public Employee getEmployeeById(long id){
        return employeeList.stream()
        .filter(emp -> emp.getId() == id)
        .findFirst()
        .orElseThrow(() -> new RuntimeException("404: Employee not found with id: " + id));
    }

    @Override
    public Employee getEmployeeByFirstName(String firstName){
        return employeeList.stream()
        .filter(emp -> emp.getFirstName().equals(firstName))
        .findFirst()
        .orElseThrow(() -> new RuntimeException("404: Employee not found with first name: " + firstName));
    }

    @Override
    public Employee getEmployeeByLastName(String lastName){
        return employeeList.stream()
        .filter(emp -> emp.getLastName().equals(lastName))
        .findFirst()
        .orElseThrow(() -> new RuntimeException("404: Employee not found with last name: " + lastName));
    }
    @Override
    public void deleteEmployeeById(long id) {
        boolean removed = employeeList.removeIf(emp -> emp.getId() == id);
        if(!removed) {
            throw new RuntimeException("Delete failed: Employee not found with id:" + id);
        }
    }

    @Override
    public Employee createEmployee(Employee employee) {
        employeeList.add(employee);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    @Override
    public Employee updateEmployee(long id, Employee employee) {
        Employee previousEmployee = getEmployeeById(id);

        if(previousEmployee != null) {
            deleteEmployeeById(id);
            employeeList.add(employee);
            return employee;
        } else {
            throw new RuntimeException("Update failed: Employee not found with id:" + id);
        }
    }


}