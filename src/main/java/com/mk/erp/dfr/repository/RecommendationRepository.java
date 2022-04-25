package com.mk.erp.dfr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mk.erp.dfr.entity.RecommendationEntity;

@Repository
public interface RecommendationRepository extends JpaRepository<RecommendationEntity,Long>{

}
