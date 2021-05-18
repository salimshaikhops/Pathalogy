package com.smartcontact.manager.configpa;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.smartcontact.manager.entity.DoctorEntity;

public class DoctorDetail implements UserDetails {
	
	
	private DoctorEntity docotr;
	
	
	public DoctorDetail(DoctorEntity docotr) {
		super();
		this.docotr = docotr;
	}

	

	@Override
	public Collection<? extends GrantedAuthority>  getAuthorities() {
		SimpleGrantedAuthority simpleGrantedAuthority=new SimpleGrantedAuthority(docotr.getHospital_name());
		List<SimpleGrantedAuthority> s=  	Arrays.asList(simpleGrantedAuthority);
				
	return s;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return docotr.getDr_password();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return docotr.getDr_username();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
