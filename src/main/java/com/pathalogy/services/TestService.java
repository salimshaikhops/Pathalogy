package com.pathalogy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pathalogy.repository.TestInt;

@Service
public class TestService {
	@Autowired
	private TestInt testRepository;
	
}
