package com.smartcontact.manager.repository;

import org.springframework.data.repository.CrudRepository;

import com.smartcontact.manager.entity.PatientFeedBack;

public interface FeedbackRepository extends CrudRepository<PatientFeedBack,Integer> {

}
