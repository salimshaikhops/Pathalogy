package com.smartcontact.manager.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment {
	public Payment(String payment_Id, String status, String signature) {
		super();
		Payment_Id = payment_Id;
		Status = status;
		Signature = signature;
	}
	@Id
	private String Payment_Id;
	private String Status;
	private String Signature;
	
	
	public String getPayment_Id() {
		return Payment_Id;
	}
	public void setPayment_Id(String payment_Id) {
		Payment_Id = payment_Id;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getSignature() {
		return Signature;
	}
	public void setSignature(String signature) {
		Signature = signature;
	}
	
	
	
}
