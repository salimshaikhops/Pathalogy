package com.smartcontact.manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartcontact.manager.repository.PatientReqInt;

@Service
public class PatienReqTestService {
	@Autowired
	private PatientReqInt patinetReqRepository;
	
}
