package com.example.jpademo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jpademo.beans.Product;

@Repository
public interface ProductRepository extends JpaRepository <Product,Integer>
{
	
}