package com.vbt.factoryManagement.dto;

import com.vbt.factoryManagement.entities.OrderCompanies;
import lombok.Getter;

import javax.persistence.*;

@Getter
public class MaterialOrderDTO {

    private int id;
    private String OrderNo;
    private MaterialDTO material;
    private OrderCompaniesDTO orderCompanies;


    public MaterialOrderDTO(){}
    public MaterialOrderDTO(Builder builder){

        this.id = builder.id;
        this.OrderNo = builder.orderNo;
        this.material = builder.material;
        this.orderCompanies = builder.orderCompanies;
    }



    public static class Builder
    {
        private int id;
        private String orderNo;
        private MaterialDTO material;
        private OrderCompaniesDTO orderCompanies;

        public Builder(){}

        public Builder MaterialOrderDTOBuilderWith()
        {
            return new Builder();
        }

        public Builder id(int id){this.id=id; return this;}
        public Builder orderNo(String orderNo){this.orderNo = orderNo; return this;}
        public Builder material(MaterialDTO material){this.material = material; return this;}
        public Builder orderCompanies(OrderCompaniesDTO orderCompanies){ this.orderCompanies = orderCompanies; return this;}

        public MaterialOrderDTO build()
        {
            return new MaterialOrderDTO(this);
        }

    }

}
