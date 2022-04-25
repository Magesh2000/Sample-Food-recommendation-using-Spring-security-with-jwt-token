package com.mk.erp.dfr.dto;

public class SnackesDTO {

	private Long snackesId;

	private String snackesName;

	private DiseaseDTO diseaseDTO;

	private SetDTO setDTO;

	private TimesDTO timesDTO;

	private boolean active;

	public Long getSnackesId() {
		return snackesId;
	}

	public void setSnackesId(Long snackesId) {
		this.snackesId = snackesId;
	}

	public String getSnackesName() {
		return snackesName;
	}

	public void setSnackesName(String snackesName) {
		this.snackesName = snackesName;
	}

	public DiseaseDTO getDiseaseDTO() {
		return diseaseDTO;
	}

	public void setDiseaseDTO(DiseaseDTO diseaseDTO) {
		this.diseaseDTO = diseaseDTO;
	}

	public SetDTO getSetDTO() {
		return setDTO;
	}

	public void setSetDTO(SetDTO setDTO) {
		this.setDTO = setDTO;
	}

	public TimesDTO getTimesDTO() {
		return timesDTO;
	}

	public void setTimesDTO(TimesDTO timesDTO) {
		this.timesDTO = timesDTO;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}
