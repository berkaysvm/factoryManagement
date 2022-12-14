package com.vbt.factoryManagement.mapper;

import com.vbt.factoryManagement.dto.EmployeeDTO;
import com.vbt.factoryManagement.dto.RequestDTO;
import com.vbt.factoryManagement.entities.Employee;
import com.vbt.factoryManagement.entities.Request;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class EmployeeMapper {


    public List<EmployeeDTO> plist(List<Employee> employeeList)
    {

        List<EmployeeDTO> returnList =new ArrayList<>();
        for (Employee employee : employeeList)

        {
         returnList.add(map(employee));
        }


        return returnList;
    }

    public EmployeeDTO map(Employee employee)
        {

            RequestMapper requestMapper = new RequestMapper();
            Set<Request> requestSet = employee.getRequests();
            Set<RequestDTO> requestDTOS = requestSet.stream().map(requestMapper::map2).collect(Collectors.toSet());

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
                    //authorityListDTO(authorityMapper.map(employee.getAuthority()))
                    .requestsDTO(requestDTOS)
                    .build();
        }

    public Employee convertEntity (EmployeeDTO employeeDTO)
            {
                AuthorityMapper authorityMapper = new  AuthorityMapper();
                DepartmentMapper departmentMapper = new DepartmentMapper();
                Employee employee = new Employee();

                employee.setEmployeeNo(employeeDTO.getEmployeeNo());
                employee.setAuthority( authorityMapper.convertEntitiy(employeeDTO.getAuthorityListDTO()));
                employee.setGroupNo(employeeDTO.getGroupNo());
                employee.setDepartment(departmentMapper.convertEntity(employeeDTO.getDepartmentDTO()));
                employee.setIdentityNo(employeeDTO.getIdentityNo());
                employee.setAdress(employeeDTO.getAdress());
                employee.setEMail(employeeDTO.getEmail());
                employee.setFirstname(employeeDTO.getFirstname());
                employee.setLastname(employeeDTO.getLastname());
                employee.setPhoneNumber(employeeDTO.getPhoneNumber());
               return employee;
            }


}
