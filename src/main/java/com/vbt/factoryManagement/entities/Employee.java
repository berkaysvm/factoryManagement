package com.vbt.factoryManagement.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "employees")
public class Employee extends BasicKnowledge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    private String employeeNo;
    private String identityNo;
    private int groupNo;
    private AuthorityList authority;
    @OneToMany(mappedBy = "employee")
    private Set<Request> requests;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;


    public Employee(String firstname, String lastname, String eMail, String phoneNumber, String adress) {
        super(firstname, lastname, eMail, phoneNumber, adress);
    }
}
