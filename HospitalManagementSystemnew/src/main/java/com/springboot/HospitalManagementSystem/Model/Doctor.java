package com.springboot.HospitalManagementSystem.Model;

public class Doctor {
	int id;
	String name;
	String dob;
	String qualification;
	String specialist;
	String email;
	long mobno;
	String password;
	

	public Doctor() {
	super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public String getSpecialist() {
		return specialist;
	}


	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getMobno() {
		return mobno;
	}


	public void setMobno(long mobno) {
		this.mobno = mobno;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Doctor(int id, String name, String dob, String qualification, String specialist, String email, long mobno,
			String password) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.qualification = qualification;
		this.specialist = specialist;
		this.email = email;
		this.mobno = mobno;
		this.password = password;
	}
	

}
