package com.vbt.factoryManagement.service;

import com.vbt.factoryManagement.dto.OrderCompaniesDTO;

public interface OrderCompaniesService {
    OrderCompaniesDTO save(OrderCompaniesDTO orderCompaniesDTO);
    String deleteById(int id);

    OrderCompaniesDTO getById(int id);

}
