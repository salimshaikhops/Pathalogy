package com.smartcontact.manager.entity;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="patient_req_test")
public class PatientReqTest {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="patient_req_test_id")
	private int patient_req_test_id;
	private String patient_name;
	private String patient_address;
	private String patient_dob;
	private String adhar_no;

	private String dr_ref_code;
	
	private String Phone_no;
	
	
	/*
	 * @OneToMany(mappedBy = "patientReq", cascade = CascadeType.ALL) private
	 * List<PatientReqAndTest> patientReqList ;
	 */

	 
	
	
	public int getPatient_req_test_id() {
		return patient_req_test_id;
	}
	public void setPatient_req_test_id(int patient_req_test_id) {
		this.patient_req_test_id = patient_req_test_id;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}

	/*
	 * public List<PatientReqAndTest> getPatientReqList() { return patientReqList; }
	 * public void setPatientReqList(List<PatientReqAndTest> patientReqList) {
	 * this.patientReqList = patientReqList; }
	 */
	public String getPatient_address() {
		return patient_address;
	}
	public void setPatient_address(String patient_address) {
		this.patient_address = patient_address;
	}
	public String getPatient_dob() {
		return patient_dob;
	}
	public void setPatient_dob(String patient_dob) {
		this.patient_dob = patient_dob;
	}
	public String getAdhar_no() {
		return adhar_no;
	}
	public void setAdhar_no(String adhar_no) {
		this.adhar_no = adhar_no;
	}
	public String getDr_ref_code_id() {
		return dr_ref_code;
	}
	public void setDr_ref_code_id(String dr_ref_code_id) {
		this.dr_ref_code = dr_ref_code_id;
	}
	public String getPhone_no() {
		return Phone_no;
	}
	public void setPhone_no(String phone_no) {
		Phone_no = phone_no;
	}
	
	public PatientReqTest(int patient_req_test_id, String patient_name, String patient_address, String patient_dob,
			String adhar_no, String dr_ref_code, String phone_no /*List<PatientReqAndTest> patientReqList*/) {
		super();
		this.patient_req_test_id = patient_req_test_id;
		this.patient_name = patient_name;
		this.patient_address = patient_address;
		this.patient_dob = patient_dob;
		this.adhar_no = adhar_no;
		this.dr_ref_code = dr_ref_code;
		this.Phone_no = phone_no;
		/* this.patientReqList = patientReqList; */
	}
	public PatientReqTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
