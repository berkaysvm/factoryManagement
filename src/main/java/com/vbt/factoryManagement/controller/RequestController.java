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

    @PostMapping("/save/")
    public RequestDTO save(@RequestBody RequestDTO requestDTO)   // NullPointerException : Cannot invoke "com.vbt.factoryManagement.dto.AuthorityListDTO.getId()" because "authorityListDTO" is null
    {
        // save complete
        return requestService.save(requestDTO);
    }

    @GetMapping("/getRequest/")   //WARN 11856 --- [nio-8080-exec-6] .w.s.m.s.DefaultHandlerExceptionResolver : Resolved [org.springframework.http.converter.HttpMessageNotReadableException: JSON parse error: Cannot deserialize value of type `int` from Object value (token `JsonToken.START_OBJECT`); nested exception is com.fasterxml.jackson.databind.exc.MismatchedInputException: Cannot deserialize value of type `int` from Object value (token `JsonToken.START_OBJECT`)<EOL> at [Source: (org.springframework.util.StreamUtils$NonClosingInputStream); line: 1, column: 1]]
    public RequestDTO getById(@RequestBody int id)
    {
        return requestService.getRequest(id);

    }
    @DeleteMapping("/delete/")
    public String delete(@RequestParam int id)
    {
        return requestService.delete(id);
    }
}