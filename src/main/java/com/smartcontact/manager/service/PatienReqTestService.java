package com.smartcontact.manager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartcontact.manager.entity.PatientReqTest;
import com.smartcontact.manager.entity.Permission;
import com.smartcontact.manager.repository.PatientReqInt;



@Service
public class PatienReqTestService {
	@Autowired
	private PatientReqInt  patientReqRepository;

	public List<PatientReqTest> getAllRecord() {
		// TODO Auto-generated method stub
		
		List<PatientReqTest> lis=(List<PatientReqTest>)patientReqRepository.findAll();
		return lis;
		
	}

	public PatientReqTest addPatientReq(PatientReqTest patientReqTestEntity) {
		// TODO Auto-generated method stub
		
		PatientReqTest patientReqTestEntity2=patientReqRepository.save(patientReqTestEntity);
		
		return patientReqTestEntity2;
	}

	public void delPatientReqByID(int id) {
		// TODO Auto-generated method stub
		patientReqRepository.deleteById(id);
	}

	public PatientReqTest updatedPatientReq(PatientReqTest patientReqTestEntity, int id) {
		// TODO Auto-generated method stub
		patientReqTestEntity.setPatient_req_test_id(id);
		
		return patientReqRepository.save(patientReqTestEntity);
	}
	public  List<PatientReqTest>  getAllRecordByRefCode(String dr_ref_code) {
		// TODO Auto-generated method stub
		 List<PatientReqTest> listOfPatient=patientReqRepository.getAll(dr_ref_code);
		return listOfPatient;
	}

	public PatientReqTest getRecordById(int id) {
		// TODO Auto-generated method stub
		Optional<PatientReqTest> patientRe=  patientReqRepository.findById(id);
		PatientReqTest patientInf=patientRe.get();
		return patientInf;
	}


	public List<PatientReqTest> getAllRecordByPhoneNo(String phone_no) {
		// TODO Auto-generated method stub
		 return patientReqRepository.getAllPatientByPhoneNo(phone_no) ;
	}
}