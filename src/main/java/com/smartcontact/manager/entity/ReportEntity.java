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
			String value) {
		super();
		this.report_id = report_id;
		this.patient_req_test_id = patient_req_test_id;
		this.test_id = test_id;
		this.test_field_id = test_field_id;
		this.value = value;
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
	
	private String value;
	

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

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	

}
