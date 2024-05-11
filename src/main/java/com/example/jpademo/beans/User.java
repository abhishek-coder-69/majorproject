package com.example.jpademo.beans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User 
{
	
	@Column(name="name")
	private String Name;
	
	@Id
	@Column(name="email")
	private String Email;
	
	@Column(name="pan")
	private String pan;
	
	@Column(name="password")
	private String password;
	


	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

	public User(String name, String email, String pan, String password) {
		super();
		Name = name;
		Email = email;
		this.pan = pan;
		this.password = password;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [Name=" + Name + ", Email=" + Email + ", pan=" + pan + "]";
	}
	
	

}