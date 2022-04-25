package com.mk.erp.dfr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mk.erp.dfr.entity.StatusEntity;

import ch.qos.logback.core.status.StatusListener;

@Repository
public interface StatusRepository extends JpaRepository<StatusEntity, Long> {

}
