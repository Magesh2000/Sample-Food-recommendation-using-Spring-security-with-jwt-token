package com.mk.erp.dfr.dto;

public class LunchDTO {

	private Long lunchId;

	private String lunchName;

	private DiseaseDTO diseaseDTO;

	private SetDTO setDTO;

	private TimesDTO timesDTO;
	
	private boolean active;

	public Long getLunchId() {
		return lunchId;
	}

	public void setLunchId(Long lunchId) {
		this.lunchId = lunchId;
	}

	public String getLunchName() {
		return lunchName;
	}

	public void setLunchName(String lunchName) {
		this.lunchName = lunchName;
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
