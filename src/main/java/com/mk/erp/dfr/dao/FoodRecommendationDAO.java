package com.mk.erp.dfr.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mk.erp.dfr.dto.RecommendationDTO;
import com.mk.erp.dfr.entity.DiseaseEntity;
import com.mk.erp.dfr.entity.RecommendationEntity;
import com.mk.erp.dfr.repository.DiseaseRepository;
import com.mk.erp.dfr.repository.RecommendationRepository;

@Component
public class FoodRecommendationDAO {

	@Autowired
	private EntityManager entityManager;

	@Autowired
	private RecommendationRepository recommendationRepository;
	
	@Autowired
	private DiseaseRepository  diseaseRepository;

	@SuppressWarnings("unchecked")
	public List<String> getVegtables(Long diseaseId) {

		StringBuilder builder = new StringBuilder();
		builder.append("select re.vegetables ");
		builder.append(" from  RecommendationEntity re");
		builder.append(" inner join DiseaseEntity de on de=re.diseaseEntity");
		if (diseaseId != null) {
		builder.append(" where de.diseaseId = '"+diseaseId+"'");
		}

		Query query = entityManager.createQuery(builder.toString());

		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<String> getFruits(Long diseaseId) {

		StringBuilder builder = new StringBuilder();
		builder.append("select re.fruits ");
		builder.append(" from  RecommendationEntity re");
		builder.append(" inner join DiseaseEntity de on de=re.diseaseEntity");
		builder.append(" where de.diseaseId = '"+diseaseId+"'");

		Query query = entityManager.createQuery(builder.toString());

		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<String> getFood(Long diseaseId) {

		StringBuilder builder = new StringBuilder();
		builder.append("select re.food ");
		builder.append(" from  RecommendationEntity re");
		builder.append(" inner join DiseaseEntity de on de=re.diseaseEntity");
		builder.append(" where de.diseaseId = '"+diseaseId+"'");

		Query query = entityManager.createQuery(builder.toString());

		return query.getResultList();
	}

	public DiseaseEntity findById(Long diseaseId) {
		DiseaseEntity diseaseEntity= new DiseaseEntity();
		Optional<DiseaseEntity> Disease=diseaseRepository.findById(diseaseId);
		
		if(Disease.isPresent()) {
			diseaseEntity=Disease.get();
		}
		
		return diseaseEntity;
	}

	@SuppressWarnings("unchecked")
	public List<RecommendationEntity> foodRecommendationList(RecommendationDTO foodRecommendation) {

		StringBuilder builder = new StringBuilder();
		builder.append("select re ");
		builder.append(" from  RecommendationEntity re");
		builder.append(" inner join DiseaseEntity de on de=re.diseaseEntity");
		builder.append(" where de.diseaseId = '"+foodRecommendation.getDiseaseId()+"'");

		Query query = entityManager.createQuery(builder.toString());

		return query.getResultList();
	}

}
