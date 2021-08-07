package com.smartcontact.manager.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PatientFeedBack {
	
	public PatientFeedBack(int feedbackId, int patinetId, String content, int star, Date date, String response,
			Date resDate) {
		super();
		this.feedbackId = feedbackId;
		this.patinetId = patinetId;
		this.content = content;
		this.star = star;
		this.date = date;
		this.response = response;
		this.resDate = resDate;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="feedbackId")
private int feedbackId;
private int patinetId;
private String  content;
private int star;
private Date date;
private String response;
private Date resDate;
public int getFeedbackId() {
	return feedbackId;
}
public void setFeedbackId(int feedbackId) {
	this.feedbackId = feedbackId;
}
public int getPatinetId() {
	return patinetId;
}
public void setPatinetId(int patinetId) {
	this.patinetId = patinetId;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public int getStar() {
	return star;
}
public void setStar(int star) {
	this.star = star;
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
	return "PatientFeedBack [feedbackId=" + feedbackId + ", patinetId=" + patinetId + ", content=" + content + ", star="
			+ star + ", date=" + date + ", response=" + response + ", resDate=" + resDate + "]";
}









}
