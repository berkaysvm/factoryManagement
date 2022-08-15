package com.vbt.factoryManagement.entities;

import javax.persistence.*;

@Entity
@Table(name = "productOrderList")
public class ProductOrderList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private int quantity;
}
