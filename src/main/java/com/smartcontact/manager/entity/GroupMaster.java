package com.smartcontact.manager.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="group_master")
public class GroupMaster {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="group_id")
	private int group_id;
	private String group_name;
	
	@OneToMany(mappedBy="group_id")
	private List<Test> test;
	
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
	
	public GroupMaster(int group_id, String group_name, List<Test> test) {
		super();
		this.group_id = group_id;
		this.group_name = group_name;
		this.test = test;
	}
	public GroupMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<Test> getTest() {
		return test;
	}
	public void setTest(List<Test> test) {
		this.test = test;
	}
	
	
}
