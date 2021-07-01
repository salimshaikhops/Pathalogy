package com.smartcontact.manager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.smartcontact.manager.entity.DoctorEntity;
import com.smartcontact.manager.entity.PatientReqTest;

public interface PatientReqInt extends CrudRepository<PatientReqTest,Integer>{

	@Query("select u from PatientReqTest u where u.dr_ref_code =:ref_code")
	public List<PatientReqTest> getAll(@Param("ref_code") String dr_ref_code);

	@Query("select u from PatientReqTest u where u.Phone_no=:phone_no")
	public List<PatientReqTest> getAllPatientByPhoneNo(@Param("phone_no") String phone_no);

	


	
	

	

	

}
