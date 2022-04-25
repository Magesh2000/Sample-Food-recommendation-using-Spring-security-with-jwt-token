package com.mk.erp.dfr.dto;

public class DinnerDTO {

	private Long dinnerId;

	private String dinnerName;

	private DiseaseDTO diseaseDTO;

	private SetDTO setDTO;

	private TimesDTO timesDTO;
	
	private boolean active;

	public Long getDinnerId() {
		return dinnerId;
	}

	public void setDinnerId(Long dinnerId) {
		this.dinnerId = dinnerId;
	}

	public String getDinnerName() {
		return dinnerName;
	}

	public void setDinnerName(String dinnerName) {
		this.dinnerName = dinnerName;
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
