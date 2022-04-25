package com.mk.erp.dfr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mk.erp.dfr.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

	@Query("select c from UserEntity c where c.emailId = :emailId and c.active=true ")
	public UserEntity findUser(@Param("emailId")String emailId);

}
