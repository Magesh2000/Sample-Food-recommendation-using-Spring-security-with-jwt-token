package com.mk.erp.dfr.dto;

public class TimesDTO {

	private Long timesId;

	private String timining;

	private String periods;

	private boolean active;

	public Long getTimesId() {
		return timesId;
	}

	public void setTimesId(Long timesId) {
		this.timesId = timesId;
	}

	public String getTimining() {
		return timining;
	}

	public void setTimining(String timining) {
		this.timining = timining;
	}

	public String getPeriods() {
		return periods;
	}

	public void setPeriods(String periods) {
		this.periods = periods;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}
