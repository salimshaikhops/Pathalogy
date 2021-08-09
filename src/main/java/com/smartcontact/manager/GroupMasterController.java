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

import com.smartcontact.manager.entity.DocRefCode;
import com.smartcontact.manager.entity.GroupMaster;
import com.smartcontact.manager.repository.GroupMasterInt;
import com.smartcontact.manager.service.DocRefCodeService;
import com.smartcontact.manager.service.GroupMasterService;

@RestController
@RequestMapping("admin/group")
public class GroupMasterController {

	
	
@Autowired
public GroupMasterService groupMasterService;
	
	


	@RequestMapping("/addGroupUi")
public String AddGroupUi()	{

		return "AddGroupUi";
	}



	@GetMapping("/showGroup")
	public List<GroupMaster> showGroup()
	{
		List<GroupMaster> lis=(List<GroupMaster>) groupMasterService.getAllRecord();
		
		return lis;
	}
	@PostMapping("/addGroup")
	public ResponseEntity addRefCode(@RequestBody  GroupMaster groupEntity)
	{
		try {
			
		
		GroupMaster b=groupMasterService.addGroupName(groupEntity);
		
		return ResponseEntity.of(Optional.of(b));
		}
		catch(Exception e)
		{e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
	
	@PostMapping("/delGroup/{group_id}")
	public String delGroupByID(@PathVariable("group_id") int id)
	{
		System.out.print("ok");

		groupMasterService.deleteGroupById(id);
		return "record Delete";
	}
	
	
	@PostMapping("/UpdatedRefCode/{group_id}")
	public ResponseEntity updatedGroup(@RequestBody GroupMaster groupEntity,@PathVariable("group_id") int id)
	{
		try {
			
			GroupMaster drEntity2=groupMasterService.updatedGroup(groupEntity,id);
			return ResponseEntity.of(Optional.of(drEntity2));
			
		}
		catch(Exception e){
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	
		
	}
	
	
	@GetMapping("/getAllGroup")
	public List<GroupMaster> getAll()
	{
		List<GroupMaster> groupList=groupMasterService.getAllRecord();
		return groupList ;
		
	}
	
	@GetMapping("/getGroupById/{group_id}")
	public GroupMaster getGroupById(@PathVariable("group_id") int group_id)
	{
		GroupMaster groupMaster=groupMasterService.getGroupById(group_id);
		return groupMaster;
		
	}
	
	
	
}
