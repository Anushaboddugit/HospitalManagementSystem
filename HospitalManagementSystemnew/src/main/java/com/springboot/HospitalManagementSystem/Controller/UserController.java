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

import com.springboot.HospitalManagementSystem.Model.User;
import com.springboot.HospitalManagementSystem.Service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
	List<User> allUsers = userService.getAllUsers();
	return allUsers;
	}
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable("id") int id){
		User UserById = userService.getUserById(id);
		return UserById;
	}
	@PostMapping("/user")
	public User saveUser(@RequestBody User d) {
		User saveUser = userService.saveUser(d);
		return saveUser;
	}
	@PutMapping("/user")
	public User updateUser(@RequestBody User d) {
		User updateUser = userService.updateUser(d);
		return updateUser;
	}
	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable("id") int id) {
		userService.deleteUser(id);
	}
}
