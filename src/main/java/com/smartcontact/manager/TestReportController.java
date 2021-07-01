package com.smartcontact.manager;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartcontact.manager.entity.PatientReqTest;
import com.smartcontact.manager.entity.ReportEntity;
import com.smartcontact.manager.entity.Test;
import com.smartcontact.manager.entity.TestFeild;
import com.smartcontact.manager.service.PatienReqTestService;
import com.smartcontact.manager.service.ReportEntityService;
import com.smartcontact.manager.service.TestFieldService;
@RestController
@RequestMapping("admin/TestReport")
public class TestReportController {

	@Autowired
	public PatienReqTestService  patientReqService;
	
	@Autowired
	public TestFieldService testFieldService;
	
	
	@Autowired
	public ReportEntityService reportEntityService;

	@GetMapping("/getPatientById/{patient_Id}")
	public PatientReqTest getPatientById(@PathVariable("patient_Id") int id)
	{
		PatientReqTest patientInf= patientReqService.getRecordById(id);
		
		
		
		return patientInf;
	}
	
	
	
	@GetMapping("/getTestFieldById/{test_Id}")
	public List<TestFeild> getTestFieldById(@PathVariable("test_Id") Test test_id)
	{
		return testFieldService.getTestFeildByTestId(test_id);
	}
	
	
	
	@PostMapping("/AddReport")
	public ReportEntity  TestReportController(@RequestBody ReportEntity reportEntity) {
		
		ReportEntity reportEntity2=reportEntityService.saveData(reportEntity);
		return reportEntity2;
		
	}
	
	
	@GetMapping("/getReportByPatientId/{patient_id}")
	public List<ReportEntity> getReportPatientId(@PathVariable("patient_id") int patient_id)
	{
		return reportEntityService.getReportPatientById(patient_id);
	}
	
	
	
	
	
	
	
	
	
}
