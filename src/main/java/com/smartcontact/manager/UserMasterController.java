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

import com.smartcontact.manager.entity.TestFeild;
import com.smartcontact.manager.entity.UserMaster;
import com.smartcontact.manager.service.TestFieldService;
import com.smartcontact.manager.service.UserMasterService;

@RestController
public class UserMasterController {

	
	
	
	
	
public UserMasterService userMasterSerive;
	
	
	@GetMapping("/showUsers")
	public List<UserMaster> showTestField()
	{
		List<UserMaster> lis=(List<UserMaster>) userMasterSerive.getAllRecord();
		
		return lis;
	}
	@PostMapping("/addUser")
	public ResponseEntity addUser(@RequestBody  UserMaster userMaster)
	{
		try {
			
		
			UserMaster b=userMasterSerive.addUser(userMaster);
		
		return ResponseEntity.of(Optional.of(b));
		}
		catch(Exception e)
		{e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
	
	@PostMapping("/delUserById/{user_id}")
	public String delTestFieldByID(@PathVariable("user_id") int id)
	{
		System.out.print("ok");

		userMasterSerive.delUserById(id);
		return "record Delete";
	}
	
	
	@PostMapping("/updatedUserById/{user_id}")
	public ResponseEntity updatedTestField(@RequestBody UserMaster userMasterEntity,@PathVariable("user_id") int id)
	{
		try {
			
			UserMaster userMasterEntity2=userMasterSerive.updatedUserMaster(userMasterEntity,id);
			return ResponseEntity.of(Optional.of(userMasterEntity2));
			
		}
		catch(Exception e){
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	
		
	}
	
	
	
	
	
}
