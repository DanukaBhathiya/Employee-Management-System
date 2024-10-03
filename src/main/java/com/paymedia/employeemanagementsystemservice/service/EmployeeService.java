package com.paymedia.employeemanagementsystemservice.service;

import com.paymedia.employeemanagementsystemservice.entity.Employee;
import org.springframework.data.domain.Page;

public interface EmployeeService {
    Employee createEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    Employee updateEmployee(Long id, Employee employee);
    void deleteEmployee(Long id);
    Page<Employee> getAllEmployees(int page, int size, String[] sort, String departmentName);
}
