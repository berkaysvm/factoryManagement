package com.vbt.factoryManagement.controller;

import com.vbt.factoryManagement.dto.EmployeeDTO;
import com.vbt.factoryManagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService)
    {
        this.employeeService = employeeService;
    }

    @PostMapping("/save/")
    public EmployeeDTO save(@RequestBody EmployeeDTO employeeDTO)
    {
        return employeeService.save(employeeDTO);
    }

    @GetMapping("/getById/")
    public EmployeeDTO getById(@RequestParam Long id)
    {
        return employeeService.getById(id);
    }

    @DeleteMapping("/delete/")
    public String delete(@RequestParam Long id)
    {
        return employeeService.delete(id);
    }

    @GetMapping("/getAll")
    public List<EmployeeDTO> getAll()
    {
        return employeeService.gelAll();
    }

}
