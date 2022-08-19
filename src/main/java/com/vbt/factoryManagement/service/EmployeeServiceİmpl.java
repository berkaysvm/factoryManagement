package com.vbt.factoryManagement.service;

import com.vbt.factoryManagement.dto.EmployeeDTO;
import com.vbt.factoryManagement.entities.Employee;
import com.vbt.factoryManagement.mapper.EmployeeMapper;
import com.vbt.factoryManagement.repository.EmployeeRepository;

import java.util.List;

public class EmployeeServiceİmpl implements EmployeeService {

    EmployeeMapper employeeMapper;
    EmployeeRepository employeeRepository;

    public EmployeeServiceİmpl(EmployeeRepository employeeRepository , EmployeeMapper employeeMapper)
    {
        this.employeeMapper = employeeMapper;
        this.employeeRepository = employeeRepository;
    }


    @Override
    public String save(EmployeeDTO employeeDTO) {
        employeeRepository.save(employeeMapper.convertEntity(employeeDTO));
        return "Save Complete";
    }

    @Override
    public EmployeeDTO getById(long id) {
        return employeeMapper.map(employeeRepository.getReferenceById(id));
    }

    @Override
    public String delete(long id) {
        return "Delete is complete";
    }

    @Override
    public List<EmployeeDTO> gelAll() {
        return  employeeMapper.maplist(employeeRepository.findAll());
    }
}
