package com.example.jpademo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpademo.beans.User;
import com.example.jpademo.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:3007")
public class UserController 
{
	
	@Autowired
	UserService userService;
	
	@GetMapping(value= "/getall")
	public List<User> getAllUser()
	{
		return userService.getAllUsers();
	}
	
	@GetMapping(value= "/getuserbyemail/{email}")
	public User getUser(@PathVariable("email") String email)
	{
		return userService.getUser(email);
	}
	
	@PostMapping(value = "/adduser")
	public User addUser(@RequestBody User user)
	{
		return userService.addUser(user);		
	}
}