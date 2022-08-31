package com.vbt.factoryManagement.service;

import com.vbt.factoryManagement.dto.MaterialDTO;
import com.vbt.factoryManagement.entities.Material;

public interface MaterialService {

    MaterialDTO save(MaterialDTO materialDTO);
    String deleteById(Long id);

    MaterialDTO getById(Long id);

}
