package com.vbt.factoryManagement.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class BasicKnowledge {
    private Long id;
    private String firstname;
    private String lastname;
    private String eMail;
    private String phoneNumber;
    private String adress;
}
