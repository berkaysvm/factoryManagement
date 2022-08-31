package com.vbt.factoryManagement.mapper;

import com.vbt.factoryManagement.dto.OrderMaterialRelationalDTO;
import com.vbt.factoryManagement.entities.Material;
import com.vbt.factoryManagement.entities.OrderMaterialRelational;
import org.hibernate.annotations.Cache;
import org.springframework.stereotype.Component;

@Component
public class OrderMaterialRelationalMapper {

     static OrderCompaniesMapper orderCompaniesMappers = new OrderCompaniesMapper();
     static MaterialMapper materialMapper = new MaterialMapper();
    public OrderMaterialRelationalDTO map(OrderMaterialRelational orderMaterialRelational) {
        return OrderMaterialRelationalDTO.Builder.
                OrderMaterialRelationalDTOBuilderWith()
                .id(orderMaterialRelational.getId())
                .orderCompanies( orderCompaniesMappers.map(orderMaterialRelational.getOrderCompanies()))
                .material( materialMapper.map(orderMaterialRelational.getMaterial())).build();

    }
    public OrderMaterialRelational convertEntity(OrderMaterialRelationalDTO orderMaterialRelationalDTO)
    {
        MaterialMapper materialMapper = new MaterialMapper();

        OrderMaterialRelational orderMaterialRelational = new OrderMaterialRelational();
        orderMaterialRelational.setMaterial( materialMapper.convertEntity(orderMaterialRelationalDTO.getMaterial()));
        orderMaterialRelational.setId(orderMaterialRelationalDTO.getId());
        return orderMaterialRelational;

    }
}
