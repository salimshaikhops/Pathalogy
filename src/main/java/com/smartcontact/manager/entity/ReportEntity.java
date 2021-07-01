package com.smartcontact.manager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ReportEntity {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="report_id")
	private int report_id;
	private int patient_id;
	private int test_id;
	private int test_field_id;
	private float baby_val;
	
	private float men_val;
	
	private float women_val;

	
	
	
	public ReportEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getReport_id() {
		return report_id;
	}

	public void setReport_id(int report_id) {
		this.report_id = report_id;
	}

	public ReportEntity(int report_id, int patient_id, int test_id, int test_field_id, float baby_val, float men_val,
			float women_val) {
		super();
		this.report_id = report_id;
		this.patient_id = patient_id;
		this.test_id = test_id;
		this.test_field_id = test_field_id;
		this.baby_val = baby_val;
		this.men_val = men_val;
		this.women_val = women_val;
	}

	public int getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}

	public int getTest_id() {
		return test_id;
	}

	public void setTest_id(int test_id) {
		this.test_id = test_id;
	}

	public int getTest_field_id() {
		return test_field_id;
	}

	public void setTest_field_id(int test_field_id) {
		this.test_field_id = test_field_id;
	}

	public float getBaby_val() {
		return baby_val;
	}

	public void setBaby_val(float baby_val) {
		this.baby_val = baby_val;
	}

	public float getMen_val() {
		return men_val;
	}

	public void setMen_val(float men_val) {
		this.men_val = men_val;
	}

	public float getWomen_val() {
		return women_val;
	}

	public void setWomen_val(float women_val) {
		this.women_val = women_val;
	}

	
		

}
