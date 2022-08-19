package com.vbt.factoryManagement.mapper;

import com.vbt.factoryManagement.dto.EmployeeDTO;
import com.vbt.factoryManagement.dto.MaterialOrderDTO;
import com.vbt.factoryManagement.entities.Employee;
import com.vbt.factoryManagement.entities.MaterialOrder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MaterialOrderMapper {
    static OrderCompaniesMapper orderCompaniesMapper = new OrderCompaniesMapper();
    static MaterialMapper materialMapper = new MaterialMapper();
    public static MaterialOrderDTO map(MaterialOrder materialOrder)
    {
        return MaterialOrderDTO.Builder.MaterialOrderDTOBuilderWith()
                .id(materialOrder.getId())
                .orderNo(materialOrder.getOrderNo())
                .orderCompanies(orderCompaniesMapper.map(materialOrder.getOrderCompanies()))
                .material(materialMapper.map(materialOrder.getMaterial()))
                .build();
    }
    public List<MaterialOrderDTO> maplist(List<MaterialOrder> materialOrderList)
    {

        List<MaterialOrderDTO> returnList =new ArrayList<>();
        for (MaterialOrder materialOrder : materialOrderList)

        {
            returnList.add(map(materialOrder));
        }


        return returnList;
    }

    public MaterialOrder convertEntity ( MaterialOrderDTO materialOrderDTO)
    {
        MaterialMapper materialMapper = new MaterialMapper();
        MaterialOrder materialOrder = new MaterialOrder();
        materialOrder.setMaterial( materialMapper.convertEntitiyNo(materialOrderDTO.getMaterial()));
        materialOrder.setOrderCompanies(materialOrder.getOrderCompanies());
        return materialOrder;

    }

}
