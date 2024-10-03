package com.paymedia.employeemanagementsystemservice.repository;

import com.paymedia.employeemanagementsystemservice.entity.Employee;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByDepartmentName(String departmentName, Pageable pageable);
}
