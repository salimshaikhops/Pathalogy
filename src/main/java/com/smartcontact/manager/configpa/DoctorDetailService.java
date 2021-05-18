package com.smartcontact.manager.configpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.smartcontact.manager.entity.DoctorEntity;
import com.smartcontact.manager.repository.DoctorRepository;

public class DoctorDetailService implements UserDetailsService {

	@Autowired
	private DoctorRepository doctorRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// fetching doctor from database
		DoctorEntity doctor=doctorRepository.getDoctorBydr_username(username);
	 if( doctor == null)
	 throw new UsernameNotFoundException("could not found doctor");
		DoctorDetail doctorDetail=new DoctorDetail(doctor);
		return doctorDetail;
	}
	

	
	
}
