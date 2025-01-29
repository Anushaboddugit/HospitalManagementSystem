package com.springboot.HospitalManagementSystem.Service;

import java.util.List;

import com.springboot.HospitalManagementSystem.Model.Admin;

public interface AdminService {
	
	public List<Admin> getAllAdmins();
	
	public Admin getAdminById(int id);

	public Admin saveAdmin(Admin d);

	public Admin updateAdmin(Admin d);

	public void deleteAdmin(int id);

}
