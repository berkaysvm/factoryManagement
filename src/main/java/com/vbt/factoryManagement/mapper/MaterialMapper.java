package com.vbt.factoryManagement.mapper;

import com.vbt.factoryManagement.dto.MaterialDTO;
import com.vbt.factoryManagement.dto.MaterialProductDTO;
import com.vbt.factoryManagement.dto.OrderMaterialRelationalDTO;
import com.vbt.factoryManagement.dto.ProductOrderListDTO;
import com.vbt.factoryManagement.entities.*;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class MaterialMapper {
    public MaterialDTO map(Material material)
    {
        MaterialProductMapper materialProductMapper = new MaterialProductMapper();
        OrderMaterialRelationalMapper orderMaterialRelationalMapper = new OrderMaterialRelationalMapper();
        Set<MaterialProduct> materialProducts = material.getMaterialProducts();
        Set<MaterialProductDTO> materialProductDTOS = materialProducts.stream().map(materialProductMapper::map).collect(Collectors.toSet());

        Set<OrderMaterialRelational> orderMaterialRelationals = material.getOrderMaterials();
        Set<OrderMaterialRelationalDTO> orderMaterialRelationalDTOS = orderMaterialRelationals.stream().map(orderMaterialRelationalMapper::map).collect(Collectors.toSet());


        return MaterialDTO.Builder.MaterialDTOBuilderWith()
                .id(material.getId())
                .materialNo(material.getMaterialNo())
                .materialColour(material.getMaterialColour())
                .materialCost(material.getMaterialCost())
                .materialProducts(materialProductDTOS)
                .materialStock(material.getMaterialStock())
                .image(material.getImage())
                .orderMaterials(orderMaterialRelationalDTOS)
                .build();


    }
    public MaterialDTO map3(Material material)
    {
        MaterialProductMapper materialProductMapper = new MaterialProductMapper();
        OrderMaterialRelationalMapper orderMaterialRelationalMapper = new OrderMaterialRelationalMapper();
        Set<MaterialProduct> materialProducts = material.getMaterialProducts();
        Set<MaterialProductDTO> materialProductDTOS = materialProducts.stream().map(materialProductMapper::map).collect(Collectors.toSet());

        Set<OrderMaterialRelational> orderMaterialRelationals = material.getOrderMaterials();
        Set<OrderMaterialRelationalDTO> orderMaterialRelationalDTOS = orderMaterialRelationals.stream().map(orderMaterialRelationalMapper::map).collect(Collectors.toSet());


        return MaterialDTO.Builder.MaterialDTOBuilderWith()
                .id(material.getId())
                .materialNo(material.getMaterialNo())
                .materialColour(material.getMaterialColour())
                .materialCost(material.getMaterialCost())
                .materialStock(material.getMaterialStock())
                .image(material.getImage())
                .build();


    }
    public MaterialDTO map2(Material material)
    {
        return MaterialDTO.Builder.MaterialDTOBuilderWith()
                .id(material.getId())
                .materialNo(material.getMaterialNo())
                .materialColour(material.getMaterialColour())
                .materialCost(material.getMaterialCost())
                .materialStock(material.getMaterialStock())
                .image(material.getImage())
                .build();


    }


    public Material convertEntity(MaterialDTO materialDTO)
    {
        Material material = new Material();
        material.setId(materialDTO.getId());
        material.setMaterialNo(materialDTO.getMaterialNo());
        material.setMaterialColour(materialDTO.getMaterialColour());
        material.setMaterialCost(materialDTO.getMaterialCost());
        material.setMaterialStock(materialDTO.getMaterialStock());
        material.setImage(materialDTO.getImage());
        return material;
    }
    public Material convertEntity2(MaterialDTO materialDTO)
    {
        Material material = new Material();
        material.setMaterialNo(materialDTO.getMaterialNo());
        material.setId(materialDTO.getId());
        material.setMaterialColour(materialDTO.getMaterialColour());
        material.setMaterialCost(materialDTO.getMaterialCost());
        material.setMaterialStock(materialDTO.getMaterialStock());
        material.setImage(materialDTO.getImage());
        return material;
    }


    public Material convertEntityNo(MaterialDTO materialDTO)
    {
        Material material = new Material();
        material.setMaterialNo(materialDTO.getMaterialNo());
        return  material;
    }
}
