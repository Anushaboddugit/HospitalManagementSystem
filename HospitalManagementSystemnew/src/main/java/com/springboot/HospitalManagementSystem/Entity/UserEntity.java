package com.springboot.HospitalManagementSystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_dtls")
public class UserEntity {
	@Id
	 private int user_id;
	private String full_name;
	private String email;
	private String password;
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public UserEntity() {
		super();
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public UserEntity(int user_id, String full_name, String email, String password) {
		super();
		this.user_id = user_id;
		this.full_name = full_name;
		this.email = email;
		this.password = password;
	}
	
	
	
}
