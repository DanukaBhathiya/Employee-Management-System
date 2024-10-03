package com.paymedia.employeemanagementsystemservice.service;

import com.paymedia.employeemanagementsystemservice.entity.Department;
import org.springframework.data.domain.Page;

public interface DepartmentService {
    Department createDepartment(Department department);
    Department getDepartmentById(Long id);
    Department updateDepartment(Long id, Department department);
    void deleteDepartment(Long id);
    Page<Department> getAllDepartments(int page, int size, String[] sort);
}
