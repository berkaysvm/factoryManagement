package com.vbt.factoryManagement.repository;

import com.vbt.factoryManagement.entities.MaterialProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialProductRepository extends JpaRepository<MaterialProduct,Integer> {
}
