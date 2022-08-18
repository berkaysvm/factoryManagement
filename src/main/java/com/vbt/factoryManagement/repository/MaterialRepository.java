package com.vbt.factoryManagement.repository;

import com.vbt.factoryManagement.entities.Material;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepository extends JpaRepository<Material,Long> {
}
