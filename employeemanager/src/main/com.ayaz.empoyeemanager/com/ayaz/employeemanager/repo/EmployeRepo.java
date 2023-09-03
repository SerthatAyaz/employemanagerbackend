package com.ayaz.employeemanager.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import com.ayaz.employeemanager.model.Employee;

import java.util.Optional;

public interface EmployeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}

