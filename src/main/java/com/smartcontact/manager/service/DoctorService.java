
package com.smartcontact.manager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartcontact.manager.entity.DoctorEntity;
import com.smartcontact.manager.entity.PatientReqTest;
import com.smartcontact.manager.repository.DoctorRepository;
import com.smartcontact.manager.repository.PatientReqInt;


@Service
public class DoctorService {

	@Autowired
	private DoctorRepository doctorRepository;
	
	
	public DoctorEntity addDoctor(DoctorEntity drEntity) {
		// TODO Auto-generated method stub
		
		DoctorEntity drEntity2=doctorRepository.save(drEntity);
		return drEntity2;
	}

	public List<DoctorEntity> getAllRecord() {
		// TODO Auto-generated method stub
		List<DoctorEntity>  listdr=(List<DoctorEntity> )doctorRepository.findAll();
		return listdr;
	}

	public void delDoctorByID(int id) {
		// TODO Auto-generated method stub
		 doctorRepository.deleteById(id);
		
	}

	public DoctorEntity updatedDoctro(DoctorEntity drEntity, int id) {
		drEntity.setId(id);
		 return doctorRepository.save(drEntity);
		
	}

	public DoctorEntity checkAuth(String dr_username, String dr_password) {
		// TODO Auto-generated method stub
		return doctorRepository.getDoctorBydr_usernameAnddr_password(dr_username,dr_password);
	}

	public DoctorEntity updatedRedByDrId(int dr_id, String ref_code) {
		// TODO Auto-generated method stub
		Optional<DoctorEntity> drEntity=doctorRepository.findById(dr_id);
		DoctorEntity drEntity2 =drEntity.get();
		
		drEntity2.setRef_code_id(ref_code);
		
		return doctorRepository.save(drEntity2);
	}

	

	
	
	
}
