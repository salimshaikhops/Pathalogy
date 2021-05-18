package com.smartcontact.manager.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.smartcontact.manager.entity.DoctorEntity;

public interface DoctorRepository extends CrudRepository<DoctorEntity,Integer> {

	@Query(" from DoctorEntity  where dr_username =:username")
	public DoctorEntity getDoctorBydr_username(@Param("username") String username);
	
	@Query(" from DoctorEntity  where dr_username =:dr_username and dr_password=:dr_password")
	public DoctorEntity getDoctorBydr_usernameAnddr_password(@Param("dr_username") String username,@Param("dr_password") String password);
	
	
}
