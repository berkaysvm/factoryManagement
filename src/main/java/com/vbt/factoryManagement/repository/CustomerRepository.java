package com.vbt.factoryManagement.repository;

import com.vbt.factoryManagement.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
