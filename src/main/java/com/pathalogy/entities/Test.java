package com.pathalogy.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="test")
public class Test {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="test_id")
	private int test_id;
	private String test_name;
	private int test_price;
	private String adding_date;
	private int user_id;
	private boolean status;
	private String description;
	
	private int group_id;

	public int getTest_id() {
		return test_id;
	}

	public void setTest_id(int test_id) {
		this.test_id = test_id;
	}

	public String getTest_name() {
		return test_name;
	}

	public void setTest_name(String test_name) {
		this.test_name = test_name;
	}

	public int getTest_price() {
		return test_price;
	}

	public void setTest_price(int test_price) {
		this.test_price = test_price;
	}

	public String getAdding_date() {
		return adding_date;
	}

	public void setAdding_date(String adding_date) {
		this.adding_date = adding_date;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getGroup_id() {
		return group_id;
	}

	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}

	public Test(int test_id, String test_name, int test_price, String adding_date, int user_id, boolean status,
			String description, int group_id) {
		super();
		this.test_id = test_id;
		this.test_name = test_name;
		this.test_price = test_price;
		this.adding_date = adding_date;
		this.user_id = user_id;
		this.status = status;
		this.description = description;
		this.group_id = group_id;
	}

	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
