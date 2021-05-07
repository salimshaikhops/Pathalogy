
package com.smartcontact.manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartcontact.manager.entity.DoctorEntity;
import com.smartcontact.manager.repository.DoctorRepository;


@Service
public class DoctorService {

	@Autowired
	private DoctorRepository doctorRepository;

	public DoctorEntity addDoctor(DoctorEntity drEntity) {
		// TODO Auto-generated method stub
		
		DoctorEntity drEntity2=doctorRepository.save(drEntity);
		return drEntity2;
	}
	
	
}
