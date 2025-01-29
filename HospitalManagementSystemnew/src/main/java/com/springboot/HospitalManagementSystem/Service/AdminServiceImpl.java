package com.springboot.HospitalManagementSystem.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.HospitalManagementSystem.Entity.AdminEntity;
import com.springboot.HospitalManagementSystem.Entity.DoctorEntity;
import com.springboot.HospitalManagementSystem.Entity.UserEntity;
import com.springboot.HospitalManagementSystem.Model.Admin;
import com.springboot.HospitalManagementSystem.Model.Doctor;
import com.springboot.HospitalManagementSystem.Model.User;
import com.springboot.HospitalManagementSystem.Repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {

	
	@Autowired
	private AdminRepository adminRepository;
	
	@Override
	public List<Admin> getAllAdmins() {
		List<AdminEntity> all = adminRepository.findAll();
		ObjectMapper mapper = new ObjectMapper();
		List<Admin> adminmodels = all.stream().map(x -> convert(x)).collect(Collectors.toList());
		return adminmodels;
		
	}
	public Admin convert(AdminEntity a) {
		
		return new Admin(a.getId(),a.getEmail(),a.getPassword());
	}
	@Override
	public Admin getAdminById(int id) {
		AdminEntity a=adminRepository.getById(id);
		Admin convert = convert(a);
		return convert;
		
	}

	@Override
	public Admin saveAdmin(Admin a) {
		AdminEntity u=new AdminEntity(a.getId(),a.getEmail(),a.getPassword());
		AdminEntity save = adminRepository.save(u);
		
		return convert(save);
	}

	@Override
	public Admin updateAdmin(Admin a) {
		AdminEntity u=new AdminEntity(a.getId(),a.getEmail(),a.getPassword());
		AdminEntity save = adminRepository.save(u);
		
		return convert(save);
	}

	@Override
	public void deleteAdmin(int id) {
		Admin a = getAdminById(id);
		AdminEntity u=new AdminEntity(a.getId(),a.getEmail(),a.getPassword());
		adminRepository.delete(u);
	}

}
