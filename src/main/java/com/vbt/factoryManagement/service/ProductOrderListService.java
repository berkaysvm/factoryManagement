package com.vbt.factoryManagement.service;

import com.vbt.factoryManagement.dto.ProductOrderListDTO;
import com.vbt.factoryManagement.entities.Product;

public interface ProductOrderListService {

    ProductOrderListDTO save(ProductOrderListDTO productOrderListDTO);
    String delete(Long id);
    ProductOrderListDTO getById(Long id);
}
