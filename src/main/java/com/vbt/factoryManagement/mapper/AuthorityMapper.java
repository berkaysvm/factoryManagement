package com.vbt.factoryManagement.mapper;

import com.vbt.factoryManagement.dto.AuthorityListDTO;
import com.vbt.factoryManagement.dto.EmployeeDTO;
import com.vbt.factoryManagement.entities.AuthorityList;
import com.vbt.factoryManagement.entities.Employee;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class AuthorityMapper {

    public  AuthorityListDTO map(AuthorityList authorityList)
    {

        Set<Employee> employees = authorityList.getEmployees();
        Set<EmployeeDTO> employeeDTOS = employees.stream().map(EmployeeMapper::map).collect(Collectors.toSet());

        return AuthorityListDTO.Builder.AuthorityBuilderWith()
                .id(authorityList.getId())
                .authorityName(authorityList.getAuthorityName())
                .employeeDTOSet(employeeDTOS)
                .build();
    }

    public static AuthorityList convertEntitiy(AuthorityListDTO authorityListDTO)
    {
        AuthorityList authorityList =new AuthorityList();
        authorityList.setId(authorityListDTO.getId());
        authorityList.setAuthorityName(authorityListDTO.getAuthorityName());
        return authorityList;
    }
}
