package com.vbt.factoryManagement.entities;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Employee {
    private long id;
    private String employeeNo;
    private String identityNo;
    private int groupNo;
    private AuthorityList authority;
    private BasicKnowledge basicKnowledge;
    @OneToMany(mappedBy = "employee")
    private Set<Request> requests;




}
