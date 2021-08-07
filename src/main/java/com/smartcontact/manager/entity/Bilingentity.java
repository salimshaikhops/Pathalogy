package com.smartcontact.manager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Bilingentity {

	public Bilingentity(int billing_id, PatientReqTest patient_req_test_id, int total_amt, int discount, int actual_amt,
			String way_of_payment, UserMaster user_id, Payment payment_id) {
		super();
		this.billing_id = billing_id;
		this.patient_req_test_id = patient_req_test_id;
		this.total_amt = total_amt;
		this.discount = discount;
		this.actual_amt = actual_amt;
		this.way_of_payment = way_of_payment;
		this.user_id = user_id;
		this.payment_id = payment_id;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="billingId")
	private int billing_id;
	@ManyToOne
	private PatientReqTest patient_req_test_id;
	private int total_amt;
	private int discount;
	private int actual_amt;
	private String way_of_payment;
	@ManyToOne
	private UserMaster user_id;
	@OneToOne
	private Payment payment_id;
	public int getBilling_id() {
		return billing_id;
	}
	public void setBilling_id(int billing_id) {
		this.billing_id = billing_id;
	}
	public PatientReqTest getPatient_req_test_id() {
		return patient_req_test_id;
	}
	public void setPatient_req_test_id(PatientReqTest patient_req_test_id) {
		this.patient_req_test_id = patient_req_test_id;
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
	@Override
	public String toString() {
		return "Bilingentity [billing_id=" + billing_id + ", patient_req_test_id=" + patient_req_test_id
				+ ", total_amt=" + total_amt + ", discount=" + discount + ", actual_amt=" + actual_amt
				+ ", way_of_payment=" + way_of_payment + ", user_id=" + user_id + ", payment_id=" + payment_id + "]";
	}
	
	
	
	
}
