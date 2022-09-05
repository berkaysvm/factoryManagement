package com.vbt.factoryManagement.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@NoArgsConstructor
@Table(name = "products")
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private String productName;
    private String productColour;
    private int productStock;
    private int productCost;
    @OneToMany(mappedBy = "product",cascade =CascadeType.MERGE)
    private Set<MaterialProduct> materialProducts;
}
