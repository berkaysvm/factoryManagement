package com.vbt.factoryManagement.mapper;

import com.vbt.factoryManagement.dto.DepartmentDTO;
import com.vbt.factoryManagement.dto.EmployeeDTO;
import com.vbt.factoryManagement.entities.Department;
import com.vbt.factoryManagement.entities.Employee;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class DepartmentMapper {
    public DepartmentDTO map(Department department)
    {
        Set<Employee> employee = department.getEmployees();
        Set<EmployeeDTO> employeeDTOS = employee.stream().map(EmployeeMapper::map).collect(Collectors.toSet());
        return DepartmentDTO.Builder.DepartmentDtoBuilderWith()
                .id(department.getId())
                .departmentName(department.getDepartmentName())
                .employeeDTOS(employeeDTOS)
                .build();
    }

    public static Department convertEntity(DepartmentDTO departmentDTO)
    {
        Department department = new Department();
        department.setDepartmentName(departmentDTO.getDepartmentName());
        return department;
    }
}
