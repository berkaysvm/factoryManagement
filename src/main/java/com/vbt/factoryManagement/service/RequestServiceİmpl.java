package com.vbt.factoryManagement.service;

import com.vbt.factoryManagement.dto.RequestDTO;
import com.vbt.factoryManagement.entities.Request;
import com.vbt.factoryManagement.mapper.RequestMapper;
import com.vbt.factoryManagement.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class RequestServiceİmpl implements RequestService{

    private RequestRepository requestRepository;
    RequestMapper requestMapper;

    @Autowired
    public RequestServiceİmpl(RequestRepository requestRepository,RequestMapper requestMapper)
    {
        this.requestRepository = requestRepository;
        this.requestMapper = requestMapper;
    }

    @Override
    public RequestDTO getRequest(int id) {
        return requestMapper.map(requestRepository.getReferenceById(id));
    }

    @Override
    public RequestDTO save(RequestDTO requestDTO) {
        requestRepository.save(requestMapper.convertEntity(requestDTO));
        return requestMapper.map(requestRepository.getReferenceById(requestDTO.getId()));
    }
}
