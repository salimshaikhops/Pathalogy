package com.smartcontact.manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartcontact.manager.entity.Permission;
import com.smartcontact.manager.entity.ReportEntity;
import com.smartcontact.manager.entity.Test;
import com.smartcontact.manager.entity.TestFeild;
import com.smartcontact.manager.repository.TestFieldInt;

@Service
public class TestFieldService {
	
	@Autowired
	private TestFieldInt testFieldRepository;

	public List<TestFeild> getAllRecord() {
		// TODO Auto-generated method stub
		
		List<TestFeild> lis=(List<TestFeild>)testFieldRepository.findAll();
		return lis;
	}

	public TestFeild addTestField(TestFeild testFieldEntity) {
		// TODO Auto-generated method stub
		TestFeild testFieldEntity2=testFieldRepository.save(testFieldEntity);
		return testFieldEntity2;

	}

	public void delPermissionByID(int id) {
		// TODO Auto-generated method stub
		testFieldRepository.deleteById(id);
	}

	public TestFeild updatedTestField(TestFeild testFieldEntity, int id) {
		// TODO Auto-generated method stub
		testFieldEntity.setTest_field_id(id);
		
		return testFieldRepository.save(testFieldEntity) ;
		
	}

	

	public List<TestFeild> getTestFeildByTestId(Test test_id) {
		// TODO Auto-generated method stub
		List<TestFeild> testFieldList=testFieldRepository.findTestfeildByTestId(test_id);
		return testFieldList;
	}


	
	
	
	
	
	
}
