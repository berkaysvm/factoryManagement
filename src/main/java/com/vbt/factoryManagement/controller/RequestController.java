package com.vbt.factoryManagement.controller;

import com.vbt.factoryManagement.dto.RequestDTO;

import com.vbt.factoryManagement.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/request")
public class RequestController {

    private final RequestService requestService;

    @Autowired
    public RequestController(RequestService requestService) {
        this.requestService = requestService;
    }

    @PostMapping("/save")
    public RequestDTO save(RequestDTO requestDTO)
    {
        return requestService.save(requestDTO);
    }

    @GetMapping("/getRequest")
    public RequestDTO getById(int id)
    {
        return requestService.getRequest(id);

    }
    @DeleteMapping("/delete")
    public String delete(int id)
    {
        return requestService.delete(id);
    }
}