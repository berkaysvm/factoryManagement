package com.vbt.factoryManagement.dto;

import lombok.Getter;

import javax.persistence.*;


@Getter
public class OrderMaterialRelationalDTO {
    private int id;
    private OrderCompaniesDTO orderCompanies;
    private MaterialDTO material;


    public OrderMaterialRelationalDTO(){}
    public OrderMaterialRelationalDTO(Builder builder)
    {
        this.id=builder.id;
        this.material = builder.material;
        this.orderCompanies = builder.orderCompanies;
    }


    public static class Builder
    {
        private int id;
        private OrderCompaniesDTO orderCompanies;
        private MaterialDTO material;

        public Builder(){}

        public Builder OrderMaterialRelationalDTOBuilderWith()
        {
            return new Builder();
        }

        public Builder id(int id){this.id = id; return this;}
        public Builder orderCompanies(OrderCompaniesDTO orderCompanies){this.orderCompanies = orderCompanies; return this;}
        public Builder material(MaterialDTO material){this.material = material; return this;}

        public OrderMaterialRelationalDTO build()
        {
            return new OrderMaterialRelationalDTO(this);
        }
    }
}
