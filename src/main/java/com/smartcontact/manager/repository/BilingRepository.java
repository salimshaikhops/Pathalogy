package com.smartcontact.manager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.smartcontact.manager.entity.Bilingentity;
import com.smartcontact.manager.entity.GroupMaster;

public interface BilingRepository extends   CrudRepository<Bilingentity,Integer>{

	
	
	
	@Query("select t from Bilingentity t where t.patient_req_id=:patient_id")
	public List<Bilingentity> getBillByPatientId(@Param("patient_id") int patient_id);
	
	
	
	
	
	
	
}
