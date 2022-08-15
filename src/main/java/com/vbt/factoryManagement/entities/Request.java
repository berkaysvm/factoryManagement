package com.vbt.factoryManagement.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "requests")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
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