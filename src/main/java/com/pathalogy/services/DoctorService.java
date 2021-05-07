
package com.pathalogy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pathalogy.repository.DoctorRepository;


@Service
public class DoctorService {

	@Autowired
	private DoctorRepository doctorRepository;
}
