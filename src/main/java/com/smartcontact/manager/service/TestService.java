package com.smartcontact.manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.smartcontact.manager.entity.Test;
import com.smartcontact.manager.repository.TestInt;

@Service
public class TestService {
	@Autowired
	private TestInt testRepository;

	public List<Test> getAllRecord() {
		// TODO Auto-generated method stub
		List<Test> lis=(List<Test>)testRepository.findAll();
		return lis;
	}

	public Test addTest(Test testEntity) {
		// TODO Auto-generated method stub
		Test testEntity2=testRepository.save(testEntity);
		return testEntity2;
	}

	public void delTestByID(int id) {
		// TODO Auto-generated method stub
		testRepository.deleteById(id);
		
	}

	public Test updatedTestByID(Test testEntity, int id) {
		// TODO Auto-generated method stub
		testEntity.setTest_id(id);
		
		return testRepository.save(testEntity);
	}
	
}
