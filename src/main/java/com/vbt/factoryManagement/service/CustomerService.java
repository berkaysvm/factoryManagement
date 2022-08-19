package com.vbt.factoryManagement.service;

import com.vbt.factoryManagement.dto.CustomerDTO;
import com.vbt.factoryManagement.entities.Customer;

public interface CustomerService {
    CustomerDTO save(CustomerDTO customerDTO);
    CustomerDTO getCustomer (Long id);

    void delete(long id);
}
