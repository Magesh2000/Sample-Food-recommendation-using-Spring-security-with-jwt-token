package com.mk.erp.dfr.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "set", schema = "\"dfr\"")
public class SetEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "set_id")
	private Long setId;
	
	@Column(name = "set_name")
	private String setName;
	
	@Column(name = "active")
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
