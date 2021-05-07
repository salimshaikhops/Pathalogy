package com.smartcontact.manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartcontact.manager.repository.UserMasterInt;

@Service
public class UserMasterService {
	
	@Autowired
	private UserMasterInt userMasterRepository;
}
