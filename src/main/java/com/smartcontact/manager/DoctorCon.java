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
import org.springframework.web.bind.annotation.RestController;

import com.smartcontact.manager.entity.DoctorEntity;
import com.smartcontact.manager.service.DoctorService;



@RestController
public class DoctorCon {
sdsd
	
	@Autowired(required=true)
	private DoctorService doctorService;
	
	@GetMapping("/showDoctors")
	public List<DoctorEntity> showDoctor()
	{
		return doctorService.getAllRecord();
		
		
	}
	
	@PostMapping("/addDoctor")
	public ResponseEntity addDoctor(@RequestBody  DoctorEntity drEntity)
	{
		try {
			
		
		DoctorEntity b=doctorService.addDoctor(drEntity);
		System.out.print("ok");
		
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
