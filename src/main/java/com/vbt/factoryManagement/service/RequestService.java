package com.vbt.factoryManagement.service;

import com.vbt.factoryManagement.entities.Employee;
import com.vbt.factoryManagement.entities.Request;

import java.util.Set;

public interface RequestService {

    Request getRequest(int id);
    Request save(Request request);




}
