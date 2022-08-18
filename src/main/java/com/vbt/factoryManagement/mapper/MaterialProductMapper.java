package com.vbt.factoryManagement.mapper;

import com.vbt.factoryManagement.dto.MaterialProductDTO;
import com.vbt.factoryManagement.entities.Material;
import com.vbt.factoryManagement.entities.MaterialProduct;
import org.springframework.stereotype.Component;

@Component
public class MaterialProductMapper {

    public static MaterialProductDTO map(MaterialProduct materialProduct)
    {
        MaterialMapper materialMapper = new MaterialMapper();
        ProductMapper productMapper = new ProductMapper();
        return MaterialProductDTO.Builder.MaterialProductDTOBuilderWith()
                .id(materialProduct.getId())
                .material(materialMapper.map(materialProduct.getMaterial()))
                .product(productMapper.map(materialProduct.getProduct()))
                .quantity(materialProduct.getQuantity()).build();
    }
    public static MaterialProduct convertEntity(MaterialProductDTO materialProductDTO)
    {
        MaterialProduct materialProduct = new MaterialProduct();
        materialProduct.setId(materialProduct.getId());
        materialProduct.setQuantity(materialProduct.getQuantity());
        materialProduct.setMaterial(materialProduct.getMaterial());
        materialProduct.setProduct(materialProduct.getProduct());
        return materialProduct;
    }
}
