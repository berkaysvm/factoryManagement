package com.vbt.factoryManagement.repository;

import com.vbt.factoryManagement.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Jpa21Utils;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
