package com.vbt.factoryManagement.controller;

import com.vbt.factoryManagement.dto.MaterialOrderDTO;
import com.vbt.factoryManagement.entities.MaterialOrder;
import com.vbt.factoryManagement.entities.Request;
import com.vbt.factoryManagement.service.AuthorityService;
import com.vbt.factoryManagement.service.MaterialOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/authority")
public class MaterialOrderController {
    MaterialOrderService materialOrderService;

    @Autowired
    public MaterialOrderController(MaterialOrderService materialOrderService) {
        this.materialOrderService = materialOrderService;
    }

    @PostMapping("/save")
    public String save(@RequestBody MaterialOrderDTO materialOrderDTO)
    {
         return materialOrderService.save(materialOrderDTO);
    }

    @GetMapping("/getById")
    public MaterialOrderDTO getById(@RequestParam int id)
    {
        return materialOrderService.getById(id);
    }
}