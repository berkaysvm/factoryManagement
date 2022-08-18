package com.vbt.factoryManagement.dto;

import lombok.Getter;

import javax.persistence.*;
import java.util.Set;

@Getter
public class ProductDTO {

    private int id;
    private String productName;
    private String productColour;
    private int productStock;
    private int productCost;
    private Set<MaterialProductDTO> materialProductsDto;

    public ProductDTO(Builder builder)
    {
        this.id = builder.id;
        this.productColour = builder.productColour;
        this.materialProductsDto = builder.materialProductsDto;
        this.productCost = builder.productCost;
        this.productStock = builder.productStock;
        this.productName = builder.productName;
    }

    public static class Builder
    {
        private int id;
        private String productName;
        private String productColour;
        private int productStock;
        private int productCost;
        private Set<MaterialProductDTO> materialProductsDto;

        public Builder(){}
        public static Builder ProductDTOBuilderWith()
        {
            return new Builder();
        }

        public Builder id(int id){this.id = id; return this;}
        public Builder productName(String productName){this.productName = productName; return this;}
        public Builder productColour(String productColour){this.productColour = productColour; return this;}
        public Builder productStock(int productStock){this.productStock = productStock; return this;}
        public Builder productCost(int productCost) {this.productCost = productCost; return this;}
        public Builder materialProductsDto(Set<MaterialProductDTO> materialProductDto){this.materialProductsDto = materialProductDto; return this;}

        public ProductDTO build()
        {
            return new ProductDTO(this);
        }
    }
}
