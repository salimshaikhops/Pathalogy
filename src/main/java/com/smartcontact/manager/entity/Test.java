package com.smartcontact.manager.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="test")
public class Test {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="test_id")
	private int test_id;
	private String test_name;
	@Column(unique=true)
	private String test_code;
	private int test_price;
	private String adding_date;
	
	@ManyToOne
	private UserMaster user_master;
	
	
	
	private boolean status;
	private String description;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private GroupMaster group_id;

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

	public String getTest_code() {
		return test_code;
	}

	public void setTest_code(String test_code) {
		this.test_code = test_code;
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

	public UserMaster getUser_master() {
		return user_master;
	}

	public void setUser_master(UserMaster user_master) {
		this.user_master = user_master;
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

	public GroupMaster getGroup_id() {
		return group_id;
	}

	public void setGroup_id(GroupMaster group_id) {
		this.group_id = group_id;
	}

	public Test(int test_id, String test_name, String test_code, int test_price, String adding_date,
			UserMaster user_master, boolean status, String description, GroupMaster group_id) {
		super();
		this.test_id = test_id;
		this.test_name = test_name;
		this.test_code = test_code;
		this.test_price = test_price;
		this.adding_date = adding_date;
		this.user_master = user_master;
		this.status = status;
		this.description = description;
		this.group_id = group_id;
	}

	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	/*
	 * @OneToMany(mappedBy = "test", cascade = CascadeType.ALL) private
	 * List<PatientReqAndTest> testList ;
	 * 
	 */
	
	
	
	/*
	
	public List<PatientReqAndTest> getTestList() {
		return testList;
	}

	public void setTestList(List<PatientReqAndTest> testList) {
		this.testList = testList;
	}*/


	
}
