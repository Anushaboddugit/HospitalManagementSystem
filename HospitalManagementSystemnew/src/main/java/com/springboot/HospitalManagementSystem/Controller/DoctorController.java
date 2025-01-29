package com.springboot.HospitalManagementSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.HospitalManagementSystem.Model.Doctor;
import com.springboot.HospitalManagementSystem.Service.DoctorService;

@RestController
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;
	
	@GetMapping("/doctors")
	public List<Doctor> getAllDoctors() {
	List<Doctor> allDoctors = doctorService.getAllDoctors();
	return allDoctors;
	}
	@GetMapping("/doctor/{id}")
	public Doctor getDoctorById(@PathVariable("id") int id){
		Doctor doctorById = doctorService.getDoctorById(id);
		return doctorById;
	}
	@PostMapping("/doctor")
	public Doctor saveDoctor(@RequestBody Doctor d) {
		Doctor saveDoctor = doctorService.saveDoctor(d);
		return saveDoctor;
	}
	@PutMapping("/doctor")
	public Doctor updateDoctor(@RequestBody Doctor d) {
		Doctor updateDoctor = doctorService.updateDoctor(d);
		return updateDoctor;
	}
	@DeleteMapping("/doctor/{id}")
	public void deleteDoctor(@PathVariable("id") int id) {
		doctorService.deleteDoctor(id);
	}
	
}

