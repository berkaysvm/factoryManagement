package com.vbt.factoryManagement.dto;

import lombok.Getter;

import javax.persistence.*;
@Getter
public class AuthorityListDTO {

    private long id;
    private String authorityName;
    private EmployeeDTO employeeDTO;

    public void AuthorityListDTO() {}

    public AuthorityListDTO(Builder builder)
    {
        this.id = builder.id;
        this.authorityName= builder.authorityName;
        this.employeeDTO=builder.employeeDTO;
    }


    public static class Builder
    {
        private long id;
        private String authorityName;
        private EmployeeDTO employeeDTO;

        public Builder() {}

        public static Builder AuthorityBuilderWith()
        {
            return new Builder();
        }

        public Builder id(long id)
        {
            this.id = id;
            return this;
        }
        public Builder authorityName(String authorityName)
        {
            this.authorityName = authorityName;
            return this;
        }

        public Builder EmployeeDto (EmployeeDTO employeeDTO)
        {
            this.employeeDTO = employeeDTO;
            return this;
        }
        public AuthorityListDTO build()
        {
            return new AuthorityListDTO(this);
        }
    }

}
