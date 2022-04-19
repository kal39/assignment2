package com.group57.order;

import com.group57.menu.MenuItem;

public class Order {
	MenuItem[] menuItems;
	int id;

	public Order(MenuItem[] menuItems, int id) {
		this.menuItems = menuItems;
		this.id = id;
	}

	public double isReady() {
	}

	// example of MenuItem instances:
	void instanceExample() {
		// let salad, lasagna, chocolateCake, beer be MenuItems
		menuItems = new MenuItem[]{salad, lasgana, chocolateCake, beer};
	}
}