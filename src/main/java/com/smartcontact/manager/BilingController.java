package com.smartcontact.manager;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smartcontact.manager.entity.Bilingentity;
import com.smartcontact.manager.entity.DoctorEntity;
import com.smartcontact.manager.entity.Test;
import com.smartcontact.manager.service.BilingService;
import com.smartcontact.manager.service.DoctorService;

@Controller
@RequestMapping("/Biling")
public class BilingController {

	@Autowired(required=true)
	private BilingService bilingService;
	
	@PostMapping("/addBiling")
	public ResponseEntity addBiling(@RequestBody  Bilingentity bilingEntity)
	{
		try {
			
			
			Bilingentity b=bilingService.AddBiling(bilingEntity);
		
		return ResponseEntity.of(Optional.of(b));
		}
		catch(Exception e)
		{e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
	
	
	
	@PostMapping("/UpdatedBilingById/{bill_id}")
	public ResponseEntity updatedBilingByID(@RequestBody Bilingentity bilingEntity,@PathVariable("bill_id") int id)
	{
		try {
			
			Bilingentity bilingEntity2=bilingService.updatedBiling(bilingEntity,id);
			return ResponseEntity.of(Optional.of(bilingEntity2));
			
		}
		catch(Exception e){
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	
		
	}
	
	@GetMapping("/getBiliByPatientId/{patient_id}")
	public List<Bilingentity> getBillByPatientId(@PathVariable("patient_id") int patient_id)
	{
		List<Bilingentity> bilingReport=bilingService.getReportsByPatientId(patient_id);
		return bilingReport;
		
	}
	
	
	
	
	
	
	
	
}
