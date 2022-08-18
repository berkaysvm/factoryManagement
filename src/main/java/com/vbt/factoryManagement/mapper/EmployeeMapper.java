package com.vbt.factoryManagement.mapper;

import com.vbt.factoryManagement.dto.EmployeeDTO;
import com.vbt.factoryManagement.dto.RequestDTO;
import com.vbt.factoryManagement.entities.Employee;
import com.vbt.factoryManagement.entities.Request;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class EmployeeMapper {
    AuthorityMapper authorityMapper = new AuthorityMapper();
    DepartmentMapper departmentMapper = new DepartmentMapper();

    public static EmployeeDTO map(Employee employee)
        {
            Set<Request> requestSet = employee.getRequests();
            Set<RequestDTO> requestDTOS = requestSet.stream().map(RequestMapper::map).collect(Collectors.toSet());
            AuthorityMapper authorityMapper = new  AuthorityMapper();
            return EmployeeDTO.Builder.EmloyeeBuilderWith()
                    .id(employee.getId())
                    .adress(employee.getAdress())
                    .employeeNo(employee.getEmployeeNo())
                    .eMail(employee.getEMail())
                    .firstname(employee.getFirstname())
                    .lastname(employee.getLastname())
                    .phoneNumber(employee.getPhoneNumber())
                    .groupNo(employee.getGroupNo())
                    .identitiyNo(employee.getIdentityNo())
                     .authorityListDTO(authorityMapper.map(employee.getAuthority()))
                    .requestsDTO(requestDTOS)
                    .build();
        }

//    public Employee convertEntity (EmployeeDTO employeeDTO)
//            {
//                Employee employee = new Employee(employeeDTO.getEmployeeNo(),employeeDTO.getLastname(),employeeDTO.getEMail(),
//                        employeeDTO.getPhoneNumber(), employeeDTO.getAdress(), employeeDTO.getEmployeeNo(), employeeDTO.getIdentityNo(), employeeDTO.getRequestsDTO()
//                        ,departmentMapper.convertEntity(employeeDTO.getDepartmentDTO()), employeeDTO.getId(),employeeDTO.getGroupNo(), authorityMapper.convertEntitiy(employeeDTO.getAuthorityListDTO()));
//               return employee;
//            }
}
