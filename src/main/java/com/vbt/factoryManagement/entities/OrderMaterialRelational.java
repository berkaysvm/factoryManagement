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
    @ManyToOne
    @JoinColumn(name = "orderCompanies_id" )
    OrderCompanies orderCompanies;
    @ManyToOne
    @JoinColumn(name = "material_id")
    Material material;
}
