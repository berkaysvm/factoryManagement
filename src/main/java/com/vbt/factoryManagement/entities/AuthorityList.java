package com.vbt.factoryManagement.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name = "authorityList")
public class AuthorityList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    private String authorityName;
    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
