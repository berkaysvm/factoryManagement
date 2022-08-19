package com.vbt.factoryManagement.mapper;

import com.vbt.factoryManagement.dto.MaterialProductDTO;
import com.vbt.factoryManagement.dto.ProductDTO;
import com.vbt.factoryManagement.entities.MaterialProduct;
import com.vbt.factoryManagement.entities.Product;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class ProductMapper {

    public ProductDTO map(Product product)
    {

        Set<MaterialProduct> materialProducts = product.getMaterialProducts();
        Set<MaterialProductDTO> materialProductDTOS = materialProducts.stream().map(MaterialProductMapper::map).collect(Collectors.toSet());

        return new ProductDTO.Builder().ProductDTOBuilderWith()
                .id(product.getId())
                .productName(product.getProductName())
                .productColour(product.getProductColour())
                .productCost(product.getProductCost())
                .productStock(product.getProductStock())
                .materialProductsDto(materialProductDTOS).build();
    }
    public Product convertEntity (ProductDTO productDTO)
    {
        Set<MaterialProductDTO> materialProductsDto = productDTO.getMaterialProductsDto();
        Set<MaterialProduct> materialProduct = materialProductsDto.stream().map(MaterialProductMapper::convertEntity).collect(Collectors.toSet());
        Product product = new Product();
        product.setId(productDTO.getId());
        product.setProductName(productDTO.getProductName());
        product.setProductColour(productDTO.getProductColour());
        product.setProductStock(productDTO.getProductStock());
        product.setProductCost(productDTO.getProductCost());
        return product;
    }

}
