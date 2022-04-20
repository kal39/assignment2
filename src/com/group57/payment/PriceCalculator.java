/*
Group 57
Akhilesh Ramesh (i6291958), Kai Kitagawa-Jones (i6275822)
*/

package com.group57.payment;

import com.group57.order.Order;

public interface PriceCalculator {
	public double calculatePrice(Order order);
}