package com.smartcontact.manager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class ReportEntity {
	
	public ReportEntity(int report_id, PatientReqTest patient_req_test_id, Test test_id, TestFeild test_field_id,
			String baby_nor_val, String baby_high_val, String male_nor_val, String male_high_val, String women_nor_val,
			String women_high_val) {
		super();
		this.report_id = report_id;
		this.patient_req_test_id = patient_req_test_id;
		this.test_id = test_id;
		this.test_field_id = test_field_id;
		this.baby_nor_val = baby_nor_val;
		this.baby_high_val = baby_high_val;
		this.male_nor_val = male_nor_val;
		this.male_high_val = male_high_val;
		this.women_nor_val = women_nor_val;
		this.women_high_val = women_high_val;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="report_id")
	private int report_id;
	@OneToOne
	private PatientReqTest patient_req_test_id;
	@OneToOne
	private Test test_id;
	
	@OneToOne
	private TestFeild test_field_id;
	
	private String baby_nor_val;
	private String baby_high_val;
	private String male_nor_val;
	private String male_high_val;
	private String women_nor_val;
	private String women_high_val;
	public int getReport_id() {
		return report_id;
	}
	public void setReport_id(int report_id) {
		this.report_id = report_id;
	}
	public PatientReqTest getPatient_req_test_id() {
		return patient_req_test_id;
	}
	public void setPatient_req_test_id(PatientReqTest patient_req_test_id) {
		this.patient_req_test_id = patient_req_test_id;
	}
	public Test getTest_id() {
		return test_id;
	}
	public void setTest_id(Test test_id) {
		this.test_id = test_id;
	}
	public TestFeild getTest_field_id() {
		return test_field_id;
	}
	public void setTest_field_id(TestFeild test_field_id) {
		this.test_field_id = test_field_id;
	}
	public String getBaby_nor_val() {
		return baby_nor_val;
	}
	public void setBaby_nor_val(String baby_nor_val) {
		this.baby_nor_val = baby_nor_val;
	}
	public String getBaby_high_val() {
		return baby_high_val;
	}
	public void setBaby_high_val(String baby_high_val) {
		this.baby_high_val = baby_high_val;
	}
	public String getMale_nor_val() {
		return male_nor_val;
	}
	public void setMale_nor_val(String male_nor_val) {
		this.male_nor_val = male_nor_val;
	}
	public String getMale_high_val() {
		return male_high_val;
	}
	public void setMale_high_val(String male_high_val) {
		this.male_high_val = male_high_val;
	}
	public String getWomen_nor_val() {
		return women_nor_val;
	}
	public void setWomen_nor_val(String women_nor_val) {
		this.women_nor_val = women_nor_val;
	}
	public String getWomen_high_val() {
		return women_high_val;
	}
	public void setWomen_high_val(String women_high_val) {
		this.women_high_val = women_high_val;
	}
	

}
