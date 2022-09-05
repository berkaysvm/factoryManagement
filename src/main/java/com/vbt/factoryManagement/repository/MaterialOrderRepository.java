package com.vbt.factoryManagement.repository;

import com.vbt.factoryManagement.entities.MaterialOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.LineNumberReader;
import java.util.List;

public interface MaterialOrderRepository extends JpaRepository<MaterialOrder,Integer>{

    MaterialOrder getReferenceByOrderNo(String orderNo);
}
