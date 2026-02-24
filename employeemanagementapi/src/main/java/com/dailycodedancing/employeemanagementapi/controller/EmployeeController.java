package com.dailycodedancing.employeemanagementapi.controller;
import com.dailycodedancing.employeemanagementapi.entity.EmployeeEntity; 
import com.dailycodedancing.employeemanagementapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{id}")
    public EmployeeEntity getEmployeeById(@PathVariable long id) {
        return employeeService.getEmployeeById(id);
    }
    @GetMapping("/firstName")
    public EmployeeEntity getEmployeeByFirstName(@RequestParam String firstName) {
        return employeeService.getEmployeeByFirstName(firstName);
    }

    @GetMapping("/lastName")
    public EmployeeEntity getEmployeeByLastName(@RequestParam String lastName) {
        return employeeService.getEmployeeByLastName(lastName);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployeeById(@PathVariable("id") long id) {
        employeeService.deleteEmployeeById(id);
        return "Employee with ID " + id + " has been deleted.";
    }
    @PostMapping
    public EmployeeEntity createEmployee(@RequestBody EmployeeEntity employee) {
        return employeeService.createEmployee(employee);
    }
    @GetMapping
    public List<EmployeeEntity> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @PutMapping("/{id}")
    public EmployeeEntity updateEmployee(@PathVariable long id, @RequestBody EmployeeEntity employee) {
        return employeeService.updateEmployee(id, employee);
    }
}
