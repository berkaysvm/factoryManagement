package com.vbt.factoryManagement.entities;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "orderCompanies")
public class OrderCompanies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    private String orderCompaniesName;

    @OneToMany (mappedBy = "orderCompanies")
    private Set<OrderMaterialRelational> orderMaterials;
    @OneToMany(mappedBy = "orderCompanies")
    private Set<MaterialOrder> materialOrders;
}
