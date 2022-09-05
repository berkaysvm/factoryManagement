package com.vbt.factoryManagement.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.util.Set;
@Getter
@NoArgsConstructor
@Setter
@Entity
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    private String departmentName;
    @OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
    private Set<Employee> employees;
}
