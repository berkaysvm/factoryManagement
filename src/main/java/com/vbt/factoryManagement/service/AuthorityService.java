package com.vbt.factoryManagement.service;

import com.vbt.factoryManagement.dto.AuthorityListDTO;
import com.vbt.factoryManagement.dto.CustomerDTO;
import com.vbt.factoryManagement.entities.AuthorityList;

import java.util.List;

public interface AuthorityService {
    AuthorityListDTO getAuthority(int id);

    String save(AuthorityListDTO authorityListDTO);
}
