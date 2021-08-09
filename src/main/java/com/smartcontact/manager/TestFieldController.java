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

import com.smartcontact.manager.entity.Test;
import com.smartcontact.manager.entity.TestFeild;

import com.smartcontact.manager.service.TestFieldService;

@RestController
@RequestMapping("admin/testFieldControll")
public class TestFieldController {


@Autowired
public TestFieldService testFieldService;
	



@RequestMapping("/AddTestFieldsUi")
public String AddTest()
{
	return "AddFieldUi";
}

	
	@GetMapping("/showTestField")
	public List<TestFeild> showTestField()
	{
		List<TestFeild> lis=(List<TestFeild>) testFieldService.getAllRecord();
		
		return lis;
	}
	@PostMapping("/addTestFields")
	public ResponseEntity addTestField(@RequestBody  TestFeild testFieldEntity)
	{
		try {
			
		
			TestFeild b=testFieldService.addTestField(testFieldEntity);
		
		return ResponseEntity.of(Optional.of(b));
		}
		catch(Exception e)
		{e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
	
	@PostMapping("/delTestField/{testField_id}")
	public String delTestFieldByID(@PathVariable("testField_id") int id)
	{
		System.out.print("ok");

		testFieldService.delPermissionByID(id);
		return "record Delete";
	}
	
	
	@PostMapping("/UpdatedTestFiled/{testField_id}")
	public ResponseEntity updatedTestField(@RequestBody TestFeild testFieldEntity,@PathVariable("testField_id") int id)
	{
		try {
			
			TestFeild testFieldEntity2=testFieldService.updatedTestField(testFieldEntity,id);
			return ResponseEntity.of(Optional.of(testFieldEntity2));
			
		}
		catch(Exception e){
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	
		
	}
	
	
	
	@GetMapping("/getFieldByTestId/{test_id}")
	public List<TestFeild> getTestFieldByTestId(@PathVariable("test_id") Test test_id)
	{
		
		List<TestFeild> testFeildList=testFieldService.getTestFeildByTestId(test_id);
		return testFeildList;
		
		
	}
	
	
	
	
	
}
