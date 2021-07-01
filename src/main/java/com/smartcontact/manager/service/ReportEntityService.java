package com.smartcontact.manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartcontact.manager.entity.ReportEntity;
import com.smartcontact.manager.entity.Test;
import com.smartcontact.manager.repository.ReportEntityRepository;
import com.smartcontact.manager.repository.TestFieldInt;

@Service
public class ReportEntityService {

	
	
	
	@Autowired
	private ReportEntityRepository reportEntityRepository ;



	public ReportEntity saveData(ReportEntity reportEntity) {
		// TODO Auto-generated method stub
		ReportEntity reportEntity2=reportEntityRepository.save(reportEntity);
		
		
		
		return reportEntity2;
	}
	
	
	


	public List<ReportEntity> getReportPatientById(int patient_id) {
		// TODO Auto-generated method stub
		return reportEntityRepository.getReportById(patient_id);
	}





	
	
	
	
	
}
