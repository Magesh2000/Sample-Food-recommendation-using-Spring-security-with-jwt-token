package com.mk.erp.dfr.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.mk.erp.dfr.dao.SignupDAO;
import com.mk.erp.dfr.dto.UserDTO;
import com.mk.erp.dfr.entity.UserEntity;

@Service
public class SignupService {

	@Value("${defaultPassword}")
	private String defaultPassword;

	@Autowired
	private EmailSender emailSender;

	@Autowired
	private SignupDAO signupDao;

	public void createUser(UserDTO userDTO) {

		UserEntity userEntity = new UserEntity();

		userEntity.setEmailId(userDTO.getEmailId());

		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

		String encrypeted = passwordEncoder.encode(userDTO.getPassword());

		userEntity.setPassword(encrypeted);

		userEntity.setFirstName(userDTO.getFirstName());
		userEntity.setMiddleName(userDTO.getMiddleName());
		userEntity.setLastName(userDTO.getLastName());
		userEntity.setContactAddress(userDTO.getContactAddress());
		userEntity.setContactNumber(userDTO.getContactNumber());
		userEntity.setDistrict(userDTO.getDistrict());
		userEntity.setState(userDTO.getState());
		userEntity.setGender(userDTO.getGender());
		userEntity.setActive(true);
		userEntity.setFirstLogin(0);
		userEntity.setCreatedDate(new Date());

		signupDao.createUser(userEntity);

	}

}
