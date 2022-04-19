package com.group57.menu;

public class MenuItem {
	Ingredient[] ingredients;

	public MenuItem(Ingredient[] ingredients) {
		this.ingredients = ingredients;
	}

	public double getPrice() {
	}

	// example of MenuItem instances:
	void instanceExample() {
		// let salt, pasta, beef be Ingredients
		ingredients = new Ingredient[]{salt, pasta, beef};
	}
}