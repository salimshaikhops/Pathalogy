package com.smartcontact.manager.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import com.smartcontact.manager.entity.UserMaster;

public interface UserMasterInt extends CrudRepository<UserMaster,Integer> {

	@Query(" from  UserMaster where username =:username and password=:password")
	public UserMaster getUserMasterByusernameAndPassword(@Param("username") String username,@Param("password") String password);
	
	
}
