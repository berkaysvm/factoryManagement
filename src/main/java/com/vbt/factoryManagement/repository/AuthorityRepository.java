package com.vbt.factoryManagement.repository;

import com.vbt.factoryManagement.entities.AuthorityList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<AuthorityList,Long> {
}
