package com.smartcontact.manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartcontact.manager.repository.TestFieldInt;

@Service
public class TestFieldService {
	
	@Autowired
	private TestFieldInt testFieldRepository;
}
