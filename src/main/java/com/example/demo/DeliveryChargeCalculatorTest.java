package com.example.demo;

import com.example.demo.product.*;

public class DeliveryChargeCalculatorTest {
	public static void main(String[] args) {

		Product product1 = new Product(1L, "Product1", 5000, 2);
		Product product2 = new Product(2L, "Product2", 8000, 5);
		Product product3 = new Product(3L, "Product3", 70000, 12);

		DeliveryChargeCalculator calculator = new DeliveryChargeCalculatorPrice();

		int charge1 = calculator.getDeliveryCharge(product1, product1.getPrice(), product1.getWeight());
		int charge2 = calculator.getDeliveryCharge(product2, product2.getPrice(), product2.getWeight());
		int charge3 = calculator.getDeliveryCharge(product3, product3.getPrice(), product3.getWeight());

		System.out.println("Product1 배송비: " + charge1 + "원");
		System.out.println("Product2 배송비: " + charge2 + "원");
		System.out.println("Product3 배송비: " + charge3 + "원");
	}
}
