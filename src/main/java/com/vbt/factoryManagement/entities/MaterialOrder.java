package com.vbt.factoryManagement.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Getter
@NoArgsConstructor
@Setter
@Entity
@Table(name = "materialOrder")
public class MaterialOrder {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String orderNo;

    @OneToOne(cascade = CascadeType.MERGE,targetEntity = com.vbt.factoryManagement.entities.Material.class)
    @JoinColumn(name = "material_id")
    private Material material;

    @OneToOne(cascade = CascadeType.MERGE,targetEntity = com.vbt.factoryManagement.entities.OrderCompanies.class)
    @JoinColumn(name = "orderCompanies_id")
    private OrderCompanies orderCompanies;

}
