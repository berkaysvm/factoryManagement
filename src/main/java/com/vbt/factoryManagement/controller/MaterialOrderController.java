package com.vbt.factoryManagement.controller;

import com.vbt.factoryManagement.dto.MaterialOrderDTO;
import com.vbt.factoryManagement.entities.MaterialOrder;
import com.vbt.factoryManagement.entities.Request;
import com.vbt.factoryManagement.service.AuthorityService;
import com.vbt.factoryManagement.service.MaterialOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/materialOrder")
public class MaterialOrderController {

    //bug
    private final MaterialOrderService materialOrderService;

    @Autowired
    public MaterialOrderController(MaterialOrderService materialOrderService) {
        this.materialOrderService = materialOrderService;
    }

    @PostMapping("/save/")
    public String save(@RequestBody MaterialOrderDTO materialOrderDTO)
    {
        //PersistentObjectException: detached entity passed to persist: com.vbt.factoryManagement.entities.Material
         return materialOrderService.save(materialOrderDTO);
    }

    @GetMapping("/getById/")
    public MaterialOrderDTO getById(@RequestParam int id)
    {
        return materialOrderService.getById(id);
    }

    @DeleteMapping("/delete/") //No problem
    public String delete(@RequestParam int id)
    {
        materialOrderService.delete(id);
        return "delete is complete";

    }
}