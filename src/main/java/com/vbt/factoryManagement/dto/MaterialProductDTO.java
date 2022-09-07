package com.vbt.factoryManagement.dto;

import com.vbt.factoryManagement.entities.Material;
import com.vbt.factoryManagement.entities.Product;
import com.vbt.factoryManagement.mapper.MaterialMapper;
import com.vbt.factoryManagement.mapper.ProductMapper;
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

        public static Builder MaterialProductDTOBuilderWith()
        {
            return new Builder();
        }
        public Builder id(int id){this.id = id; return this;}
        public Builder material(Material material){
            MaterialMapper materialMapper = new MaterialMapper();
            this.material = materialMapper.map2(material);
            return this;}
        public Builder product(Product product){
            ProductMapper productMapper = new ProductMapper();

            this.product =productMapper.map(product); return this;}
        public Builder quantity(int quantity){this.quantity = quantity; return this;}

        public MaterialProductDTO build()
        {
            return new MaterialProductDTO(this);
        }
    }
}
