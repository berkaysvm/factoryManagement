package com.vbt.factoryManagement.repository;

import com.vbt.factoryManagement.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer > {
}
