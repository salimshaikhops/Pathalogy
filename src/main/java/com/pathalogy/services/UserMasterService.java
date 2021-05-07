package com.pathalogy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pathalogy.repository.UserMasterInt;

@Service
public class UserMasterService {
	
	@Autowired
	private UserMasterInt userMasterRepository;
}
