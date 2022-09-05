package com.vbt.factoryManagement.service;

import com.vbt.factoryManagement.dto.MaterialOrderDTO;
import com.vbt.factoryManagement.mapper.MaterialOrderMapper;
import com.vbt.factoryManagement.repository.MaterialOrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MaterialOrderServiceImpl implements MaterialOrderService{
    MaterialOrderMapper materialOrderMapper;
    MaterialOrderRepository materialOrderRepository;

    public MaterialOrderServiceImpl(MaterialOrderMapper materialOrderMapper, MaterialOrderRepository materialOrderRepository)
    {
        this.materialOrderMapper = materialOrderMapper;
        this.materialOrderRepository = materialOrderRepository;
    }


    @Override
    public String save(MaterialOrderDTO materialOrderDTO) {
        materialOrderRepository.save(materialOrderMapper.convertEntity2(materialOrderDTO));
        return "Save Complete";
    }

    @Override
    public String delete(int id) {
        materialOrderRepository.deleteById(id);
        return "delete is complete";
    }

    @Override
    public MaterialOrderDTO getById(int id) {
        return materialOrderMapper.map(materialOrderRepository.getReferenceById(id));
    }

    @Override
    public List<MaterialOrderDTO> getAll() {
        return materialOrderMapper.maplist(materialOrderRepository.findAll());
    }


}
