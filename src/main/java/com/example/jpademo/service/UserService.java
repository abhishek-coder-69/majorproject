package com.example.jpademo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpademo.beans.User;
import com.example.jpademo.dao.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public List<User> getAllUsers()
	{
		return userRepository.findAll();
	}

	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	public User getUser(String email) {
		User user = userRepository.findById(email).orElse(null);
		return user;
	}

}