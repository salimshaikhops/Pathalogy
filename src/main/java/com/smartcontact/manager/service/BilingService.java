package com.smartcontact.manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartcontact.manager.entity.Bilingentity;
import com.smartcontact.manager.entity.DoctorEntity;
import com.smartcontact.manager.repository.BilingRepository;
import com.smartcontact.manager.repository.DoctorRepository;

@Service
public class BilingService {
	
	
	@Autowired
	private BilingRepository  bilingRepository;
	
	
	public Bilingentity AddBiling(Bilingentity bilingEntity) {
		// TODO Auto-generated method stub
		
		Bilingentity bilingEntity2=bilingRepository.save(bilingEntity);
		return bilingEntity2;
	}
	
	
	
	public List<Bilingentity> getAllRecord() {
		// TODO Auto-generated method stub
		List<Bilingentity>  listdr=(List<Bilingentity> )bilingRepository.findAll();
		return listdr;
	}

	
	public Bilingentity updatedBiling(Bilingentity bilingEntity, int id) {
		bilingEntity.setBilling_id(id);
		 return bilingRepository.save(bilingEntity);
		
	}



	public List<Bilingentity> getReportsByPatientId(int patient_id) {
		// TODO Auto-generated method stub
		
		List<Bilingentity> bilingReport=bilingRepository.getBillByPatientId(patient_id);
		
		return bilingReport;
			}

}
