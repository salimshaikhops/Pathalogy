package com.smartcontact.manager;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartcontact.manager.entity.DoctorEntity;
import com.smartcontact.manager.service.DoctorService;



@RestController
@RequestMapping("/doctor")
public class DoctorCon {
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired(required=true)
	private DoctorService doctorService;
	
	
	
	@PostMapping("/logindr")
	public DoctorEntity Log(@RequestBody DoctorEntity dr) throws Exception
	
	{ DoctorEntity dr1;
		if(dr.getDr_username() !=null || dr.getDr_password() !=null)
		{
			
			dr1 =doctorService.checkAuth(dr.getDr_username(), dr.getDr_password());
			
		}
		else {
			 dr1=null;
		}
		return dr1;
		
		
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
	
	
}
