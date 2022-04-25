package com.mk.erp.dfr.dto;

public class SetDTO {
	
	private Long setId;

	private String setName;

	private boolean active;

	public Long getSetId() {
		return setId;
	}

	public void setSetId(Long setId) {
		this.setId = setId;
	}

	public String getSetName() {
		return setName;
	}

	public void setSetName(String setName) {
		this.setName = setName;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
