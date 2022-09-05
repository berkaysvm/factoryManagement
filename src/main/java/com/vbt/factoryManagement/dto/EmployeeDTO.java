package com.vbt.factoryManagement.dto;


import lombok.Getter;
import javax.persistence.*;
import java.util.Set;

@Getter
@MappedSuperclass
public class EmployeeDTO {

    private long id;
    private String employeeNo;
    private String identityNo;
    private int groupNo;
    private AuthorityListDTO authorityListDTO;
    private Set<RequestDTO> requestsDTO;
    private DepartmentDTO departmentDTO;
    private String firstname;
    private String lastname;
    private String eMail;
    private String phoneNumber;
    private String adress;

    public EmployeeDTO() {
    }
    public EmployeeDTO(Builder builder)
    {


        this.id = builder.id;
        this.employeeNo = builder.employeeNo;
        this.identityNo = builder.identityNo;
        this.groupNo = builder.groupNo;
        this.authorityListDTO = builder.authorityListDTO;
        this.requestsDTO = builder.requestsDTO;
        this.departmentDTO = builder.departmentDTO;
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.eMail = builder.eMail;
        this.phoneNumber = builder.phoneNumber;
        this.adress = builder.adress;


    }


    public void EmloyeeDto() {}

    public static class Builder
    {
        private long id;
        private String employeeNo;
        private String identityNo;
        private int groupNo;
        private AuthorityListDTO authorityListDTO;
        private Set<RequestDTO> requestsDTO;
        private DepartmentDTO departmentDTO;
        private String firstname;
        private String lastname;
        private String eMail;
        private String phoneNumber;
        private String adress;


        public Builder(){}



        public static Builder EmloyeeBuilderWith()
        {
            return new Builder();
        }


        public Builder id(Long id) {this.id = id; return this;}
        public Builder employeeNo(String employeeNo){this.employeeNo= employeeNo; return this;}
        public Builder identitiyNo(String identityNo){this.identityNo = identityNo; return this;}
        public Builder groupNo(int groupNo){this.groupNo = groupNo; return this;}
        public Builder authorityListDTO(AuthorityListDTO authorityListDTO){this.authorityListDTO = authorityListDTO; return this;}
        public Builder requestsDTO(Set<RequestDTO> requestsDTO){this.requestsDTO = requestsDTO; return this;}
        public Builder departmentDTO(DepartmentDTO departmentDTO){ this.departmentDTO = departmentDTO; return this;}
        public Builder firstname(String firstname){this.firstname= firstname; return this;}
        public Builder lastname(String lastname){this.lastname =lastname; return this;}
        public Builder eMail(String eMail){ this.eMail = eMail; return  this;}
        public Builder phoneNumber(String phoneNumber){this.phoneNumber = phoneNumber; return this;}
        public Builder adress(String adress) {this.adress = adress; return  this;}

        public EmployeeDTO build()
        {
            return new EmployeeDTO(this);
        }


    }
}
