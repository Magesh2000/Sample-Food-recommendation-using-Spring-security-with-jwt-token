package com.mk.erp.dfr.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mk.erp.dfr.dto.DiseaseDTO;
import com.mk.erp.dfr.entity.DiseaseEntity;
import com.mk.erp.dfr.repository.DiseaseRepository;

@Component
public class DiseaseDAO {

	@Autowired
	private EntityManager entityManager;

	@Autowired
	private DiseaseRepository repository;

	@SuppressWarnings("unchecked")
	public List<DiseaseEntity> getDiseaseList(DiseaseDTO diseaseDTO) {

		StringBuilder builder = new StringBuilder();
		builder.append("select de ");
		builder.append(" from  DiseaseEntity de");
		if (diseaseDTO.getDiseaseId() != null) {
			builder.append(" where de.diseaseId = '" + diseaseDTO.getDiseaseId() + "'");
		}
		Query query = entityManager.createQuery(builder.toString());

		return query.getResultList();
	}

}
