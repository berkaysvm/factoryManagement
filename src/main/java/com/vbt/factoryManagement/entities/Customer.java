package com.vbt.factoryManagement.entities;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer extends BasicKnowledge{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    private long customerNo;
    private String companyName;

    public Customer(String firstname, String lastname, String eMail, String phoneNumber, String adress) {
        super(firstname, lastname, eMail, phoneNumber, adress);
    }
}
