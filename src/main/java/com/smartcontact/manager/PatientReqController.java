package com.smartcontact.manager;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.smartcontact.manager.entity.PatientReqTest;
import com.smartcontact.manager.entity.Permission;
import com.smartcontact.manager.service.PatienReqTestService;





@RestController
public class PatientReqController {

public PatienReqTestService  patientReqService;

	@GetMapping("/patientReq")
	public List<PatientReqTest> getAllRecord()
	{
			List<PatientReqTest> lis=(List<PatientReqTest>)patientReqService.getAllRecord();
		
		return lis;
		
	}
	
	
	@PostMapping("/addPatientReq")
	public ResponseEntity addPatientReq(@RequestBody  PatientReqTest patientReqTestEntity)
	{
		try {
			
		
			PatientReqTest b=patientReqService.addPatientReq(patientReqTestEntity);
		
		return ResponseEntity.of(Optional.of(b));
		}
		catch(Exception e)
		{e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
	
	
	
	@PostMapping("/delPatientReqByID/{patientReqId}")
	public String delPatientReqByID(@PathVariable("patientReqId") int id)
	{
		System.out.print("ok");

		patientReqService.delPatientReqByID(id);
		return "record Delete sir";
	}
	
	
	
	
	
	
	@PostMapping("/updatedPermission/{testField_id}")
	public ResponseEntity updatedPermission(@RequestBody PatientReqTest patientReqTestEntity,@PathVariable("testField_id") int id)
	{
		try {
			
			PatientReqTest patientReqTestEntity2=patientReqService.updatedPatientReq(patientReqTestEntity,id);
			return ResponseEntity.of(Optional.of(patientReqTestEntity2));
			
		}
		catch(Exception e){
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	
		
	}

}
