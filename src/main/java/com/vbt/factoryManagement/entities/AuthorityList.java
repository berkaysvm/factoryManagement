package com.vbt.factoryManagement.entities;

import javax.persistence.*;

@Entity
@Table(name = "authorityList")
public class AuthorityList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    private String authorityName;
}
