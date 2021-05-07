package com.smartcontact.manager;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.smartcontact.manager.entity.DoctorEntity;
import com.smartcontact.manager.service.DoctorService;



@RestController
public class DoctorCon {

	
	@Autowired(required=true)
	private DoctorService doctorService;
	
	@GetMapping("/add")
	public String addd()
	{
		return "sajn";
		
		
	}
	
	@PostMapping("/addDoctor")
	public ResponseEntity addDoctor(@RequestBody  DoctorEntity drEntity)
	{
		try {
			
		
		DoctorEntity b=doctorService.addDoctor(drEntity);
		
		return ResponseEntity.of(Optional.of(b));
		}
		catch(Exception e)
		{e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
