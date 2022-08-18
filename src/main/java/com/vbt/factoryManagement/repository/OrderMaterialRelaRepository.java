package com.vbt.factoryManagement.repository;

import com.vbt.factoryManagement.entities.OrderMaterialRelational;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderMaterialRelaRepository extends JpaRepository<OrderMaterialRelational,Integer> {
}
