package com.vbt.factoryManagement.controller;

import com.vbt.factoryManagement.dto.OrderCompaniesDTO;
import com.vbt.factoryManagement.service.OrderCompaniesImpl;
import com.vbt.factoryManagement.service.OrderCompaniesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orderCompanies")
public class OrderCompaniesController {
    private final OrderCompaniesService orderCompaniesService;
    @Autowired
    public OrderCompaniesController(OrderCompaniesService orderCompaniesService) {
        this.orderCompaniesService = orderCompaniesService;
    }
    @PostMapping("/save/")
    public OrderCompaniesDTO save(@RequestBody OrderCompaniesDTO orderCompaniesDTO)
    {
        return orderCompaniesService.save(orderCompaniesDTO);
    }
    @DeleteMapping("/delete/")
    public String delete(@RequestParam int id)
    {
        return orderCompaniesService.deleteById(id);
    }
    @GetMapping("/getById/")
    public OrderCompaniesDTO getById(@RequestParam int id)
    {
        return orderCompaniesService.getById(id);
    }
}
