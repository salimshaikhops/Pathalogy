package com.smartcontact.manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartcontact.manager.entity.TestFeild;
import com.smartcontact.manager.entity.UserMaster;
import com.smartcontact.manager.repository.UserMasterInt;

@Service
public class UserMasterService {
	
	@Autowired
	private UserMasterInt userMasterRepository;

	public List<UserMaster> getAllRecord() {
		// TODO Auto-generated method stub
		List<UserMaster> lis=(List<UserMaster>)userMasterRepository.findAll();
		return lis;
	}

	public UserMaster addUser(UserMaster userMasterEntity) {
		// TODO Auto-generated method stub
		UserMaster userMasterEntity2=userMasterRepository.save(userMasterEntity);
		return userMasterEntity2;
	}

	public void delUserById(int id) {
		// TODO Auto-generated method stub
		userMasterRepository.deleteById(id);
	}

	public UserMaster updatedUserMaster(UserMaster userMasterEntity, int id) {
		// TODO Auto-generated method stub
		userMasterEntity.setUser_mas_id(id);
		
		return userMasterRepository.save(userMasterEntity) ;
		
	}

	public  UserMaster checkAuth(String username, String password) {
		// TODO Auto-generated method stub
		return userMasterRepository.getUserMasterByusernameAndPassword(username, password) ;
	}

	
}
