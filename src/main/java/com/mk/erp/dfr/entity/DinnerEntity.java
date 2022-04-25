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
@Table(name = "dinner", schema = "\"dfr\"")
public class DinnerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "dinner_id")
	private Long dinnerId;

	@Column(name = "dinner_name")
	private String dinnerName;

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
