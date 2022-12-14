package com.vbt.factoryManagement.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "material_product")
public class MaterialProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;
    @ManyToOne(cascade = CascadeType.MERGE,targetEntity = com.vbt.factoryManagement.entities.Material.class)
    @JoinColumn(name = "material_id")
    private Material material;

    @ManyToOne(cascade = CascadeType.MERGE,targetEntity = com.vbt.factoryManagement.entities.Product.class)
    @JoinColumn(name = "product_id")
    private Product product;

    private int quantity;

}
