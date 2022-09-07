package com.vbt.factoryManagement.mapper;

import com.vbt.factoryManagement.dto.OrderMaterialRelationalDTO;
import com.vbt.factoryManagement.entities.Material;
import com.vbt.factoryManagement.entities.OrderMaterialRelational;
import org.hibernate.annotations.Cache;
import org.springframework.stereotype.Component;

@Component
public class OrderMaterialRelationalMapper {


    public OrderMaterialRelationalDTO map(OrderMaterialRelational orderMaterialRelational) {
        OrderCompaniesMapper orderCompaniesMappers = new OrderCompaniesMapper();
        MaterialMapper materialMapper = new MaterialMapper();
        return OrderMaterialRelationalDTO.Builder.
                OrderMaterialRelationalDTOBuilderWith()
                .id(orderMaterialRelational.getId())
                .orderCompanies(orderMaterialRelational.getOrderCompanies())
                .material(orderMaterialRelational.getMaterial())
                .build();

    }
    public OrderMaterialRelational convertEntity(OrderMaterialRelationalDTO orderMaterialRelationalDTO)
    {
        MaterialMapper materialMapper = new MaterialMapper();
        OrderCompaniesMapper orderCompaniesMappers = new OrderCompaniesMapper();
        OrderMaterialRelational orderMaterialRelational = new OrderMaterialRelational();
        orderMaterialRelational.setOrderCompanies(orderCompaniesMappers.convertEntity(orderMaterialRelationalDTO.getOrderCompanies()));
        orderMaterialRelational.setMaterial( materialMapper.convertEntity(orderMaterialRelationalDTO.getMaterial()));
        orderMaterialRelational.setId(orderMaterialRelationalDTO.getId());
        return orderMaterialRelational;

    }
}
