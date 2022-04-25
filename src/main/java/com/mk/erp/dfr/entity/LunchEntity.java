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
@Table(name = "lunch", schema = "\"dfr\"")
public class LunchEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "lunch_id")
	private Long lunchId;

	@Column(name = "lunch_name")
	private String lunchName;

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
