package com.vbt.factoryManagement.service;

import com.vbt.factoryManagement.dto.MaterialProductDTO;
import com.vbt.factoryManagement.entities.MaterialProduct;

import java.util.List;

public interface MaterialProductService {

    String save(MaterialProductDTO materialProductDTO);
    String delete(int id);
    MaterialProductDTO getById(int id);
    List<MaterialProductDTO> getAll();

}
