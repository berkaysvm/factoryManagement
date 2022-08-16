package com.vbt.factoryManagement.dto;

import lombok.Getter;

import javax.persistence.*;

@Getter
public class ProductOrderListDTO {

    private Long id;
    private ProductDTO productDTO;
    private CustomerDTO customerDTO;
    private int quantity;

    public ProductOrderListDTO(Builder builder)
    {
        this.id = builder.id;
        this.customerDTO = builder.customerDTO;
        this.productDTO = builder.productDTO;
        this.quantity = builder.quantity;

    }


    public static class Builder
    {
        private Long id;
        private ProductDTO productDTO;
        private CustomerDTO customerDTO;
        private int quantity;

        public Builder(){}

        public Builder ProductOrderListDTOBuilderWith()
        {
            return new Builder();
        }

        public Builder id(Long id){this.id = id; return this;}
        public Builder productDTO(ProductDTO productDTO){this.productDTO = productDTO; return this;}
        public Builder customerDTO(CustomerDTO customerDTO){this.customerDTO = customerDTO; return this;}
        public Builder quantity(int quantity){this.quantity = quantity; return this;}

        public ProductOrderListDTO build()
        {
            return new ProductOrderListDTO(this);
        }


    }
}
