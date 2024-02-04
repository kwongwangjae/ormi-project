package com.example.demo.product;

import jdk.jfr.Category;

public class Product {
	private Long id;
	private String name;

	private Categorys categorys;
	private int price;
	private int weight;

	public Product(Long id, String name, int price, int weight) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.weight = weight;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getWeight() {
		return weight;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
