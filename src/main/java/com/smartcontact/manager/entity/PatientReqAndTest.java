package com.smartcontact.manager.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PatientReqAndTest {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	 @ManyToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "test")
	    private Test test;
	
	 @ManyToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "patientReq")
	    private PatientReqAndTest patientReq;
	 
	 private String babyValue;
	 
	 private String menValue;
	 
	 public PatientReqAndTest(int id, Test test, PatientReqAndTest patientReq, String babyValue, String menValue,
			String womenValue) {
		super();
		this.id = id;
		this.test = test;
		this.patientReq = patientReq;
		this.babyValue = babyValue;
		this.menValue = menValue;
		this.womenValue = womenValue;
	}

	public PatientReqAndTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public PatientReqAndTest getPatientReq() {
		return patientReq;
	}

	public void setPatientReq(PatientReqAndTest patientReq) {
		this.patientReq = patientReq;
	}

	public String getBabyValue() {
		return babyValue;
	}

	public void setBabyValue(String babyValue) {
		this.babyValue = babyValue;
	}

	public String getMenValue() {
		return menValue;
	}

	public void setMenValue(String menValue) {
		this.menValue = menValue;
	}

	public String getWomenValue() {
		return womenValue;
	}

	public void setWomenValue(String womenValue) {
		this.womenValue = womenValue;
	}

	private String womenValue;

	 
	
}
