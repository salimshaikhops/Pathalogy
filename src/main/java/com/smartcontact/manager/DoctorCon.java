package com.smartcontact.manager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorCon {

	@GetMapping("/add")
	public String addd()
	{
		return "sanjay";
	}
}
