package com.smartcontact.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartcontact.manager.entity.PatientFeedBack;
import com.smartcontact.manager.entity.QueryEntity;
import com.smartcontact.manager.service.FeedbackService;
import com.smartcontact.manager.service.QueryService;

@RestController
@RequestMapping("/Query")
public class QueryController {

	@Autowired(required=true)
	private QueryService queryService;
	
	
	
	@PostMapping("/addQuery")
	public QueryEntity AddFeedback(QueryEntity queryEntity)
	{
		QueryEntity QueryEntity2=queryService.addQuery(queryEntity);
		return  QueryEntity2;
		
	}
	
}
