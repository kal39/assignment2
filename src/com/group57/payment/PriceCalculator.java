package com.group57.payment;

import com.group57.order.Order;

public interface PriceCalculator {
	public double calculatePrice(Order order);
}