package service.impl;

import model.Hawaiana;
import model.Mexicana;
import model.Pepperoni;
import service.Pizza;

public class PizzaFactory {
	public static Pizza getInstance(int type) {

		Pizza pizza = null;

		switch (type) {
		case 1:
			pizza = new Hawaiana();
			System.out.println(pizza.getType());
			break;
		case 2:
			pizza = new Pepperoni();
			System.out.println(pizza.getType());
			break;
		case 3:
			pizza = new Mexicana();
			System.out.println(pizza.getType());
			break;

		default:
			System.out.println("Esa opcion no existe...");
			break;
		}

		return pizza;

	}
}
