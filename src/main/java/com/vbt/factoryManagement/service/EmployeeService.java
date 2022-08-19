package com.vbt.factoryManagement.service;

import com.vbt.factoryManagement.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {

    String save(EmployeeDTO employeeDTO);
    EmployeeDTO getById(long id);
    String delete(long id);
    List<EmployeeDTO> gelAll();

}
