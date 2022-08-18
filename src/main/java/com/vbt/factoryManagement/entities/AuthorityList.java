package com.vbt.factoryManagement.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Getter
@NoArgsConstructor
@Setter
@Entity
@Table(name = "authorityList")
public class AuthorityList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    private String authorityName;

    @OneToMany(mappedBy = "authority_list",fetch = FetchType.LAZY)
    private Set<Employee> employees;
}
