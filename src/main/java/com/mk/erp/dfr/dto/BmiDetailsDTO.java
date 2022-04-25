package com.mk.erp.dfr.dto;

public class BmiDetailsDTO {

	private Long bmiDetailsId;

	private float higth;
	
	private float weigth;
	
	private Integer age;

	private boolean active;
	
	private UserDTO userDTO;

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

	public UserDTO getUserDTO() {
		return userDTO;
	}

	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}
	
}
