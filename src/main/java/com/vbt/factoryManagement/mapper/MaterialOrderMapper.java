package com.vbt.factoryManagement.mapper;

import com.vbt.factoryManagement.dto.EmployeeDTO;
import com.vbt.factoryManagement.dto.MaterialOrderDTO;
import com.vbt.factoryManagement.entities.Employee;
import com.vbt.factoryManagement.entities.MaterialOrder;
import com.vbt.factoryManagement.repository.MaterialOrderRepository;
import com.vbt.factoryManagement.repository.MaterialRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MaterialOrderMapper {


    public MaterialOrderDTO map(MaterialOrder materialOrder)
    {
        OrderCompaniesMapper orderCompaniesMapper = new OrderCompaniesMapper();
        MaterialMapper materialMapper = new MaterialMapper();
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
        OrderCompaniesMapper orderCompaniesMapper= new OrderCompaniesMapper();
        MaterialOrder materialOrder = new MaterialOrder();
        materialOrder.setMaterial( materialMapper.convertEntity(materialOrderDTO.getMaterial()));
        materialOrder.setOrderCompanies(orderCompaniesMapper.convertEntity(materialOrderDTO.getOrderCompanies()));
        materialOrder.setOrderNo(materialOrderDTO.getOrderNo());
        return materialOrder;

    }
    public MaterialOrder convertEntity2 ( MaterialOrderDTO materialOrderDTO)
    {
//        MaterialRepository materialRepository = new MaterialRepository();
        MaterialMapper materialMapper = new MaterialMapper();
        OrderCompaniesMapper orderCompaniesMapper= new OrderCompaniesMapper();
        MaterialOrder materialOrder = new MaterialOrder();

        materialOrder.setId(materialOrderDTO.getId());
        materialOrder.setOrderNo(materialOrderDTO.getOrderNo());
        materialOrder.setMaterial(materialMapper.convertEntity2(materialOrderDTO.getMaterial()));
        //materialOrder.setMaterial(materialRepository.findById(materialOrderDTO.getMaterial().getId()));

        materialOrder.setOrderCompanies(orderCompaniesMapper.convertEntity(materialOrderDTO.getOrderCompanies()));

        return materialOrder;

    }

}
