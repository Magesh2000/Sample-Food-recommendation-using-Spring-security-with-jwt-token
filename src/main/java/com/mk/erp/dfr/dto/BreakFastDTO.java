package com.mk.erp.dfr.dto;

public class BreakFastDTO {

	private Long breakFastId;

	private String breakFastName;

	private DiseaseDTO diseaseDTO;

	private SetDTO setDTO;

	private TimesDTO timesDTO;
	
	private boolean active;

	public Long getBreakFastId() {
		return breakFastId;
	}

	public void setBreakFastId(Long breakFastId) {
		this.breakFastId = breakFastId;
	}

	public String getBreakFastName() {
		return breakFastName;
	}

	public void setBreakFastName(String breakFastName) {
		this.breakFastName = breakFastName;
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
