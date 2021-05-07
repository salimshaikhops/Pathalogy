package com.smartcontact.manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartcontact.manager.repository.TestInt;

@Service
public class TestService {
	@Autowired
	private TestInt testRepository;
	
}
