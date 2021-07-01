package com.smartcontact.manager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.smartcontact.manager.entity.Test;
import com.smartcontact.manager.entity.TestFeild;

public interface TestFieldInt extends CrudRepository<TestFeild,Integer> {

	@Query("select u from TestFeild u where u.test_id=:test_id")
	public List<TestFeild> findTestfeildByTestId(@Param("test_id") Test test_id);

}
