package com.smartcontact.manager;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartcontact.manager.entity.DocRefCode;
import com.smartcontact.manager.entity.DoctorEntity;
import com.smartcontact.manager.service.DocRefCodeService;

@RestController
@RequestMapping("/dr")
public class DocRefController {
	
	public DocRefCodeService drRefCodeService;
	
	
	@GetMapping("/showDrRefCode")
	public List<DocRefCode> showDoctor()
	{
		return drRefCodeService.getAllRecord();
		
		
	}
	@PostMapping("/addRefCode")
	public ResponseEntity addRefCode(@RequestBody  DocRefCode drEntity)
	{
		try {
			
		
		DocRefCode b=drRefCodeService.addRefCode(drEntity);
		
		return ResponseEntity.of(Optional.of(b));
		}
		catch(Exception e)
		{e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
	
	@PostMapping("/delRefcode/{drRef_id}")
	public String delRefcodeByID(@PathVariable("drRef_id") int id)
	{
		System.out.print("ok");

		drRefCodeService.deleteRefcodeById(id);
		return "record Delete";
	}
	
	
	@PostMapping("/UpdatedRefCode/{drRef_id}")
	public ResponseEntity updatedDoctor(@RequestBody DocRefCode drRefEntity,@PathVariable("drRef_id") int id)
	{
		try {
			
			DocRefCode drEntity2=drRefCodeService.updatedDoctro(drRefEntity,id);
			return ResponseEntity.of(Optional.of(drEntity2));
			
		}
		catch(Exception e){
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	
		
	}
	
	

}
 