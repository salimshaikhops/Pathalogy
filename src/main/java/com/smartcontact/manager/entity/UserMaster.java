package com.smartcontact.manager.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="user_master")
public class UserMaster {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_mas__id")
	private int user_mas_id;
	
	private String username;
	private String Password;
	private String dob;
	private String phone_no;
	private String adhar_no;
	private String alt_phone_no;
	
	private String email;
	private String Date_joining;
	private String Date_leaving;
	private int acc_status;
	
	@JsonIgnore
	@OneToMany(mappedBy="user_master",cascade=CascadeType.ALL)
	private List<Test> testList=new ArrayList<>();

	@ManyToMany
	private List<Permission> permission_list;
	
	
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public List<Test> getTestList() {
		return testList;
	}
	public void setTestList(List<Test> testList) {
		this.testList = testList;
	}
	public int getAcc_status() {
		return acc_status;
	}

	
	
	public int getUser_mas_id() {
		return user_mas_id;
	}
	public void setUser_mas_id(int user_mas_id) {
		this.user_mas_id = user_mas_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAdhar_no() {
		return adhar_no;
	}
	public void setAdhar_no(String adhar_no) {
		this.adhar_no = adhar_no;
	}
	public String getAlt_phone_no() {
		return alt_phone_no;
	}
	public void setAlt_phone_no(String alt_phone_no) {
		this.alt_phone_no = alt_phone_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDate_joining() {
		return Date_joining;
	}
	public void setDate_joining(String date_joining) {
		Date_joining = date_joining;
	}
	public String getDate_leaving() {
		return Date_leaving;
	}
	public void setDate_leaving(String date_leaving) {
		Date_leaving = date_leaving;
	}
	public int isAcc_status() {
		return acc_status;
	}
	public void setAcc_status(int acc_status) {
		this.acc_status = acc_status;
	}
	public List<Permission> getPermission_list() {
		return permission_list;
	}
	public void setPermission_list(List<Permission> permission_list) {
		this.permission_list = permission_list;
	}
	public UserMaster(int user_mas_id, String username, String password, String dob, String phone_no, String adhar_no,
			String alt_phone_no, String email, String date_joining, String date_leaving, int acc_status,
			List<Test> testList, List<Permission> permission_list) {
		super();
		this.user_mas_id = user_mas_id;
		this.username = username;
		Password = password;
		this.dob = dob;
		this.phone_no = phone_no;
		this.adhar_no = adhar_no;
		this.alt_phone_no = alt_phone_no;
		this.email = email;
		Date_joining = date_joining;
		Date_leaving = date_leaving;
		this.acc_status = acc_status;
		this.testList = testList;
		this.permission_list = permission_list;
	}
	public UserMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


	
	
	/*
	 * public UserMaster(int user_mas_id, String username, String password, String
	 * dob, String phone_no, String adhar_no, String alt_phone_no, String email,
	 * String date_joining, String date_leaving, int acc_status, List<Permission>
	 * permission_list) { super(); this.user_mas_id = user_mas_id; this.username =
	 * username; Password = password; this.dob = dob; this.phone_no = phone_no;
	 * this.adhar_no = adhar_no; this.alt_phone_no = alt_phone_no; this.email =
	 * email; Date_joining = date_joining; Date_leaving = date_leaving;
	 * this.acc_status = acc_status; this.permission_list = permission_list; }
	 */
	
	
}
