package com.smartcontact.manager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.smartcontact.manager.entity.Bilingentity;
import com.smartcontact.manager.entity.Payment;
import com.smartcontact.manager.entity.ReportEntity;
import com.smartcontact.manager.repository.PaymentRepository;
import com.smartcontact.manager.repository.ReportEntityRepository;

@Service
public class PaymentService {
	@Autowired
	private PaymentRepository paymentRepository ;
	
	
	public Payment saveData(Payment paymentEntity) {
		// TODO Auto-generated method stub
		Payment paymentEntity2=paymentRepository.save(paymentEntity);
		
		
		
		return paymentEntity2;
	}


	public Payment getPaymentByPaymentId(String paymentId) {
		// TODO Auto-generated method stub
		Payment paymentEntity=paymentRepository.getPaymentByPaymentId(paymentId);
		return paymentEntity;
	}


	public Payment updatedPayment(Payment paymentEntity, String  id) {
		// TODO Auto-generated method stub
		paymentEntity.setPayment_Id(id);
		
		return paymentRepository.save(paymentEntity);
		
	}
	
	




}
