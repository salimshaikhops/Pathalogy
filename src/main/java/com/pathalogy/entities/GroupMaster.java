package com.pathalogy.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="group_master")
public class GroupMaster {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="group_id")
	private int group_id;
	private String group_name;
	public int getGroup_id() {
		return group_id;
	}
	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}
	public String getGroup_name() {
		return group_name;
	}
	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}
	public GroupMaster(int group_id, String group_name) {
		super();
		this.group_id = group_id;
		this.group_name = group_name;
	}
	public GroupMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
