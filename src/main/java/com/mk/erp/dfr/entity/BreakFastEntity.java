package com.mk.erp.dfr.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "break_fast", schema = "\"dfr\"")
public class BreakFastEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "break_fast_id")
	private Long breakFastId;

	@Column(name = "break_fast_name")
	private String breakFastName;

	@OneToOne
	@JoinColumn(name = "disease")
	private DiseaseEntity diseaseEntity;

	@OneToOne
	@JoinColumn(name = "set")
	private SetEntity setEntity;

	@OneToOne
	@JoinColumn(name = "timings")
	private TimesEntity timingEntity;

	@Column(name = "active")
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

	public DiseaseEntity getDiseaseEntity() {
		return diseaseEntity;
	}

	public void setDiseaseEntity(DiseaseEntity diseaseEntity) {
		this.diseaseEntity = diseaseEntity;
	}

	public SetEntity getSetEntity() {
		return setEntity;
	}

	public void setSetEntity(SetEntity setEntity) {
		this.setEntity = setEntity;
	}

	public TimesEntity getTimingEntity() {
		return timingEntity;
	}

	public void setTimingEntity(TimesEntity timingEntity) {
		this.timingEntity = timingEntity;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}
