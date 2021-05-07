package com.smartcontact.manager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dr_ref_code")
public class DocRefCode {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="dr_ref_id")
	private int dr_ref_id;
	
	private int dr_id;
	
	private String ref_code;

	public int getDr_ref_id() {
		return dr_ref_id;
	}

	public void setDr_ref_id(int dr_ref_id) {
		this.dr_ref_id = dr_ref_id;
	}

	public int getDr_id() {
		return dr_id;
	}

	public void setDr_id(int dr_id) {
		this.dr_id = dr_id;
	}

	public String getRef_code() {
		return ref_code;
	}

	public void setRef_code(String ref_code) {
		this.ref_code = ref_code;
	}

	public DocRefCode(int dr_ref_id, int dr_id, String ref_code) {
		super();
		this.dr_ref_id = dr_ref_id;
		this.dr_id = dr_id;
		this.ref_code = ref_code;
	}

	public DocRefCode() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
