package com.challenge.challenge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.challenge.models.Product;
import com.challenge.challenge.services.ProductService;

@RestController
@RequestMapping(path = "api")
public class ProductController {
	
		private final ProductService productService;
		
		@Autowired
		public ProductController(ProductService productService) {
			this.productService = productService;
		}
		
	   @GetMapping("/getProducts")
		public List<Product> getProducts() {
			return productService.getAllProducts();
		}
}
