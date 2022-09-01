package com.vbt.factoryManagement.controller;

import com.vbt.factoryManagement.dto.CustomerDTO;
import com.vbt.factoryManagement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService)
    {
        this.customerService = customerService;
    }

    @PostMapping("/save/")  // Not save Email
    public CustomerDTO save(@RequestBody CustomerDTO customerDTO)
    {
        return customerService.save(customerDTO);
    }

    @DeleteMapping("/delete/")
    public void delete(@RequestParam Long id)
    {
        customerService.delete(id);
    }

    @GetMapping("/getCustomer/")
    public CustomerDTO getCustomer(@RequestParam Long id)
    {
        return customerService.getCustomer(id);
    }

}
