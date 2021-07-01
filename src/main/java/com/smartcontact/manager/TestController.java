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
import com.smartcontact.manager.entity.Test;
import com.smartcontact.manager.service.PermissionService;
import com.smartcontact.manager.service.TestService;

@RestController
@RequestMapping("admin/testControll")
public class TestController {


@Autowired
public TestService testService ;
	
	
	@GetMapping("/showTest")
	public List<Test> showTestq()
	{
		List<Test> lis=(List<Test>) testService.getAllRecord();
		
		return lis;
	}
	@PostMapping("/addTest")
	public ResponseEntity addParmission(@RequestBody  Test testEntity)
	{
		try {
			
		
			Test b=testService.addTest(testEntity);
		
		return ResponseEntity.of(Optional.of(b));
		}
		catch(Exception e)
		{e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
	
	@PostMapping("/delTest/{test_id}")
	public String delTestByID(@PathVariable("test_id") int id)
	{
		System.out.print("ok");

		testService.delTestByID(id);
		return "record Delete";
	}
	
	
	@PostMapping("/UpdatedTestById/{test_id}")
	public ResponseEntity updatedTestByID(@RequestBody Test testEntity,@PathVariable("test_id") int id)
	{
		try {
			
			Test testEntity2=testService.updatedTestByID(testEntity,id);
			return ResponseEntity.of(Optional.of(testEntity2));
			
		}
		catch(Exception e){
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	
		
	}
	
	
	@GetMapping("/getTestByGroupId/{group_id}")
	public List<Test> getTestByGroupId(@PathVariable("group_id") int group_id)
	{
		List<Test> testList=testService.getTestByGroupId(group_id);
		return testList;
		
	}
	
	
	
	
	@GetMapping("/getTestByTestCode/{test_code}")
	public Test getTestBycode(@PathVariable("test_code") String test_code)
	{
		
		Test t=testService.getTestByCode(test_code);
		System.out.println(t.getUser_master().getEmail());
		return t;
	}
	
	
}
