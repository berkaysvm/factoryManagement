package com.vbt.factoryManagement.controller;

import com.vbt.factoryManagement.dto.ProductOrderListDTO;
import com.vbt.factoryManagement.service.ProductOrderListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productOrderList")
public class ProductOrderListController {


    // No problemm
    private final ProductOrderListService productOrderListService;
    @Autowired
    public ProductOrderListController(ProductOrderListService productOrderListService) {
        this.productOrderListService = productOrderListService;
    }

    @PostMapping("/save/")
    public ProductOrderListDTO save(@RequestBody ProductOrderListDTO productOrderListDTO)
    {
        return productOrderListService.save(productOrderListDTO);
    }

    @GetMapping("/getById/")
    public ProductOrderListDTO getById(@RequestParam long id)
    {
        return productOrderListService.getById(id);
    }
    @DeleteMapping("/delete/")
    public String delete(@RequestParam long id)
    {
        return productOrderListService.delete(id);
    }
}
