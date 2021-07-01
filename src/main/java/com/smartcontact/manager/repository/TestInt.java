package com.smartcontact.manager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.smartcontact.manager.entity.Test;

public interface TestInt extends CrudRepository<Test,Integer> {

	@Query("select t from Test t where t.test_code=:test_code")
	public Test getTestByCode(@Param("test_code") String test_code);

	

	
}
