package com.smartcontact.manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartcontact.manager.entity.DocRefCode;
import com.smartcontact.manager.entity.DoctorEntity;
import com.smartcontact.manager.repository.DocRefCodeInt;
@Service
public class DocRefCodeService  {

	@Autowired
	private DocRefCodeInt docRefCodeRepository;

	public List<DocRefCode> getAllRecord() {
		// TODO Auto-generated method stub
		List<DocRefCode> lis=(List<DocRefCode>)docRefCodeRepository.findAll();
		return lis;
	}

	public DocRefCode addRefCode(DocRefCode drRefEntity) {
		// TODO Auto-generated method stub
		DocRefCode drRefEntity2=docRefCodeRepository.save(drRefEntity);
		return drRefEntity2;
	}

	public void deleteRefcodeById(int id) {
		// TODO Auto-generated method stub
		docRefCodeRepository.deleteById(id);
		
		
	}

	public DocRefCode updatedDoctro(DocRefCode drRefEntity, int id) {
		// TODO Auto-generated method stub
		
		drRefEntity.setDr_ref_id(id);
		 return docRefCodeRepository.save(drRefEntity);
		
	}
	
	
	
	
	
	
}
