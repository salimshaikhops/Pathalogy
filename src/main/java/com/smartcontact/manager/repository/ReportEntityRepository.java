package com.smartcontact.manager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.smartcontact.manager.entity.PatientReqTest;
import com.smartcontact.manager.entity.ReportEntity;

public interface ReportEntityRepository  extends CrudRepository<ReportEntity,Integer> {

	
	@Query("select u from ReportEntity u where u.patient_id=:patient_id")
	public List<ReportEntity> getReportById(@Param("patient_id") int patient_id);

	
	

	
	
	
}
