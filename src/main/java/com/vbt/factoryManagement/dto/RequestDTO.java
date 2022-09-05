package com.vbt.factoryManagement.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Getter
@NoArgsConstructor
public class RequestDTO {

    private int id;
    private int requestid;
    private String subject;
    private Date date;
    private String explanation;
    private boolean acceptance;
    private EmployeeDTO employeeDTO;


    public RequestDTO(Builder builder)
    {
        this.id = builder.id;
        this.acceptance = builder.acceptance;
        this.employeeDTO = builder.employeeDTO;
        this.date = builder.date;
        this.subject = builder.subject;
        this.explanation = builder.explanation;
        this.requestid = builder.requestid;
    }


    public static class Builder
    {
        private int id;
        private int requestid;
        private String subject;
        private Date date;
        private String explanation;
        private boolean acceptance;
        private EmployeeDTO employeeDTO;

        public Builder(){}

        public static Builder RequestDTOBuilderWith()
        {
            return new Builder();
        }

        public Builder id(int id){this.id = id; return this;}
        public Builder requestid(int requestid){this.requestid = requestid; return this;}
        public Builder subject(String subject){this.subject = subject; return this;}
        public Builder date(Date date){this.date = date; return this;}
        public Builder explanation(String explanation){this.explanation = explanation; return this;}
        public Builder acceptance(Boolean acceptance){this.acceptance = acceptance; return this;}
        public Builder employeeDTO(EmployeeDTO employeeDTO){this.employeeDTO = employeeDTO; return this;}

        public RequestDTO build()
        {
            return new RequestDTO(this);
        }

    }


}