package com.vbt.factoryManagement.service;

import com.vbt.factoryManagement.dto.MaterialOrderDTO;
import com.vbt.factoryManagement.entities.Material;
import com.vbt.factoryManagement.entities.MaterialOrder;

import java.util.List;

public interface MaterialOrderService
{
    String save (MaterialOrderDTO materialOrderDTO);
    String delete(int id);
    MaterialOrderDTO getById(int id);
    List<MaterialOrderDTO> getAll();

}
