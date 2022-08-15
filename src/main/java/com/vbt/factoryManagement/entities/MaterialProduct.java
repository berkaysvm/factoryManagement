package com.vbt.factoryManagement.entities;

import javax.persistence.*;
@Entity
public class MaterialProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;
    @ManyToOne
    @JoinColumn(name = "material_id")
    private Material material;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private int quantity;

}
