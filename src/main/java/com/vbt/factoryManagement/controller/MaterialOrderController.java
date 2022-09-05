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
        // 1. yol Merge kullanma
        //2. yol gönderilen id ile find yap gelen veri varsa bunu yolla
        //no problem
         return materialOrderService.save(materialOrderDTO);
    }

    @GetMapping("/getById/")
    // stackoverflow null
    //
    public MaterialOrderDTO getById(@RequestParam int id)
    {
        return materialOrderService.getById(id);
    }
    @GetMapping("/getByOrderNo/")
    public MaterialOrderDTO getReferenceByOrderNo(@RequestParam String orderNo)
    {
        return materialOrderService.getReferenceByOrderNo(orderNo);
    }

    @DeleteMapping("/delete/") //No problem
    public String delete(@RequestParam int id)
    {
        materialOrderService.delete(id);
        return "delete is complete";

    }


//    @DeleteMapping("/deleteOrderNo/") //No problem
//    public String delete(@RequestParam String orderNo)
//    {
//        materialOrderService.delete(id);
//        return "delete is complete";
//
//    }
}