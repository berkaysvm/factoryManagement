package com.vbt.factoryManagement.controller;

import com.vbt.factoryManagement.dto.MaterialProductDTO;
import com.vbt.factoryManagement.entities.MaterialProduct;
import com.vbt.factoryManagement.service.MaterialProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/materialProduct")
public class MaterialProductController {
    private final MaterialProductService materialProductService;

    @Autowired
    public MaterialProductController(MaterialProductService materialProductService) {
        this.materialProductService = materialProductService;
    }
    @PostMapping("/save/")
    public String save(@RequestBody MaterialProductDTO materialProductDTO)
    {
        return materialProductService.save(materialProductDTO);
    }
    @DeleteMapping("/delete/")
    public String delete(@RequestParam int id)
    {
        return materialProductService.delete(id);
    }

    @GetMapping("/getById/")
    public MaterialProductDTO getById(@RequestParam int id)
    {
        return materialProductService.getById(id);
    }
    @GetMapping("/getAll")
    public List<MaterialProductDTO> getAll()
    {
        return materialProductService.getAll();
    }
}
