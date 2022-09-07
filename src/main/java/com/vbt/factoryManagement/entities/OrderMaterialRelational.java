package com.vbt.factoryManagement.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "order_material_relational")
public class OrderMaterialRelational {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @ManyToOne(cascade = CascadeType.PERSIST,targetEntity = com.vbt.factoryManagement.entities.OrderCompanies.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "orderCompanies_id")
    OrderCompanies orderCompanies;
    @ManyToOne(cascade = CascadeType.MERGE ,targetEntity = com.vbt.factoryManagement.entities.Material.class,fetch = FetchType.LAZY)
    @JoinColumn(name = "material_id")
    Material material;
}
