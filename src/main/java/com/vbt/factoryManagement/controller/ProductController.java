package com.vbt.factoryManagement.controller;

import com.vbt.factoryManagement.dto.ProductDTO;
import com.vbt.factoryManagement.entities.Product;
import com.vbt.factoryManagement.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @PostMapping("/save/")
    public ProductDTO save(@RequestBody ProductDTO productDTO)
    {
        productService.save(productDTO);
        return null;
    }

    @GetMapping("/getById/")
    public ProductDTO getById(@RequestParam int id)
    {
        return productService.getById(id);
    }

    @DeleteMapping("/delete/")
    public String delete(@RequestParam int id)
    {
        return productService.deleteById(id);
    }

}
