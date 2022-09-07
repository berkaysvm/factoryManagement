package com.vbt.factoryManagement.service;

import com.vbt.factoryManagement.dto.OrderCompaniesDTO;
import com.vbt.factoryManagement.entities.OrderCompanies;

public interface OrderCompaniesService {
    OrderCompaniesDTO save(OrderCompaniesDTO orderCompaniesDTO);
    String deleteById(int id);

    OrderCompaniesDTO getById(int id);
    OrderCompanies mapp(int id);


}
