package com.smartcontact.manager;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartcontact.manager.entity.Bilingentity;
import com.smartcontact.manager.entity.Payment;
import com.smartcontact.manager.entity.Test;
import com.smartcontact.manager.service.PaymentService;
import com.smartcontact.manager.service.TestService;


@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	public PaymentService paymentService ;
	
	@PostMapping("/addPayment")
	public ResponseEntity addPayment(@RequestBody  Payment paymentEntity)
	{
		try {
			
		
			Payment b=paymentService.saveData(paymentEntity);
		
		return ResponseEntity.of(Optional.of(b));
		}
		catch(Exception e)
		{e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
	
	
	

	
	@PostMapping("/UpdatedPaymentByPaymentId/{paymentId}")
	public ResponseEntity updatedBilingByID(@RequestBody Payment paymentEntity,@PathVariable("paymentId") String id)
	{
		try {
			
			Payment paymentEntity2=paymentService.updatedPayment(paymentEntity,id);
			return ResponseEntity.of(Optional.of(paymentEntity2));
			
		}
		catch(Exception e){
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	
		
	}
	
	
	
	
	
	@GetMapping("/getPaymentDetailByPaymentId")
	public Payment getPaymentByID(String paymentId)
	{
		Payment paymentEntity=paymentService.getPaymentByPaymentId(paymentId);
		return paymentEntity;
		
	}
		
		
}
