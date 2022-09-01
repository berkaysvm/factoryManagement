package com.vbt.factoryManagement.controller;

import com.vbt.factoryManagement.dto.DepartmentDTO;
import com.vbt.factoryManagement.dto.EmployeeDTO;
import com.vbt.factoryManagement.service.DepartmentService;
import com.vbt.factoryManagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    private final DepartmentService departmentService;

   @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/save/")
    public DepartmentDTO save(@RequestBody DepartmentDTO departmentDTO)
    {
        return departmentService.save(departmentDTO);
    }

    @GetMapping("/getById/")
    public DepartmentDTO getById(@RequestParam int id)
    {
        return departmentService.getbyid(id);
    }

    @DeleteMapping("/delete/")
    public void delete(@RequestParam int id)
    {
        departmentService.delete(id);
    }


}
