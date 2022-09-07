package com.vbt.factoryManagement.dto;

import com.vbt.factoryManagement.entities.Material;
import com.vbt.factoryManagement.entities.OrderCompanies;
import com.vbt.factoryManagement.mapper.MaterialMapper;
import com.vbt.factoryManagement.mapper.MaterialOrderMapper;
import lombok.Getter;

import javax.persistence.*;

@Getter
public class MaterialOrderDTO {

    private int id;
    private String orderNo;
    private MaterialDTO material;
    private OrderCompaniesDTO orderCompanies;


    public MaterialOrderDTO(){}
    public MaterialOrderDTO(Builder builder){

        this.id = builder.id;
        this.orderNo = builder.orderNo;
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

        public static Builder MaterialOrderDTOBuilderWith()
        {
            return new Builder();
        }

        public Builder id(int id){this.id = id; return this;}
        public Builder orderNo(String orderNo){this.orderNo = orderNo; return this;}
        public Builder material(Material material){
            MaterialMapper moMapper = new MaterialMapper();
            this.material = moMapper.map3(material);
            return this;}
        public Builder orderCompanies(OrderCompaniesDTO orderCompanies){ this.orderCompanies = orderCompanies; return this;}

        public MaterialOrderDTO build()
        {
            return new MaterialOrderDTO(this);
        }

    }

}
