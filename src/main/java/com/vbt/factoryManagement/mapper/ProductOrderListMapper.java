package com.vbt.factoryManagement.mapper;

import com.vbt.factoryManagement.dto.ProductDTO;
import com.vbt.factoryManagement.dto.ProductOrderListDTO;
import com.vbt.factoryManagement.entities.ProductOrderList;
import org.springframework.stereotype.Component;
import com.vbt.factoryManagement.mapper.CustomerMapper;

@Component
public class ProductOrderListMapper {

    static ProductMapper productMapper = new ProductMapper();
    static CustomerMapper customerMapper = new CustomerMapper();
    public static ProductOrderListDTO map(ProductOrderList productOrderList)
    {

        return ProductOrderListDTO.Builder.ProductOrderListDTOBuilderWith()
                .id(productOrderList.getId())
                .productDTO(productMapper.map(productOrderList.getProduct()))
                //.customerDTO(customerMapper.map(productOrderList.getCustomer()))
                .quantity(productOrderList.getQuantity()).build();
    }

    public static ProductOrderList convertEntity(ProductOrderListDTO productOrderListDTO)
    {
        ProductOrderList productOrderList = new ProductOrderList();
        productOrderList.setProduct(productMapper.convertEntity(productOrderListDTO.getProductDTO()));
        //productOrderList.setCustomer(customerMapper.convertEntity(productOrderListDTO.getCustomerDTO()));
        productOrderList.setId(productOrderListDTO.getId());
        productOrderList.setQuantity(productOrderListDTO.getQuantity());
        return productOrderList;
    }

}
