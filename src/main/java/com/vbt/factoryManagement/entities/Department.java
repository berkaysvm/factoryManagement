package com.vbt.factoryManagement.entities;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.util.Set;
@Getter
@Setter
@Entity
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private String departmentName;
    @OneToMany(mappedBy = "department")
    private Set<Employee> employees;
}
