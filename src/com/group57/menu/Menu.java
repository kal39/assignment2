/*
Group 57
Akhilesh Ramesh (i6291958), Kai Kitagawa-Jones (i6275822)
*/

package com.group57.menu;

public class Menu {
	private MenuItem[] menuItems;

	public Menu(MenuItem[] menuItems) {
		this.menuItems = menuItems;
	}

	public MenuItem[] getItems() {
	}

	// example of MenuItem instances:
	void instanceExample() {
		// let salad, lasagna, chocolateCake, beer be MenuItems
		menuItems = new MenuItem[] {salad, lasgana, chocolateCake, beer};
	}
}