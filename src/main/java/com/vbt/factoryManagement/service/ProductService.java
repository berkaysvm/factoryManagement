package com.vbt.factoryManagement.service;

import com.vbt.factoryManagement.dto.ProductDTO;
import com.vbt.factoryManagement.entities.Product;

public interface ProductService {
    ProductDTO save (ProductDTO productDTO);
    String deleteById(int id);
    ProductDTO getById(int id);
}
