package com.smartcontact.manager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="test_field")
public class TestFeild {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="test_filed_id")
	private int test_field_id;
	
	@ManyToOne
	private Test test_id;

	
	private String test_feild_name;
	private float baby_nor_val;
	private float baby_high_val;
	private float men_nor_val;
	private float men_high_val;
	private float women_nor_val;
	private float women_high_val;
	public int getTest_field_id() {
		return test_field_id;
	}
	public void setTest_field_id(int test_field_id) {
		this.test_field_id = test_field_id;
	}
	
	public String getTest_feild_name() {
		return test_feild_name;
	}
	public void setTest_feild_name(String test_feild_name) {
		this.test_feild_name = test_feild_name;
	}
	public float getBaby_nor_val() {
		return baby_nor_val;
	}
	public void setBaby_nor_val(float baby_nor_val) {
		this.baby_nor_val = baby_nor_val;
	}
	public float getBaby_high_val() {
		return baby_high_val;
	}
	public void setBaby_high_val(float baby_high_val) {
		this.baby_high_val = baby_high_val;
	}
	public float getMen_nor_val() {
		return men_nor_val;
	}
	public void setMen_nor_val(float men_nor_val) {
		this.men_nor_val = men_nor_val;
	}
	public float getMen_high_val() {
		return men_high_val;
	}
	public void setMen_high_val(float men_high_val) {
		this.men_high_val = men_high_val;
	}
	public float getHumen_nor_val() {
		return women_nor_val;
	}
	public void setHumen_nor_val(float humen_nor_val) {
		this.women_nor_val = humen_nor_val;
	}
	public float getHumen_high_val() {
		return women_high_val;
	}
	public void setHumen_high_val(float humen_high_val) {
		this.women_high_val = humen_high_val;
	}

	
	public Test getTest_id() {
		return test_id;
	}
	public void setTest_id(Test test_id) {
		this.test_id = test_id;
	}
	public TestFeild() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
