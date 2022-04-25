package com.mk.erp.dfr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mk.erp.dfr.entity.SetEntity;

@Repository
public interface SetRepository extends JpaRepository<SetEntity, Long> {

}
