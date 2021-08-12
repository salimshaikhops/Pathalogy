package com.smartcontact.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smartcontact.manager.entity.DoctorEntity;
import com.smartcontact.manager.service.DoctorService;

import com.smartcontact.manager.entity.PatientReqTest;
import com.smartcontact.manager.entity.UserMaster;

@RestController
@RequestMapping("/dr")
public class DoctorCon {
	
	
	@Autowired(required=true)
	private DoctorService doctorService;
	
	@RequestMapping("/doctorRegistration")
	public String doctorRegistration()
	{
		return "DoctorRegistration";
	}
	
	
	

@PostMapping("/loginDr")
public List Log(@RequestBody Map<String, String> dr) throws Exception

{ DoctorEntity drentity;
	if(dr.get("dr_Username") !=null || dr.get("dr_Password") !=null)
	{
		drentity =doctorService.checkAuth(dr.get("dr_Username"), dr.get("dr_Password"));
	}
	else {
		drentity=null;
	}
	List li =new ArrayList();
	li.add(drentity.getDr_name());

	li.add(drentity.getDr_username());

	li.add(drentity.getDr_name());

	li.add(drentity.getRef_code());
	return li;
	
	
}
	
	
	
	@GetMapping("/showDoctors")
	public List<DoctorEntity> showDoctor()
	{
		return doctorService.getAllRecord();
		
		
	}
	
	@PostMapping("/addDoctor")
	public ResponseEntity addDoctor(@RequestBody  DoctorEntity drEntity)
	{
		try {
			
			drEntity.setDr_password(drEntity.getDr_password());
		DoctorEntity b=doctorService.addDoctor(drEntity);
		
		
		
		return ResponseEntity.of(Optional.of(b));
		}
		catch(Exception e)
		{e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
	
	@PostMapping("/delDoctor/{dr_id}")
	public String delDoctorByID(@PathVariable("dr_id") int id)
	{
		System.out.print("ok");

		doctorService.delDoctorByID(id);
		return "record Delete";
	}
	
	
	
	
	
	
	@PostMapping("/UpdatedDoctor/{dr_id}")
	public ResponseEntity updatedDoctor(@RequestBody DoctorEntity drEntity,@PathVariable("de_id") int id)
	{
		try {
			
			DoctorEntity drEntity2=doctorService.updatedDoctro(drEntity,id);
			return ResponseEntity.of(Optional.of(drEntity2));
			
		}
		catch(Exception e){
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	
		
	}
	
	
	@PutMapping("/updatedRefCode/{dr_id}/{ref_code}")
	public DoctorEntity updatedRefCode(@PathVariable  int dr_id,@PathVariable String ref_code)
	{
		
		DoctorEntity drEntity=doctorService.updatedRedByDrId(dr_id,ref_code);
		System.out.println(drEntity);
		return drEntity;
	}
	
	
	
	}
	
	
	
	

