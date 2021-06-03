package com.smartcontact.manager.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="permission")
public class Permission {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="per_id")
		private int per_id;
		
		private String per_name;
		
		@ManyToMany
		private List<UserMaster> user_list;
		
		
		
		
		public int getPer_id() {
			return per_id;
		}

		public void setPer_id(int per_id) {
			this.per_id = per_id;
		}

		public String getPer_name() {
			return per_name;
		}

		public void setPer_name(String per_name) {
			this.per_name = per_name;
		}

		public Permission(int per_id, String per_name, List<UserMaster> user_list) {
			super();
			this.per_id = per_id;
			this.per_name = per_name;
			this.user_list = user_list;
		}

		public Permission() {
			super();
			// TODO Auto-generated constructor stub
		}

		public List<UserMaster> getUser_list() {
			return user_list;
		}

		public void setUser_list(List<UserMaster> user_list) {
			this.user_list = user_list;
		}

	

		
	
		
		
}
