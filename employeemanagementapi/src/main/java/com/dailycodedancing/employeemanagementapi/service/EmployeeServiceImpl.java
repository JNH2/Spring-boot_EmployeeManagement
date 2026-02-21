package com.dailycodedancing.employeemanagementapi.service;

import com.dailycodedancing.employeemanagementapi.service.EmployeeService;



import com.dailycodedancing.employeemanagementapi.entity.Employee;
import java.util.List;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private List<Employee> employeeList = new ArrayList<>();
    
    //add example list here using setter
    public EmployeeServiceImpl() {
        employeeList.add(new Employee("Ming", "Li", 3L, "li@example.com", "Sales"));
    }
    
    
    @Override
    public Employee getEmployeeById(long id){
        return employeeList.stream().filter(emp -> emp.getId() == id)
        .findFirst()
        .orElseThrow(() -> new RuntimeException("404: Employee not found with id: " + id));
    }

    @Override
    public Employee getEmployeeByFirstName(String firstName){
        return employeeList.stream().filter(emp -> emp.getFirstName().equals(firstName))
        .findFirst()
        .orElseThrow(() -> new RuntimeException("404: Employee not found with first name: " + firstName));
    }

    @Override
    public Employee getEmployeeByLastName(String lastName){
        return employeeList.stream().filter(emp -> emp.getLastName().equals(lastName))
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
}