package com.smartcontact.manager;

import java.util.List;
import java.util.Optional;
import java.util.Random;

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
import com.smartcontact.manager.entity.Permission;
import com.smartcontact.manager.service.PatienReqTestService;

import io.netty.util.internal.ThreadLocalRandom;





@RestController
@RequestMapping("admin/patientReq")
public class PatientReqController {

	@Autowired
public PatienReqTestService  patientReqService;

	@GetMapping("/patientReq")
	public List<PatientReqTest> getAllRecord()
	{
			List<PatientReqTest> lis=(List<PatientReqTest>)patientReqService.getAllRecord();
		
		return lis;
		
	}
	
	@GetMapping("/getPatientById/{patient_Id}")
	public PatientReqTest getPatientById(@PathVariable("patient_Id") int id)
	{
		PatientReqTest patientInf= patientReqService.getRecordById(id);
		
		
		
		return patientInf;
	}
	
	
	@PostMapping("/addPatientReq")
	public ResponseEntity addPatientReq(@RequestBody  PatientReqTest patientReqTestEntity)
	{
		try {
			
		System.out.println(patientReqTestEntity.getDr_ref_code());
		
		System.out.println();
			PatientReqTest b=patientReqService.addPatientReq(patientReqTestEntity);
		
		return ResponseEntity.of(Optional.of(b));
		}
		catch(Exception e)
		{e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
	
	@GetMapping("/verifyNumber/{phone_no}")
	public int verifyByPhone(@PathVariable("phone_no") String phone_no)
	{
		List<PatientReqTest> listOfPatient=patientReqService.getAllRecordByPhoneNo( phone_no);
	
		
			if(listOfPatient.isEmpty())
			{
				return 0;
			}
			else {
				Random rnd= new Random();
				int otp =ThreadLocalRandom.current().nextInt(1111, 9998 + 1);
				
	    
				
			}
		
		
		return 23;
		
	}
	
	
	
	@GetMapping("/getPatientRequest/{phone_no}")
	public List<PatientReqTest> getTotalPatientRequest(@PathVariable("phone_no") String phone_no)
	{
		List<PatientReqTest> listOfPatient=patientReqService.getAllRecordByPhoneNo( phone_no);
		return listOfPatient;
		
	}
	
	
	
	
	@PostMapping("/delPatientReqByID/{patientReqId}")
	public String delPatientReqByID(@PathVariable("patientReqId") int id)
	{
		System.out.print("ok");

		patientReqService.delPatientReqByID(id);
		return "record Delete sir";
	}
	
	
	
	
	
	
	@PostMapping("/updatedPetietReq/{patient_id}")
	public ResponseEntity updatedPermission(@RequestBody PatientReqTest patientReqTestEntity,@PathVariable("patient_id") int id)
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
	
	
	@GetMapping("/getPatientInfByRefCode/{ref_code}")
	public List<PatientReqTest> getPatientInfByRefCode(@PathVariable String ref_code)
	{
		 List<PatientReqTest> patinetListByDr=patientReqService.getAllRecordByRefCode(ref_code);
		
		return patinetListByDr;
	}
	
	
	
	
	
	

}
