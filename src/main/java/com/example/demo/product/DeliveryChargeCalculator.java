package com.example.demo.product;

public interface DeliveryChargeCalculator {

	int getDeliveryCharge(Product product, int price, int weight);
}
