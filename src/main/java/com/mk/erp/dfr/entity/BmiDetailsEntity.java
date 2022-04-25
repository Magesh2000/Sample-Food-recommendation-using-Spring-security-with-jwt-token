package com.mk.erp.dfr.entity;

import java.security.Timestamp;

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
@Table(name = "bmi_details", schema = "\"dfr\"")
public class BmiDetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "bmi_details_id")
	private Long bmiDetailsId;

	@Column(name = "higth")
	private float higth;
	
	@Column(name = "weigth")
	private float weigth;
	
	@Column(name = "age")
	private Integer age;

	@Column(name = "active")
	private boolean active;
	
	@OneToOne
	@JoinColumn(name="user")
	private UserEntity userEntity; 
	
	@Column(name = "created_date")
	private Timestamp createdDate;
	
	@Column(name = "mail_info")
	private boolean mailInfo;

	public Long getBmiDetailsId() {
		return bmiDetailsId;
	}

	public void setBmiDetailsId(Long bmiDetailsId) {
		this.bmiDetailsId = bmiDetailsId;
	}

	public float getHigth() {
		return higth;
	}

	public void setHigth(float higth) {
		this.higth = higth;
	}

	public float getWeigth() {
		return weigth;
	}

	public void setWeigth(float weigth) {
		this.weigth = weigth;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public UserEntity getUserEntity() {
		return userEntity;
	}

	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public boolean isMailInfo() {
		return mailInfo;
	}

	public void setMailInfo(boolean mailInfo) {
		this.mailInfo = mailInfo;
	}
	
}
