package com.smartcontact.manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartcontact.manager.entity.PatientReqTest;
import com.smartcontact.manager.entity.Permission;
import com.smartcontact.manager.repository.PermissionInt;

@Service
public class PermissionService {
	@Autowired
	private PermissionInt permissionRepository;

	public List<Permission> getAllRecord() {
		// TODO Auto-generated method stub
		
		List<Permission> lis=(List<Permission>)permissionRepository.findAll();
		return lis;
		
	}

	public Permission addPermission(Permission permissionEntity) {
		// TODO Auto-generated method stub
		Permission permissionEntity2=permissionRepository.save(permissionEntity);
		return permissionEntity2;
	}

	public void delPermissionByID(int id) {
		// TODO Auto-generated method stub
		permissionRepository.deleteById(id);
	}

	public Permission updatedPermission(Permission permissionEntity, int id) {
		// TODO Auto-generated method stub
permissionEntity.setPer_id(id);
		
		return permissionRepository.save(permissionEntity);
	}
	
	
	
	
}
