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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartcontact.manager.entity.Permission;
import com.smartcontact.manager.entity.TestFeild;
import com.smartcontact.manager.service.PermissionService;
import com.smartcontact.manager.service.TestFieldService;



@RestController
@RequestMapping("admin/permission")
public class PermissionController {

	@Autowired
public  PermissionService permissionService;

	@GetMapping("/showPermission")
	public List<Permission> showPermisson()
	{
			List<Permission> lis=(List<Permission>)permissionService.getAllRecord();
		
		return lis;
		
	}
	
	
	@PostMapping("/addPermission")
	public ResponseEntity addTestField(@RequestBody  Permission permissionEntity)
	{
		try {
			
		
			Permission b=permissionService.addPermission(permissionEntity);
		
		return ResponseEntity.of(Optional.of(b));
		}
		catch(Exception e)
		{e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
	
	
	
	@PostMapping("/delPermission/{permission_id}")
	public String delPermissionByID(@PathVariable("permission_id") int id)
	{
		System.out.print("ok");

		permissionService.delPermissionByID(id);
		return "record Delete";
	}
	
	
	
	
	
	
	@PostMapping("/updatedPermission/{permission_id}")
	public ResponseEntity updatedPermission(@RequestBody Permission permissionEntity,@PathVariable("permission_id") int id)
	{
		try {
			
			Permission permissionEntity2=permissionService.updatedPermission(permissionEntity,id);
			return ResponseEntity.of(Optional.of(permissionEntity2));
			
		}
		catch(Exception e){
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	
		
	}
	
	
	
	
	

}
