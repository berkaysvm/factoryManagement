package com.vbt.factoryManagement.service;

import com.vbt.factoryManagement.dto.DepartmentDTO;
import com.vbt.factoryManagement.entities.Department;

public interface DepartmentService  {

    DepartmentDTO save(DepartmentDTO departmentDTO);
    DepartmentDTO getbyid(int id);
    void delete(int id);
}
