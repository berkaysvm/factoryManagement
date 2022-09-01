package com.vbt.factoryManagement.controller;

import com.vbt.factoryManagement.dto.AuthorityListDTO;
import com.vbt.factoryManagement.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/authority")
public class AuthorityController {
    private AuthorityService authorityService;

    @Autowired
    public AuthorityController ( AuthorityService authorityService)
    {
        this.authorityService = authorityService;
    }

    @PostMapping("/save/")
    public String save(@RequestBody AuthorityListDTO authorityListDTO)
    {
        return authorityService.save(authorityListDTO);
    }

    @GetMapping("/get") //not getting
    public AuthorityListDTO getAuthority(int id)
    {
        return authorityService.getAuthority(id);
    }
}
