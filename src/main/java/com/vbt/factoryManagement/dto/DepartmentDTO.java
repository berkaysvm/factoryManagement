package com.vbt.factoryManagement.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;
@Getter


public class DepartmentDTO {

    private int id;
    private String departmentName;
    private Set<EmployeeDTO> employeeDTOS;

    public DepartmentDTO(){}
    public DepartmentDTO(Builder builder)
    {
        this.id = builder.id;
        this.departmentName = builder.departmentName;
        this.employeeDTOS = builder.employeeDTOS;
    }


    public static class Builder
    {
        private int id;
        private String departmentName;
        private Set<EmployeeDTO> employeeDTOS;

        public Builder(){}

        public static Builder DepartmentDtoBuilderWith()
        {
            return new Builder();
        }

        public Builder id(int id){this.id= id; return this;}
        public Builder departmentName(String departmentName){this.departmentName = departmentName; return this;}
        public Builder employeeDTOS(Set<EmployeeDTO> employeeDTOS){this.employeeDTOS = employeeDTOS; return this;}

        public DepartmentDTO build()
        {
            return new DepartmentDTO(this);        }


    }
}
