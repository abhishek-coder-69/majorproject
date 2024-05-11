package com.example.jpademo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jpademo.beans.User;

@Repository
public interface UserRepository extends JpaRepository <User,String>
{
	
}