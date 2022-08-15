package com.vbt.factoryManagement.entities;

import javax.persistence.*;

@Entity

public class OrderMaterialRelational {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "orderCompanies_id" )
    OrderCompanies orderCompanies;

    @ManyToOne
    @JoinColumn(name = "material_id")
    Material material;
}
