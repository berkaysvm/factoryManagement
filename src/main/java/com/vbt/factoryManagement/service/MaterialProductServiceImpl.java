package com.vbt.factoryManagement.service;

import com.vbt.factoryManagement.dto.MaterialProductDTO;
import com.vbt.factoryManagement.mapper.MaterialProductMapper;
import com.vbt.factoryManagement.repository.MaterialProductRepository;

import java.util.List;

public class MaterialProductServiceImpl implements MaterialProductService{

    MaterialProductRepository materialProductRepository;
    MaterialProductMapper materialProductMapper;

    public  MaterialProductServiceImpl( MaterialProductMapper materialProductMapper, MaterialProductRepository materialProductRepository)
    {
        this.materialProductMapper = materialProductMapper;
        this.materialProductRepository = materialProductRepository;

    }

    @Override
    public String save(MaterialProductDTO materialProductDTO) {
        materialProductRepository.save(materialProductMapper.convertEntity(materialProductDTO));
        return "save complete";
    }

    @Override
    public String delete(int id) {
        materialProductRepository.deleteById(id);
        return "delete is complete";
    }

    @Override
    public MaterialProductDTO getById(int id) {
        return materialProductMapper.map(materialProductRepository.getReferenceById(id));
    }

    @Override
    public List<MaterialProductDTO> getAll() {
        return materialProductMapper.maplist(materialProductRepository.findAll());
    }
}
