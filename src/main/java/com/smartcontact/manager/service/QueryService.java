package com.smartcontact.manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartcontact.manager.entity.DoctorEntity;
import com.smartcontact.manager.entity.QueryEntity;
import com.smartcontact.manager.repository.DoctorRepository;
import com.smartcontact.manager.repository.QueryRepository;

@Service
public class QueryService {


	@Autowired
private QueryRepository queryRepository;
	
	
	public QueryEntity addQuery(QueryEntity queryEntity) {
		// TODO Auto-generated method stub
		
		QueryEntity queryEntity2=queryRepository.save(queryEntity);
		return queryEntity2;
	}
}
