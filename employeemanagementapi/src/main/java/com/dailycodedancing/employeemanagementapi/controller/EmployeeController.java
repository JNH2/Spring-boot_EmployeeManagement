package com.dailycodedancing.employeemanagementapi.controller;
import com.dailycodedancing.employeemanagementapi.entity.Employee; 
import com.dailycodedancing.employeemanagementapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable long id) {
        return employeeService.getEmployeeById(id);
    }
    @GetMapping("/firstName")
    public Employee getEmployeeByFirstName(@RequestParam String firstName) {
        return employeeService.getEmployeeByFirstName(firstName);
    }

    @GetMapping("/lastName")
    public Employee getEmployeeByLastName(@RequestParam String lastName) {
        return employeeService.getEmployeeByLastName(lastName);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployeeById(@PathVariable("id") long id) {
        employeeService.deleteEmployeeById(id);
        return "Employee with ID " + id + " has been deleted.";
    }
}
