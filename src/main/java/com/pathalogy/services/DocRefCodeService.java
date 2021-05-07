package com.pathalogy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pathalogy.repository.DocRefCodeInt;
@Service
public class DocRefCodeService  {

	@Autowired
	private DocRefCodeInt docRefCode;
}
