package com.vbt.factoryManagement.service;

import com.vbt.factoryManagement.entities.Request;
import com.vbt.factoryManagement.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestServiceİmpl implements RequestService{

    private RequestRepository requestRepository;

    @Autowired
    public RequestServiceİmpl(RequestRepository requestRepository)
    {
        this.requestRepository = requestRepository;
    }

    @Override
    public Request getRequest(int id) {
        return requestRepository.getReferenceById(id);
    }

    @Override
    public Request save(Request request) {
        return requestRepository.save(request);
    }
}
