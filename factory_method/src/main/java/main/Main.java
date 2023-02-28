package main;

import java.util.Scanner;

import service.Pizza;
import service.impl.PizzaFactory;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\nSelecciona la pizza\n1.Hawaiana\n2.Pepperoni\n3.Mexicana\n4.Salir");
			int opc = sc.nextInt();
			if (opc == 4) {
				System.out.println("\n\tAdios");
				return;
			} else {
				Pizza pizza = PizzaFactory.getInstance(opc);
			}
		}
	}

}
