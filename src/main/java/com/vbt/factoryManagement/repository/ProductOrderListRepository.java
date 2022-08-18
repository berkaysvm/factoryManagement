package com.vbt.factoryManagement.repository;

import com.vbt.factoryManagement.entities.ProductOrderList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductOrderListRepository extends JpaRepository<ProductOrderList,Long> {
}
