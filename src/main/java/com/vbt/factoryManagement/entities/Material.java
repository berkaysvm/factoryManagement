package com.vbt.factoryManagement.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "materials")
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    private String materialNo;
    private String materialColour;
    private Long materialStock;
    private int materialCost;
    private String image;
    @OneToMany(mappedBy = "material")
    private Set<MaterialProduct> materialProducts;
    @OneToMany(mappedBy = "material")
    private Set<OrderMaterialRelational> orderMaterials;



}
