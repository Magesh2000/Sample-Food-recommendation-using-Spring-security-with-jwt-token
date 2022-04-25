package com.mk.erp.dfr.dto;

import java.util.List;

public class RecommendationDTO {

	private Long recommendationId;

	private String fruits;

	private String vegetables;

	private String food;

	private boolean active;
	
	private Long diseaseId;
	
	private String diseaseName;

	private DiseaseDTO diseaseDTO;
	
	private List<String> fruitsList;

	private  List<String> vegetablesList;

	private  List<String> foodList;

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

	public DiseaseDTO getDiseaseDTO() {
		return diseaseDTO;
	}

	public void setDiseaseDTO(DiseaseDTO diseaseDTO) {
		this.diseaseDTO = diseaseDTO;
	}

	public Long getDiseaseId() {
		return diseaseId;
	}

	public void setDiseaseId(Long diseaseId) {
		this.diseaseId = diseaseId;
	}

	public String getDiseaseName() {
		return diseaseName;
	}

	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

	public List<String> getFruitsList() {
		return fruitsList;
	}

	public void setFruitsList(List<String> fruitsList) {
		this.fruitsList = fruitsList;
	}

	public List<String> getVegetablesList() {
		return vegetablesList;
	}

	public void setVegetablesList(List<String> vegetablesList) {
		this.vegetablesList = vegetablesList;
	}

	public List<String> getFoodList() {
		return foodList;
	}

	public void setFoodList(List<String> foodList) {
		this.foodList = foodList;
	}

}
