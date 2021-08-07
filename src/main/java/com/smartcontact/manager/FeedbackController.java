package com.smartcontact.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smartcontact.manager.entity.PatientFeedBack;
import com.smartcontact.manager.service.BilingService;
import com.smartcontact.manager.service.FeedbackService;

@Controller
@RequestMapping("/FeedBack")
public class FeedbackController {
	
	@Autowired(required=true)
	private FeedbackService feedbackService;
	
	
	
	@PostMapping
	public PatientFeedBack AddFeedback(PatientFeedBack patientFeebackEntity)
	{
		PatientFeedBack patientFeebackEntity2=feedbackService.addFeedback(patientFeebackEntity);
		return  patientFeebackEntity2;
		
	}
	

}
