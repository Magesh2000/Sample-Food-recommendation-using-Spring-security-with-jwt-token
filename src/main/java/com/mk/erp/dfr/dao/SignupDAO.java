package com.mk.erp.dfr.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mk.erp.dfr.entity.UserEntity;
import com.mk.erp.dfr.repository.UserRepository;

@Component
public class SignupDAO {

	@Autowired
	public UserRepository userRepository;

	public UserEntity createUser(UserEntity userEntity) {

		return userRepository.save(userEntity);

	}

}
