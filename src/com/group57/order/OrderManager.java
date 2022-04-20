package com.group57.order;

import com.group57.deliverly.DeliveryManager;
import com.group57.menu.Menu;
import com.group57.payment.PaymentManager;

public class OrderManager {
	private Menu menu;
	private DeliveryManager deliveryManager;
	private PaymentManager paymentManager;
	private Order[] orders;

	public OrderManger(Menu menu, DeliveryManager deliveryManager, PaymentManager paymentManager) {
		this.menu = menu;
		this.deliveryManager = deliveryManager;
		this.paymentManager = paymentManager;
	}

	public Menu getMenu() {
	}

	public void placeOrder(Order order) {
	}
}