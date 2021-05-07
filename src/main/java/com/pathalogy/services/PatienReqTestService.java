package com.pathalogy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pathalogy.repository.PatientReqInt;

@Service
public class PatienReqTestService {
	@Autowired
	private PatientReqInt patinetReqRepository;
	
}
