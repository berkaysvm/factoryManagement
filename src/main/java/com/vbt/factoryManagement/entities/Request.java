package com.vbt.factoryManagement.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
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

    @ManyToOne(targetEntity = com.vbt.factoryManagement.entities.Employee.class)
    @JoinColumn(name = "employee_id")
    private Employee employee;

}