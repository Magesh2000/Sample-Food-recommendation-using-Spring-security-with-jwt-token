package com.mk.erp.dfr.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mk.erp.dfr.dao.DiseaseDAO;
import com.mk.erp.dfr.dto.DiseaseDTO;
import com.mk.erp.dfr.entity.DiseaseEntity;

@Service
public class DiseaseService {

	@Autowired
	private DiseaseDAO dao;

	public List<DiseaseDTO> diseaseList(DiseaseDTO diseaseDTO) {

		List<DiseaseEntity> diseaseList = dao.getDiseaseList(diseaseDTO);
		List<DiseaseDTO> diseaseDTOList = new ArrayList<>();
		DiseaseDTO disease;

		for (DiseaseEntity diseaseEntity : diseaseList) {
			disease = new DiseaseDTO();

			disease.setDiseaseId(diseaseEntity.getDiseaseId());
			disease.setDiseaseName(diseaseEntity.getDiseaseName());
			disease.setActive(true);
			diseaseDTOList.add(disease);
		}

		return diseaseDTOList;
	}

}
