package com.vbt.factoryManagement.mapper;

import com.vbt.factoryManagement.dto.MaterialOrderDTO;
import com.vbt.factoryManagement.dto.OrderCompaniesDTO;
import com.vbt.factoryManagement.dto.OrderMaterialRelationalDTO;
import com.vbt.factoryManagement.entities.MaterialOrder;
import com.vbt.factoryManagement.entities.OrderCompanies;
import com.vbt.factoryManagement.entities.OrderMaterialRelational;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class OrderCompaniesMapper {
    public OrderCompaniesDTO map(OrderCompanies orderCompanies)
    {
        Set<OrderMaterialRelational> orderCompanies1 = orderCompanies.getOrderMaterials();
        Set<OrderMaterialRelationalDTO> orderMaterialRelationalDTOS = orderCompanies1.stream().map(OrderMaterialRelationalMapper::map).collect(Collectors.toSet());

        Set<MaterialOrder> materialOrders = orderCompanies.getMaterialOrders();
        Set<MaterialOrderDTO> materialOrderDTOS = materialOrders.stream().map(MaterialOrderMapper::map).collect(Collectors.toSet());
        return OrderCompaniesDTO.Builder.OrderCompaniesDTOBuilderWith()
                .id(orderCompanies.getId())
                .orderCompaniesName(orderCompanies.getOrderCompaniesName())
                .orderMaterials(orderMaterialRelationalDTOS)
                .materialOrder(materialOrderDTOS).build();
    }

    public OrderCompanies convertEntity(OrderCompaniesDTO orderCompaniesDTO)
    {
        OrderCompanies orderCompanies = new OrderCompanies();
        orderCompanies.setOrderCompaniesName(orderCompaniesDTO.getOrderCompaniesName());
        orderCompanies.setId(orderCompaniesDTO.getId());
        return orderCompanies;

    }

}
