package com.vbt.factoryManagement.mapper;

import com.vbt.factoryManagement.dto.MaterialOrderDTO;
import com.vbt.factoryManagement.dto.MaterialProductDTO;
import com.vbt.factoryManagement.entities.Material;
import com.vbt.factoryManagement.entities.MaterialOrder;
import com.vbt.factoryManagement.entities.MaterialProduct;
import com.vbt.factoryManagement.entities.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MaterialProductMapper {

    public MaterialProductDTO map(MaterialProduct materialProduct)
    {

        ProductMapper productMapper = new ProductMapper();
        return MaterialProductDTO.Builder.MaterialProductDTOBuilderWith()
                .id(materialProduct.getId())
                .material(materialProduct.getMaterial())
                .product(materialProduct.getProduct())
                .quantity(materialProduct.getQuantity())
                .build();
    }
    public List<MaterialProductDTO> maplist(List<MaterialProduct> materialProducts)
    {

        List<MaterialProductDTO> returnList =new ArrayList<>();
        for (MaterialProduct materialProduct: materialProducts)

        {
            returnList.add(map(materialProduct));
        }


        return returnList;
    }
    public MaterialProduct convertEntity(MaterialProductDTO materialProductDTO)
    {
        MaterialProduct materialProduct = new MaterialProduct();
        MaterialMapper materialMapper = new MaterialMapper();
        ProductMapper productMapper = new ProductMapper();
        materialProduct.setId(materialProductDTO.getId());
        materialProduct.setQuantity(materialProductDTO.getQuantity());
        materialProduct.setMaterial(materialMapper.convertEntity2(materialProductDTO.getMaterial()));
        materialProduct.setProduct(productMapper.convertEntity(materialProductDTO.getProduct()));
        return materialProduct;
    }
}
