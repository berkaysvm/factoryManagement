package com.vbt.factoryManagement.controller;

import com.vbt.factoryManagement.dto.MaterialDTO;
import com.vbt.factoryManagement.entities.Material;
import com.vbt.factoryManagement.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/material")
public class MaterialController {

    //MaterialProductList bug
    private final MaterialService materialService;
    //No problem
    @Autowired
    public MaterialController(MaterialService materialService) {
        this.materialService = materialService;
    }
    @PostMapping("/save/")
    public MaterialDTO save(@RequestBody MaterialDTO materialDTO)
    {
        return materialService.save(materialDTO);
    }
    @DeleteMapping("/delete/")
    public String deleteById(@RequestParam Long id)
    {
        return materialService.deleteById(id);
    }
    @GetMapping("/getAll/")
    public MaterialDTO getById(@RequestParam Long id)
    {
        return materialService.getById(id);
    }




}
