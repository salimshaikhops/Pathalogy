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
import org.springframework.web.bind.annotation.RestController;

import com.smartcontact.manager.entity.DoctorEntity;
import com.smartcontact.manager.entity.Permission;
import com.smartcontact.manager.entity.TestFeild;
import com.smartcontact.manager.entity.UserMaster;
import com.smartcontact.manager.service.TestFieldService;
import com.smartcontact.manager.service.UserMasterService;

@Controller

@RequestMapping("admin/userMaster")
public class UserMasterController {

	
	
	
	
	@Autowired
public UserMasterService userMasterSerive;
	
@RequestMapping("/loginBydoctor")
public String  DoctroLogin()
{
	return "login";
	
}




@RequestMapping("/LoginByAdminorUser")
public String AdminLogin()
{
	return "LoginByAdminorUser";
}
	


@RequestMapping("/AssignPermission")
public String AssignPermission()
{
	return "AssignPermission";
}


@RequestMapping("/UserRegistration")
public String UsrtRegistration()
{
	return "UserRegistration";
}


@PostMapping("/loginuser")
public UserMaster Log(@RequestBody UserMaster user) throws Exception

{ UserMaster user1;
	if(user.getUsername() !=null || user.getPassword() !=null)
	{
		
		user1 =userMasterSerive.checkAuth(user.getUsername(), user.getPassword());
		
	}
	else {
		 user1=null;
	}
	return user1;
	
	
}


	
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
	
	@GetMapping("/getAllUser")
	public List<UserMaster> getAllUser()
	{
		List<UserMaster> userList=userMasterSerive.getAllRecord();
		return userList;
	
	}
	
	
	
	@GetMapping("/getUserById/{user_id}")
	public UserMaster getUserById(@PathVariable("user_id") int user_id)
	{
		UserMaster userMaster=userMasterSerive.getUserById(user_id);
		return userMaster;
		
	}
	
	@GetMapping("/getUserPermissionById/{user_id}")
	public List<Permission> getUserPermissionById(@PathVariable("user_id") int user_id)
	{
		
		UserMaster userMaster=userMasterSerive.getUserById(user_id);
		List<Permission> permissionList=userMaster.getPermission_list();
		
		return permissionList ;
		
	}
	
}
