package com.vbt.factoryManagement.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;
@Getter
@NoArgsConstructor
@Setter
@Entity

@Table(name = "customers")
public class Customer extends BasicKnowledge{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    private long customerNo;
    private String companyName;
    @OneToMany(mappedBy ="customer")
    //@JoinColumn(name = "product_order_lists_id", referencedColumName = "id")
    private Set<ProductOrderList> productOrderLists;

//    public Customer(String firstname, String lastname, String eMail, String phoneNumber, String adress) {
//        super(firstname, lastname, eMail, phoneNumber, adress);
//
//    }
//
    public Customer(String firstname, String lastname, String EMail, String phoneNumber, String adress, long id, long customerNo, String companyName, Set<ProductOrderList> productOrderLists) {
        super(firstname, lastname, EMail, phoneNumber, adress);
        this.id = id;
        this.customerNo = customerNo;
        this.companyName = companyName;
        this.productOrderLists = productOrderLists;
    }
}
