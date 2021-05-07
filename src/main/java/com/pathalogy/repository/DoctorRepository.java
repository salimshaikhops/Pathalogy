package com.pathalogy.repository;

import org.springframework.data.repository.CrudRepository;

import com.pathalogy.entities.DoctorEntity;

public interface DoctorRepository extends CrudRepository<DoctorEntity,Integer> {

	
	
}
