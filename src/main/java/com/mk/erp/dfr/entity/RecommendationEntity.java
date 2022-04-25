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
@Table(name = "recommendation", schema = "\"dfr\"")
public class RecommendationEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "recommendation_id")
	private Long recommendationId;

	@Column(name = "fruits")
	private String fruits;
	
	@Column(name = "vegetables")
	private String vegetables;
	
	@Column(name = "food")
	private String food;
	
	@Column(name = "active")
	private boolean active;
	
	@OneToOne
	@JoinColumn(name="disease")
	private DiseaseEntity  diseaseEntity;

	public Long getRecommendationId() {
		return recommendationId;
	}

	public void setRecommendationId(Long recommendationId) {
		this.recommendationId = recommendationId;
	}

	public String getFruits() {
		return fruits;
	}

	public void setFruits(String fruits) {
		this.fruits = fruits;
	}

	public String getVegetables() {
		return vegetables;
	}

	public void setVegetables(String vegetables) {
		this.vegetables = vegetables;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public DiseaseEntity getDiseaseEntity() {
		return diseaseEntity;
	}

	public void setDiseaseEntity(DiseaseEntity diseaseEntity) {
		this.diseaseEntity = diseaseEntity;
	}

}
