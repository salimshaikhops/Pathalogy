package com.pathalogy.repository;

import org.springframework.data.repository.CrudRepository;

import com.pathalogy.entities.PatientReqTest;

public interface PatientReqInt extends CrudRepository<PatientReqTest,Integer>{

}
