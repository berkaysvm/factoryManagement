package com.vbt.factoryManagement.service;

import com.vbt.factoryManagement.dto.DepartmentDTO;
import com.vbt.factoryManagement.mapper.DepartmentMapper;
import com.vbt.factoryManagement.repository.DepartmentRepostitory;
import org.springframework.stereotype.Service;

@Service
class DepartmentServiceImpl implements DepartmentService{

    public DepartmentMapper departmentMapper;
    public DepartmentRepostitory departmentRepostitory;

    public DepartmentServiceImpl(DepartmentMapper departmentMapper, DepartmentRepostitory departmentRepostitory)
    {
        this.departmentMapper = departmentMapper;
        this.departmentRepostitory = departmentRepostitory;

    }

    @Override
    public DepartmentDTO save(DepartmentDTO departmentDTO) {
        departmentRepostitory.save(departmentMapper.convertEntity(departmentDTO));
        return departmentDTO;
    }

    @Override
    public DepartmentDTO getbyid(int id) {
        return  departmentMapper.map(departmentRepostitory.getReferenceById(id));
    }


    @Override
    public void delete(int id) {
        departmentRepostitory.deleteById(id);

    }
}
