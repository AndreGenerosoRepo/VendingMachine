package com.challenge.challenge.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.challenge.models.Product;
import com.challenge.challenge.repository.ProductRepository;


@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
    
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}
}
