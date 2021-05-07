package com.pathalogy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pathalogy.repository.TestFieldInt;

@Service
public class TestFieldService {
	
	@Autowired
	private TestFieldInt testFieldRepository;
}
