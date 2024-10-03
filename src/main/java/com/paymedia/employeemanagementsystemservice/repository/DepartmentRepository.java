package com.paymedia.employeemanagementsystemservice.repository;

import com.paymedia.employeemanagementsystemservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}

