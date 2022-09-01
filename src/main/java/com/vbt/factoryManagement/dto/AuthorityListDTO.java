package com.vbt.factoryManagement.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AuthorityListDTO {

    private long id;
    private String authorityName;
    private Set<EmployeeDTO> employeeDTOSet;

    public AuthorityListDTO(Builder builder)
    {
        this.id = builder.id;
        this.authorityName= builder.authorityName;
        this.employeeDTOSet=builder.employeeDTOSet;
    }

    public String getAuthorityName() {
        return authorityName;
    }


    public static class Builder
    {
        private long id;
        private String authorityName;
        private Set<EmployeeDTO> employeeDTOSet;

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

        public Builder employeeDTOSet(Set<EmployeeDTO> employeeDTOSet)
        {
            this.employeeDTOSet = employeeDTOSet;
            return this;
        }
        public AuthorityListDTO build()
        {
            return new AuthorityListDTO(this);
        }
    }

}
