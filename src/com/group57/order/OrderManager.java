package com.group57.order;

import com.group57.deliverly.DeliveryManager;
import com.group57.menu.Menu;
import com.group57.payment.PaymentManager;

public class OrderManger {
	Menu menu;
	DeliveryManager deliverlyManager;
	PaymentManager paymentManager;
	Order[] orders;

	public OrderManger(Menu menu, DeliveryManager deliverlyManager, PaymentManager paymentManager) {
		this.menu = menu;
		this.deliverlyManager = deliverlyManager;
		this.paymentManager = paymentManager;

	}

	public Menu getMenu() {
	}

	public void placeOrder(Order order) {
	}
}