package com.vbt.factoryManagement.controller;

import com.vbt.factoryManagement.dto.ProductDTO;
import com.vbt.factoryManagement.entities.Product;
import com.vbt.factoryManagement.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @PostMapping("/save")
    public ProductDTO save(ProductDTO productDTO)
    {
        return productService.save(productDTO);
    }

    @GetMapping("/getById")
    public ProductDTO getById(int id)
    {
        return productService.getById(id);
    }

    @DeleteMapping("/delete")
    public String delete(int id)
    {
        return productService.deleteById(id);
    }

}
