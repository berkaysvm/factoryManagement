package com.vbt.factoryManagement.dto;

import com.vbt.factoryManagement.entities.Material;
import lombok.Getter;

import javax.persistence.*;
import java.util.Set;

@Getter
public class MaterialDTO {

    private long id;
    private String materialNo;
    private String materialColour;
    private Long materialStock;
    private int materialCost;
    private String image;
    //private Set<MaterialProductDTO> materialProducts;
    private Set<OrderMaterialRelationalDTO> orderMaterials;

    public MaterialDTO(){}

    public MaterialDTO(Builder builder){

        this.id = builder.id;
        this.materialNo = builder.materialNo;
        this.materialColour = builder.materialColour;
        this.materialStock = builder.materialStock;
        this.materialCost = builder.materialCost;
        this.image = builder.image;
        //this.materialProducts = builder.materialProducts;
        this.orderMaterials = builder.orderMaterials;
    }


    public static class Builder
    {
        private long id;
        private String materialNo;
        private String materialColour;
        private Long materialStock;
        private int materialCost;
        private String image;
        private Set<MaterialProductDTO> materialProducts;
        private Set<OrderMaterialRelationalDTO> orderMaterials;

        public Builder(){}

        public static Builder MaterialDTOBuilderWith()
        {
            return new Builder();
        }

        public Builder id(Long id){this.id = id; return this;}
        public Builder materialNo(String materialNo){this.materialNo = materialNo; return this;}
        public Builder materialColour(String materialColour){this.materialColour = materialColour; return this;}
        public Builder materialStock(Long materialStock){this.materialStock = materialStock; return this;}
        public Builder materialCost(int materialCost){this.materialCost = materialCost; return this;}
        public Builder image(String image){ this.image = image ; return this;}
        public Builder materialProducts(Set<MaterialProductDTO> materialProducts){this.materialProducts = materialProducts; return this;}
        public Builder orderMaterials(Set<OrderMaterialRelationalDTO> orderMaterials){this.orderMaterials = orderMaterials; return this;}

        public MaterialDTO build()
        {
            return new MaterialDTO(this);
        }



    }



}
