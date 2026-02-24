package com.dailycodedancing.employeemanagementapi.repository;
import com.dailycodedancing.employeemanagementapi.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
    java.util.Optional<EmployeeEntity> findByFirstName(String firstName);
    java.util.Optional<EmployeeEntity> findByLastName(String lastName);

}
