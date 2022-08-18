package com.vbt.factoryManagement.repository;

import com.vbt.factoryManagement.entities.OrderCompanies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderCompaniesRepository extends JpaRepository<OrderCompanies,Integer> {
}
