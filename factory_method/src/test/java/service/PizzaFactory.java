package service;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import model.Hawaiana;
import model.Pepperoni;

public class PizzaFactory {

	@Test
	public void testObject() {

		Pizza pizza = null;
		assertNull(pizza);

	}

	@Test
	public void sameTest() {
		Hawaiana hawaiana = new Hawaiana();
		Pepperoni pepperoni = new Pepperoni();

		assertNotSame(hawaiana, pepperoni);
	}

}
