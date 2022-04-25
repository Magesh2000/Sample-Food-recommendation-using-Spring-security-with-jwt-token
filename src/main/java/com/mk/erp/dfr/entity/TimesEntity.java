package com.mk.erp.dfr.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "times", schema = "\"dfr\"")
public class TimesEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "times_id")
	private Long timesId;
	
	@Column(name = "timinings")
	private String timining;
	
	@Column(name = "periods")
	private String periods;
	
	@Column(name = "active")
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
