package com.vbt.factoryManagement.dto;


import lombok.Getter;

import javax.persistence.*;
import java.security.PublicKey;
import java.util.Set;

@Getter
public class OrderCompaniesDTO {


    private int id;
    private String orderCompaniesName;
    private Set<OrderMaterialRelationalDTO> orderMaterials;
    private Set<MaterialOrderDTO> materialOrders;

    public OrderCompaniesDTO(){}

    public OrderCompaniesDTO(Builder builder)
    {
        this.id = builder.id;
        this.materialOrders = builder.materialOrders;
        this.orderCompaniesName = builder.orderCompaniesName;
        this.orderMaterials = builder.orderMaterials;
    }


    public static class Builder
    {
        private int id;
        private String orderCompaniesName;
        private Set<OrderMaterialRelationalDTO> orderMaterials;
        private Set<MaterialOrderDTO> materialOrders;

        public Builder(){}

        public static Builder OrderCompaniesDTOBuilderWith()
        {
            return new Builder();
        }
        public Builder id(int id){this.id = id; return this;}
        public Builder orderCompaniesName(String orderCompaniesName){this.orderCompaniesName = orderCompaniesName; return this;}
        public Builder orderMaterials(Set<OrderMaterialRelationalDTO> orderMaterials){this.orderMaterials = orderMaterials; return this;}
        public Builder materialOrder(Set<MaterialOrderDTO> materialOrders){this.materialOrders = materialOrders; return this;}

        public OrderCompaniesDTO build()
        {
            return new OrderCompaniesDTO(this);
        }
    }
}
