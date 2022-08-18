package com.vbt.factoryManagement.repository;

import com.vbt.factoryManagement.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepostitory extends JpaRepository<Department,Integer> {
}
