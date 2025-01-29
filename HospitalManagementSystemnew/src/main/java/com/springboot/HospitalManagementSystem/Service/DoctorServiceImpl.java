package com.springboot.HospitalManagementSystem.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.HospitalManagementSystem.Entity.DoctorEntity;
import com.springboot.HospitalManagementSystem.Model.Doctor;
import com.springboot.HospitalManagementSystem.Repository.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService{
	
	@Autowired
	private DoctorRepository doctorRepository;

	@Override
	public List<Doctor> getAllDoctors() {
		
		List<DoctorEntity> all = doctorRepository.findAll();
		ObjectMapper mapper = new ObjectMapper();
		List<Doctor> doctormodels = all.stream().map(x -> convert(x)).collect(Collectors.toList());
		return doctormodels;
	}
	
	public Doctor convert(DoctorEntity d) {
		
		return new Doctor(d.getId(),d.getName(),d.getDob(),d.getQualification(),d.getSpecialist(),d.getEmail(),d.getMobno(),d.getPassword());
	}

	@Override
	public Doctor getDoctorById(int id) {
		DoctorEntity d=doctorRepository.getById(id);
		Doctor convert = convert(d);
		return convert;
	}

	@Override
	public Doctor saveDoctor(Doctor d) {
		DoctorEntity ed=new DoctorEntity(d.getId(),d.getName(),d.getDob(),d.getQualification(),d.getSpecialist(),d.getEmail(),d.getMobno(),d.getPassword());
		DoctorEntity saved = doctorRepository.save(ed);
		return convert(saved);
	}

	@Override
	public Doctor updateDoctor(Doctor d) {
		DoctorEntity ed=new DoctorEntity(d.getId(),d.getName(),d.getDob(),d.getQualification(),d.getSpecialist(),d.getEmail(),d.getMobno(),d.getPassword());
		DoctorEntity updated = doctorRepository.save(ed);
		return convert(updated);
	}

	@Override
	public void deleteDoctor(int id) {
		Doctor d = getDoctorById(id);
		DoctorEntity ed=new DoctorEntity(d.getId(),d.getName(),d.getDob(),d.getQualification(),d.getSpecialist(),d.getEmail(),d.getMobno(),d.getPassword());
		doctorRepository.delete(ed);
	}
	
	

}
