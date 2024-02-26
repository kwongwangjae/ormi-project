package com.example.demo;

public class Rectangle implements Shape{
	private double width;
	private double height;


	@Override
	public double getArea() {
		return width * height;
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
}
