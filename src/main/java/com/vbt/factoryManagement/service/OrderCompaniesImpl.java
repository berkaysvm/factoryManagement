package com.vbt.factoryManagement.service;

import com.vbt.factoryManagement.dto.OrderCompaniesDTO;
import com.vbt.factoryManagement.mapper.OrderCompaniesMapper;
import com.vbt.factoryManagement.repository.OrderCompaniesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderCompaniesImpl implements OrderCompaniesService{

    OrderCompaniesMapper orderCompaniesMapper;
    OrderCompaniesRepository orderCompaniesRepository;

    @Autowired
    public OrderCompaniesImpl(OrderCompaniesRepository orderCompaniesRepository, OrderCompaniesMapper orderCompaniesMapper)
    {
        this.orderCompaniesMapper = orderCompaniesMapper;
        this.orderCompaniesRepository = orderCompaniesRepository;
    }
    @Override
    public OrderCompaniesDTO save(OrderCompaniesDTO orderCompaniesDTO) {
        orderCompaniesRepository.save(orderCompaniesMapper.convertEntity(orderCompaniesDTO));
        return orderCompaniesMapper.map(orderCompaniesRepository.getReferenceById(orderCompaniesDTO.getId()));
    }

    @Override
    public String deleteById(int id) {
        orderCompaniesRepository.deleteById(id);
        if (orderCompaniesRepository.getReferenceById(id) == null)
        {return "delete is complete";}

        else
            return "delete is not complete";
    }

    @Override
    public OrderCompaniesDTO getById(int id) {
        return orderCompaniesMapper.map(orderCompaniesRepository.getReferenceById(id));
    }
}
