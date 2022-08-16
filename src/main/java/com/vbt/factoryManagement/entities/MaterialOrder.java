package com.vbt.factoryManagement.entities;

import javax.persistence.*;

@Entity
@Table(name = "materialOrder")
public class MaterialOrder {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String orderNo;

    @OneToOne
    @JoinColumn(name = "material_id")
    private Material material;

    @OneToOne
    @JoinColumn(name = "orderCompanies_id")
    private OrderCompanies orderCompanies;

}
