package com.vbt.factoryManagement.controller;

import com.vbt.factoryManagement.dto.OrderMaterialRelationalDTO;
import com.vbt.factoryManagement.entities.OrderMaterialRelational;
import com.vbt.factoryManagement.service.OrderMaterialRelationalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orderMaterialRelational")
public class OrderMaterialRelationalController {


    //BUG


    private final OrderMaterialRelationalService orderMaterialRelationalService;
    @Autowired
    public OrderMaterialRelationalController(OrderMaterialRelationalService orderMaterialRelationalService) {
        this.orderMaterialRelationalService = orderMaterialRelationalService;
    }
    @PostMapping("/save/")
    public OrderMaterialRelationalDTO save(@RequestBody OrderMaterialRelationalDTO orderMaterialRelationalDTO)
    {
        return orderMaterialRelationalService.save(orderMaterialRelationalDTO);
    }
    @GetMapping("/getById/")
    public OrderMaterialRelationalDTO getById(@RequestParam int id)
    {
        return orderMaterialRelationalService.getById(id);
    }
    @GetMapping("/delete/")
    public String delete(@RequestParam int id)
    {
        return orderMaterialRelationalService.deleteById(id);
    }
}
