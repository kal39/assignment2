package com.group57.menu;

public class Menu {
	MenuItem[] menuItems;

	public Menu(MenuItem[] menuItems) {
		this.menuItems = menuItems;
	}

	// example of MenuItem instances:
	void instanceExample() {
		// let salad, lasagna, chocolateCake, beer be MenuItems
		menuItems = new MenuItem[]{salad, lasgana, chocolateCake, beer};
	}
}