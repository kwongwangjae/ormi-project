package com.example.demo.product;

public class DeliveryChargeCalculatorPrice implements DeliveryChargeCalculator{
	@Override
	public int getDeliveryCharge(Product product, int price, int weight) {
		if(price > 100000){
			return 0;
		}
		if (weight < 3) {
			return 1000;
		} else if (weight < 3 && price >= 30000 && price < 100000) {
			return 0;
		} else if (weight >= 3 && weight < 10) {
			return 5000;
		} else if (weight >= 3 && weight < 10 && price >= 30000 && price < 100000 ) {
			return 4000;
		} else if (weight >= 10 && price >= 30000 && price < 100000) {
			return 9000;
		} else {
			return 10000;
		}
	}
}
