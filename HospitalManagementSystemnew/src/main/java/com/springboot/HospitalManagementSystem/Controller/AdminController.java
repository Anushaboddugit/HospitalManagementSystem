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

import com.springboot.HospitalManagementSystem.Model.Admin;
import com.springboot.HospitalManagementSystem.Service.AdminService;



@RestController
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	@GetMapping("/admins")
	public List<Admin> getAllAdmins() {
	List<Admin> allAdmins = adminService.getAllAdmins();
	return allAdmins;
	}
	@GetMapping("/admin/{id}")
	public Admin getAdminById(@PathVariable("id") int id){
		Admin adminById = adminService.getAdminById(id);
		return adminById;
	}
	@PostMapping("/admin")
	public Admin saveAdmin(@RequestBody Admin d) {
		Admin saveAdmin = adminService.saveAdmin(d);
		return saveAdmin;
	}
	@PutMapping("/admin")
	public Admin updateAdmin(@RequestBody Admin d) {
		Admin updateAdmin = adminService.updateAdmin(d);
		return updateAdmin;
	}
	@DeleteMapping("/admin/{id}")
	public void deleteAdmin(@PathVariable("id") int id) {
		adminService.deleteAdmin(id);
	}

}
