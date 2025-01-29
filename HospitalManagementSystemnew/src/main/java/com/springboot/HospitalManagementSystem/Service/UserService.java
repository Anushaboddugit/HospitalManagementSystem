package com.springboot.HospitalManagementSystem.Service;

import java.util.List;

import com.springboot.HospitalManagementSystem.Model.User;

public interface UserService {
	

		public List<User> getAllUsers();
		
		public User getUserById(int id);

		public User saveUser(User d);

		public User updateUser(User d);

		public void deleteUser(int id);
	

}
