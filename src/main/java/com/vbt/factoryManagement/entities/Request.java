package com.vbt.factoryManagement.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Request {
    private int id;
    private int requestid;
    private String subject;
    private Date date;
    private String explanation;
    private boolean acceptance;

    @ManyToOne
    @JoinColumn(name = "employee_no")
    private Employee employee;

}