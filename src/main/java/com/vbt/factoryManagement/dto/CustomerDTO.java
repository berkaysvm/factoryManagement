package com.vbt.factoryManagement.dto;

import lombok.Getter;

import javax.persistence.*;
import java.util.Set;

@Getter
@MappedSuperclass
public class CustomerDTO {

    private long id;
    private long customerNo;
    private String companyName;
    private Set<ProductOrderListDTO> productOrderLists;
    private String firstname;
    private String lastname;
    private String eMail;
    private String phoneNumber;
    private String adress;

    public CustomerDTO() {
    }

    public CustomerDTO(Builder builder) {
        this.id = builder.id;
        this.customerNo = builder.customerNo;
        this.companyName = builder.companyName;
        this.productOrderLists = builder.productOrderLists;
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.eMail = builder.eMail;
        this.phoneNumber = builder.phoneNumber;
        this.adress = builder.adress;

    }


    public static class Builder {
        private long id;
        private long customerNo;
        private String companyName;
        private Set<ProductOrderListDTO> productOrderLists;
        private String firstname;
        private String lastname;
        private String eMail;
        private String phoneNumber;
        private String adress;


        public Builder() {
        }

        public static Builder CustomDTOBuilderWith() {
            return new Builder();
        }

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder customerNo(Long customerNo) {
            this.customerNo = customerNo;
            return this;
        }

        public Builder companyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        public Builder productOrderLists(Set<ProductOrderListDTO> productOrderLists) {
            this.productOrderLists = productOrderLists;
            return this;
        }

        public Builder firstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder lastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder eMail(String eMail) {
            this.eMail = eMail;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder adress(String adress) {
            this.adress = adress;
            return this;
        }

        public CustomerDTO build() {
            return new CustomerDTO(this);
        }


    }
}
