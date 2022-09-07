package com.vbt.factoryManagement.dto;

import com.vbt.factoryManagement.entities.Material;
import com.vbt.factoryManagement.entities.OrderCompanies;
import com.vbt.factoryManagement.mapper.MaterialMapper;
import com.vbt.factoryManagement.mapper.OrderCompaniesMapper;
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

        public static Builder OrderMaterialRelationalDTOBuilderWith()
        {
            return new Builder();
        }

        public Builder id(int id){this.id = id; return this;}
        public Builder orderCompanies(OrderCompanies orderCompanies){
            OrderCompaniesMapper orderCompaniesMapper = new OrderCompaniesMapper();
            this.orderCompanies = orderCompaniesMapper.map2(orderCompanies);
            return this;}
        public Builder material(Material material){
            MaterialMapper materialMapper = new MaterialMapper();

            this.material = materialMapper.map2(material);
            return this;
        }

        public OrderMaterialRelationalDTO build()
        {
            return new OrderMaterialRelationalDTO(this);
        }
    }
}
