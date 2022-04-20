package com.group57.payment;

import com.group57.order.Order;

public class PaymentManager {
	private PriceCalculator priceCalculator;
	private Order[] orders;

	public PaymentManager(PriceCalculator priceCalculator) {
		this.priceCalculator = priceCalculator;
	}

	public void addOrder(Order order) {
	}

	public double getPrice(int id) {
	}

	public void pay(String paymentInfo) {
	}
}