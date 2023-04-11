package com.challenge.challenge.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Column;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity(name = "Product")
public class Product {
    
	public Product(Long id, String name, int price, int amountAvaiable) {
		
		this.id = id;
		this.name = name;
		this.price = price;
		this.amountAvaiable = amountAvaiable;
	}
	public Product() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmountAvaiable() {
		return amountAvaiable;
	}
	public void setAmountAvaiable(int amountAvaiable) {
		this.amountAvaiable = amountAvaiable;
	}
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
    private String name;
	@Column(name = "price")
    private int price;
	@Column(name = "amount_avaiable")
    private int amountAvaiable;
	
	
}
