package com.smartcontact.manager.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class QueryEntity {
	
	public QueryEntity(int queryId, UserMaster user_id, String name, Date date, String response, Date resDate) {
		super();
		this.queryId = queryId;
		this.user_id = user_id;
		this.name = name;
		this.date = date;
		this.response = response;
		this.resDate = resDate;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="queryId")
	private int queryId;
	@ManyToOne
	private UserMaster user_id;
	private String name;
	private Date date;
	private String response;
	private Date resDate;
	public int getQueryId() {
		return queryId;
	}
	public void setQueryId(int queryId) {
		this.queryId = queryId;
	}
	public UserMaster getUser_id() {
		return user_id;
	}
	public void setUser_id(UserMaster user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public Date getResDate() {
		return resDate;
	}
	public void setResDate(Date resDate) {
		this.resDate = resDate;
	}
	@Override
	public String toString() {
		return "QueryEntity [queryId=" + queryId + ", user_id=" + user_id + ", name=" + name + ", date=" + date
				+ ", response=" + response + ", resDate=" + resDate + "]";
	}
	
	
	

}
