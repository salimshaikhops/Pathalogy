package com.smartcontact.manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartcontact.manager.repository.DocRefCodeInt;
@Service
public class DocRefCodeService  {

	@Autowired
	private DocRefCodeInt docRefCode;
}
