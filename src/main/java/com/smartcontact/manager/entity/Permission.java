package com.smartcontact.manager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="permission")
public class Permission {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="per_id")
		private int per_id;
		
		private String per_name;

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

		public Permission(int per_id, String per_name) {
			super();
			this.per_id = per_id;
			this.per_name = per_name;
		}

		public Permission() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}
