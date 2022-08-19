package com.vbt.factoryManagement.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employee extends BasicKnowledge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    private String employeeNo;
    private String identityNo;
    private int groupNo;

    @ManyToOne(targetEntity = com.vbt.factoryManagement.entities.AuthorityList.class)
    @JoinColumn(name = "authority_id")
    private AuthorityList authority;

    @OneToMany(mappedBy = "employee")
    private Set<Request> requests;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;



//    public Employee(String firstname, String lastname, String eMail, String phoneNumber, String adress) {
//        super(firstname, lastname, eMail, phoneNumber, adress);
//    }
//
//
//    public Employee(String firstname, String lastname, String eMail, String phoneNumber, String adress,String employeeNo
//            , String identityNo, Department department,long id, int groupNo,AuthorityList authorityList ) {
//        super(firstname, lastname, eMail, phoneNumber, adress);
//
//        this.employeeNo = employeeNo;
//        this.id = id;
//        this.authority = authorityList;
//        this.department = department;
//        this.groupNo = groupNo;
//        this.identityNo = identityNo;
//    }

}
