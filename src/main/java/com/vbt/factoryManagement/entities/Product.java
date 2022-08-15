package com.vbt.factoryManagement.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private String productName;
    private String productColour;
    private int productStock;
    private int productCost;
    @OneToMany(mappedBy = "product")
    private Set<MaterialProduct> materialProducts;
}
