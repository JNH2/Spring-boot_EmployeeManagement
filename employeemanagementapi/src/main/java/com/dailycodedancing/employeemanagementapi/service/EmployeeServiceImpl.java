package com.dailycodedancing.employeemanagementapi.service;
import com.dailycodedancing.employeemanagementapi.entity.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dailycodedancing.employeemanagementapi.repository.EmployeeRepository;
import com.dailycodedancing.employeemanagementapi.exception.ResourceNotFoundException;

//import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    //private List<EmployeeEntity> employeeList = new ArrayList<>();
@Autowired
    private EmployeeRepository employeeRepository;
    //public EmployeeServiceImpl() {
    //    employeeList.add(new Employee("Ming", "Li", 3, "li@example.com", "Sales"));}
    @Override
    public EmployeeEntity getEmployeeById(long id){
        return employeeRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("404: Employee not found with id: " + id));
    }
    @Override
    public EmployeeEntity getEmployeeByFirstName(String firstName){
        return employeeRepository.findByFirstName(firstName)
        .orElseThrow(() -> new ResourceNotFoundException("404: Employee not found with first name: " + firstName));
    }
    @Override
    public EmployeeEntity getEmployeeByLastName(String lastName){
        return employeeRepository.findByLastName(lastName)
        .orElseThrow(() -> new ResourceNotFoundException("404: Employee not found with last name: " + lastName));
    }
    @Override
    public void deleteEmployeeById(long id) {
        employeeRepository.deleteById(id);

    }
    @Override
    public EmployeeEntity createEmployee(EmployeeEntity employee) {
        return employeeRepository.save(employee);
    }
    @Override
    public List<EmployeeEntity> getAllEmployees() {
        return employeeRepository.findAll();
    }
    @Override
    public EmployeeEntity updateEmployee(long id, EmployeeEntity employee) {
        EmployeeEntity existingEmployee = getEmployeeById(id);
        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setEmailId(employee.getEmailId());
        existingEmployee.setDepartment(employee.getDepartment());
        return employeeRepository.save(existingEmployee);
    }


}