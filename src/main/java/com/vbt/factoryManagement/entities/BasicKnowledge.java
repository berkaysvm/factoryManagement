package com.vbt.factoryManagement.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "basicKnowledge")
public class BasicKnowledge {
    private String firstname;
    private String lastname;
    private String eMail;
    private String phoneNumber;
    private String adress;

}
