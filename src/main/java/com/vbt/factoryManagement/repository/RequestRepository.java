package com.vbt.factoryManagement.repository;

import com.vbt.factoryManagement.entities.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Request ,Integer> {
}
