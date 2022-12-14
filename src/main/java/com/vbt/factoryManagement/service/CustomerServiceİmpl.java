package com.vbt.factoryManagement.service;

import com.vbt.factoryManagement.dto.CustomerDTO;
import com.vbt.factoryManagement.entities.Customer;
import com.vbt.factoryManagement.mapper.CustomerMapper;
import com.vbt.factoryManagement.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService─░mpl implements CustomerService{

    private CustomerRepository customerRepository;
    private CustomerMapper customerMapper;
    @Autowired
    public CustomerService─░mpl(CustomerRepository customerRepository, CustomerMapper customerMapper)
    {
         this.customerRepository = customerRepository;
         this.customerMapper = customerMapper;
    }

    @Override
    public CustomerDTO save(CustomerDTO customerDTO) {   // Email kaydetmiyor
        customerRepository.save(customerMapper.convertEntity(customerDTO));
        return customerDTO;
    }

    @Override
    public CustomerDTO getCustomer(Long id) {
        return customerMapper.map(customerRepository.getReferenceById(id));
    }

    @Override
    public void delete(long id) {
        customerRepository.deleteById(id);

    }
}
