package com.example.demo;

public class Triangle implements Shape{

	private double base;
	private double height;

	@Override
	public double getArea() {
		return (base * height) / 2;
	}

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
}
