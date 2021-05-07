package com.pathalogy.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="docotrs")
public class DoctorEntity {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="doctor_id")
	private int id;
	
	private String  dr_name;
	private String dr_address;
	private String hospital_name;
	private String phone_no;
	private String email;
	private String Date_regi;
	private String dr_username;
	private String dr_password;
	private String adhar_no;
	private String ref_code_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDr_name() {
		return dr_name;
	}
	public void setDr_name(String dr_name) {
		this.dr_name = dr_name;
	}
	public String getDr_address() {
		return dr_address;
	}
	public void setDr_address(String dr_address) {
		this.dr_address = dr_address;
	}
	public String getHospital_name() {
		return hospital_name;
	}
	public void setHospital_name(String hospital_name) {
		this.hospital_name = hospital_name;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDate_regi() {
		return Date_regi;
	}
	public void setDate_regi(String date_regi) {
		Date_regi = date_regi;
	}
	public String getDr_username() {
		return dr_username;
	}
	public void setDr_username(String dr_username) {
		this.dr_username = dr_username;
	}
	public String getDr_password() {
		return dr_password;
	}
	public void setDr_password(String dr_password) {
		this.dr_password = dr_password;
	}
	public String getAdhar_no() {
		return adhar_no;
	}
	public void setAdhar_no(String adhar_no) {
		this.adhar_no = adhar_no;
	}
	public String getRef_code_id() {
		return ref_code_id;
	}
	public void setRef_code_id(String ref_code_id) {
		this.ref_code_id = ref_code_id;
	}
	public DoctorEntity(int id, String dr_name, String dr_address, String hospital_name, String phone_no, String email,
			String date_regi, String dr_username, String dr_password, String adhar_no, String ref_code_id) {
		super();
		this.id = id;
		this.dr_name = dr_name;
		this.dr_address = dr_address;
		this.hospital_name = hospital_name;
		this.phone_no = phone_no;
		this.email = email;
		Date_regi = date_regi;
		this.dr_username = dr_username;
		this.dr_password = dr_password;
		this.adhar_no = adhar_no;
		this.ref_code_id = ref_code_id;
	}
	public DoctorEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
