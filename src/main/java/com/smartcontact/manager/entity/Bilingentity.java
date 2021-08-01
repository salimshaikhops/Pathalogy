package com.smartcontact.manager.entity;

import javax.persistence.Entity;

@Entity
public class Bilingentity {

	public Bilingentity(int billing_id, PatientReqTest patient_req_id, int total_amt, int discount, int actual_amt,
			String way_of_payment, UserMaster user_id, Payment payment_id) {
		super();
		this.billing_id = billing_id;
		this.patient_req_id = patient_req_id;
		this.total_amt = total_amt;
		this.discount = discount;
		this.actual_amt = actual_amt;
		this.way_of_payment = way_of_payment;
		this.user_id = user_id;
		this.payment_id = payment_id;
	}
	private int billing_id;
	private PatientReqTest patient_req_id;
	private int total_amt;
	private int discount;
	private int actual_amt;
	private String way_of_payment;
	private UserMaster user_id;
	private Payment payment_id;
	public int getBilling_id() {
		return billing_id;
	}
	public void setBilling_id(int billing_id) {
		this.billing_id = billing_id;
	}
	public PatientReqTest getPatient_req_id() {
		return patient_req_id;
	}
	public void setPatient_req_id(PatientReqTest patient_req_id) {
		this.patient_req_id = patient_req_id;
	}
	public int getTotal_amt() {
		return total_amt;
	}
	public void setTotal_amt(int total_amt) {
		this.total_amt = total_amt;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getActual_amt() {
		return actual_amt;
	}
	public void setActual_amt(int actual_amt) {
		this.actual_amt = actual_amt;
	}
	public String getWay_of_payment() {
		return way_of_payment;
	}
	public void setWay_of_payment(String way_of_payment) {
		this.way_of_payment = way_of_payment;
	}
	public UserMaster getUser_id() {
		return user_id;
	}
	public void setUser_id(UserMaster user_id) {
		this.user_id = user_id;
	}
	public Payment getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(Payment payment_id) {
		this.payment_id = payment_id;
	}
	
	
	
}
