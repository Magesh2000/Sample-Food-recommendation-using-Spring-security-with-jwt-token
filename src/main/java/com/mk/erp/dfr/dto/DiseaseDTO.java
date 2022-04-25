package com.mk.erp.dfr.dto;

public class DiseaseDTO {

	private Long diseaseId;

	private String diseaseName;

	private boolean active;

	public Long getDiseaseId() {
		return diseaseId;
	}

	public void setDiseaseId(Long diseaseId) {
		this.diseaseId = diseaseId;
	}

	public String getDiseaseName() {
		return diseaseName;
	}

	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}
