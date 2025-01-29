package com.springboot.HospitalManagementSystem.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.HospitalManagementSystem.Entity.DoctorEntity;
import com.springboot.HospitalManagementSystem.Entity.UserEntity;
import com.springboot.HospitalManagementSystem.Model.Doctor;
import com.springboot.HospitalManagementSystem.Model.User;
import com.springboot.HospitalManagementSystem.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	@Override
	public List<User> getAllUsers() {
		List<UserEntity> all = userRepository.findAll();
		ObjectMapper mapper = new ObjectMapper();
		List<User> usermodels = all.stream().map(x -> convert(x)).collect(Collectors.toList());
		return usermodels;
	}
	public User convert(UserEntity u) {
		
		return new User(u.getUser_id(),u.getFull_name(),u.getEmail(),u.getPassword());
	}
	@Override
	public User getUserById(int id) {
		UserEntity d=userRepository.getById(id);
		User convert = convert(d);
		return convert;
	}

	@Override
	public User saveUser(User d) {
		
		UserEntity u=new UserEntity(d.getUser_id(),d.getFull_name(),d.getEmail(),d.getPassword());
		UserEntity save = userRepository.save(u);
		
		return convert(save);
	}

	@Override
	public User updateUser(User d) {
		
		UserEntity u=new UserEntity(d.getUser_id(),d.getFull_name(),d.getEmail(),d.getPassword());
		UserEntity save = userRepository.save(u);
		
		return convert(save);
	}

	@Override
	public void deleteUser(int id) {
		User d = getUserById(id);
		UserEntity u=new UserEntity(d.getUser_id(),d.getFull_name(),d.getEmail(),d.getPassword());
		userRepository.delete(u);
		
	}

}
