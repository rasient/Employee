package com.alextest.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alextest.employee.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}