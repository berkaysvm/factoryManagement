package com.vbt.factoryManagement.mapper;

import com.vbt.factoryManagement.dto.ProductDTO;
import com.vbt.factoryManagement.dto.ProductOrderListDTO;
import com.vbt.factoryManagement.entities.ProductOrderList;
import com.vbt.factoryManagement.repository.CustomerRepository;
import org.springframework.stereotype.Component;
import com.vbt.factoryManagement.mapper.CustomerMapper;

@Component
public class ProductOrderListMapper {


    public  ProductOrderListDTO map(ProductOrderList productOrderList)
    {
        ProductMapper productMapper = new ProductMapper();
        CustomerMapper customerMapper = new CustomerMapper();

        return ProductOrderListDTO.Builder.ProductOrderListDTOBuilderWith()
                .id(productOrderList.getId())
                .productDTO(productMapper.map(productOrderList.getProduct()))
                .customerDTO(customerMapper.map(productOrderList.getCustomer()))
                .quantity(productOrderList.getQuantity()).build();
    }

    public ProductOrderList convertEntity(ProductOrderListDTO productOrderListDTO)
    {
        ProductMapper productMapper = new ProductMapper();
        CustomerMapper customerMapper = new CustomerMapper();
        ProductOrderList productOrderList = new ProductOrderList();
        productOrderList.setProduct(productMapper.convertEntity(productOrderListDTO.getProductDTO()));
        productOrderList.setCustomer(customerMapper.convertEntity(productOrderListDTO.getCustomerDTO()));
        productOrderList.setId(productOrderListDTO.getId());
        productOrderList.setQuantity(productOrderListDTO.getQuantity());
        return productOrderList;
    }

}
