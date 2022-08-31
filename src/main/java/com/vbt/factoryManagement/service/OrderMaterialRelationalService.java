package com.vbt.factoryManagement.service;

import com.vbt.factoryManagement.dto.OrderMaterialRelationalDTO;
import com.vbt.factoryManagement.entities.OrderMaterialRelational;

public interface OrderMaterialRelationalService {

    OrderMaterialRelationalDTO save(OrderMaterialRelationalDTO orderMaterialRelationalDTO);

    String deleteById(int id);

    OrderMaterialRelationalDTO getById(int id);


}
