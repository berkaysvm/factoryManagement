package com.vbt.factoryManagement.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@Entity
@Table(name = "materials")
@Getter
@Setter
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
    @OneToMany(mappedBy = "material",cascade = CascadeType.MERGE)
    private Set<MaterialProduct> materialProducts;
    @OneToMany(mappedBy = "material",cascade = CascadeType.MERGE)
    private Set<OrderMaterialRelational> orderMaterials;



}
