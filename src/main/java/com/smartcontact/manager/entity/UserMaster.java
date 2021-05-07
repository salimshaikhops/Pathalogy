package com.smartcontact.manager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	private boolean acc_status;
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
	public boolean isAcc_status() {
		return acc_status;
	}
	public void setAcc_status(boolean acc_status) {
		this.acc_status = acc_status;
	}
	public UserMaster(int user_mas_id, String username, String password, String dob, String phone_no, String adhar_no,
			String alt_phone_no, String email, String date_joining, String date_leaving, boolean acc_status) {
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
	}
	public UserMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
