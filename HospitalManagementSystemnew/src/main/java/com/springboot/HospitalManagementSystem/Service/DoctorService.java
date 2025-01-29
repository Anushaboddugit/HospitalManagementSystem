package com.springboot.HospitalManagementSystem.Service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.springboot.HospitalManagementSystem.Model.Doctor;


public interface DoctorService {

	public List<Doctor> getAllDoctors();
	
	public Doctor getDoctorById(int id);

	public Doctor saveDoctor(Doctor d);

	public Doctor updateDoctor(Doctor d);

	public void deleteDoctor(int id);
}
