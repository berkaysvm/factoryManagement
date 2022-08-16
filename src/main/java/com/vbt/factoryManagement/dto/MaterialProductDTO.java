package com.vbt.factoryManagement.dto;

import lombok.Getter;

import javax.persistence.*;
@Getter
public class MaterialProductDTO {

    private int id;
    private MaterialDTO material;
    private ProductDTO product;
    private int quantity;

    public MaterialProductDTO(){}
    public MaterialProductDTO(Builder builder)
    {
        this.id = builder.id;
        this.material = builder.material;
        this.product = builder.product;
        this.quantity = builder.quantity;
    }



    public static class Builder{
        private int id;
        private MaterialDTO material;
        private ProductDTO product;
        private int quantity;

        public Builder(){}

        public Builder MaterialProductDTOBuilderWith()
        {
            return new Builder();
        }
        public Builder id(int id){this.id = id; return this;}
        public Builder material(MaterialDTO material){this.material = material; return this;}
        public Builder product(ProductDTO product){this.product = product; return this;}
        public Builder quantity(int quantity){this.quantity = quantity; return this;}

        public MaterialProductDTO build()
        {
            return new MaterialProductDTO(this);
        }
    }
}
