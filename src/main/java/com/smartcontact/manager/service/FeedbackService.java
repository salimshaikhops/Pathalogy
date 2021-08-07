package com.smartcontact.manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartcontact.manager.entity.Bilingentity;
import com.smartcontact.manager.entity.PatientFeedBack;
import com.smartcontact.manager.repository.BilingRepository;
import com.smartcontact.manager.repository.FeedbackRepository;

@Service
public class FeedbackService {
	@Autowired
	private FeedbackRepository  feedbackRepository;

	public PatientFeedBack addFeedback(PatientFeedBack patientFeebackEntity) {
		// TODO Auto-generated method stub
		PatientFeedBack patientFeedbackEntity2=feedbackRepository.save(patientFeebackEntity);
		
		
		return patientFeedbackEntity2;
	}
	
	
	
	
	
	
	
	
	
}
