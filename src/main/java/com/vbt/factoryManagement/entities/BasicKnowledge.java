package com.vbt.factoryManagement.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class BasicKnowledge {
    private String firstname;
    private String lastname;
    private String eMail;
    private String phoneNumber;
    private String adress;

}
