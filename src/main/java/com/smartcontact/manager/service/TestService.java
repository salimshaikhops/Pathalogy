package com.smartcontact.manager.service;

import java.util.ArrayList;
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

	public List<Test> getTestByGroupId(int group_id) {
		// TODO Auto-generated method stub
		List<Test> listTest=(List<Test>) testRepository.findAll();
		List<Test> listTestByGroupById=new ArrayList<Test>();
		System.out.println(group_id);
		for(Test t:listTest)
		{
			if(t.getGroup_id().getGroup_id() == group_id) 
				listTestByGroupById.add(t);
		}
		return listTestByGroupById;
	}

	public Test getTestByCode(String test_code) {
		// TODO Auto-generated method stub
		Test t=testRepository.getTestByCode(test_code);
		return t;
	}

	
	
}
