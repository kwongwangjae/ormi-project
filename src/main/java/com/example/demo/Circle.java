package com.example.demo;

public class Circle implements Shape{

	private double radius;

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	public Circle(double radius) {
		this.radius = radius;
	}
}
