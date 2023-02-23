package main;

import java.util.Scanner;

import model.Logger;

public class Main {

	public static void main(String[] args) {
		Logger login = Logger.getInstance();
		login.setName("kevy");
		login.setPassword("12");

		Scanner sc = new Scanner(System.in);
		System.out.print("Dame tu usuario:");
		login.setUsuario(sc.nextLine());
		System.out.print("Dame tu password:");
		login.setContra(sc.nextLine());

		System.out.println(login.getName());
		
		login.login();
	}

}
