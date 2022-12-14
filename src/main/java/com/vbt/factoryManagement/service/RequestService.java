package com.vbt.factoryManagement.service;

import com.vbt.factoryManagement.dto.RequestDTO;
import com.vbt.factoryManagement.entities.Employee;
import com.vbt.factoryManagement.entities.Request;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface RequestService {

    RequestDTO getRequest(int id);
    RequestDTO save(RequestDTO requestDTO);

    String delete(int id);




}
