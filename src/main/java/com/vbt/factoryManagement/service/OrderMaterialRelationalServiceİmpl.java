package com.vbt.factoryManagement.service;

import com.vbt.factoryManagement.dto.OrderMaterialRelationalDTO;
import com.vbt.factoryManagement.entities.OrderMaterialRelational;
import com.vbt.factoryManagement.mapper.OrderMaterialRelationalMapper;
import com.vbt.factoryManagement.repository.OrderMaterialRelaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderMaterialRelationalServiceİmpl implements OrderMaterialRelationalService{

    OrderMaterialRelaRepository orderMaterialRelaRepository;
    OrderMaterialRelationalMapper orderMaterialRelationalMapper;
    @Autowired
    public OrderMaterialRelationalServiceİmpl(OrderMaterialRelaRepository orderMaterialRelaRepository, OrderMaterialRelationalMapper orderMaterialRelationalMapper)
    {
        this.orderMaterialRelaRepository = orderMaterialRelaRepository;
        this.orderMaterialRelationalMapper = orderMaterialRelationalMapper;
    }

    @Override
    public OrderMaterialRelationalDTO save(OrderMaterialRelationalDTO orderMaterialRelationalDTO) {
        orderMaterialRelaRepository.save(orderMaterialRelationalMapper.convertEntity(orderMaterialRelationalDTO));
        return orderMaterialRelationalMapper.map(orderMaterialRelaRepository.getReferenceById(orderMaterialRelationalDTO.getId()));
    }

    @Override
    public String deleteById(int id) {
        orderMaterialRelaRepository.deleteById(id);
        if (orderMaterialRelaRepository.getReferenceById(id) == null)
        {
            return "delete is complete";

        }
        else
            return "delete is not complete";
    }

    @Override
    public OrderMaterialRelationalDTO getById(int id) {
        return orderMaterialRelationalMapper.map(orderMaterialRelaRepository.getReferenceById(id));
    }
}
