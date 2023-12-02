package service.impl;

import java.util.List;
import java.util.Scanner;

import model.Cliente;
import service.Logica;

public class LogicaImpl implements Logica {

	Scanner scanner = new Scanner(System.in);

	private int id = 0;
	private int principal = 0;
	private int palco = 0;
	private int lateral = 0;
	private int central = 0;

	@Override
	public void entrada(String lugar, String tipo, List<Cliente> clientes) {
		System.out.println("menu logica " + lugar);
		// Principal
		if (lugar == "PRINCIPAL") {
			if (principal <= 200) {
				llenarDatos(lugar, tipo, clientes);
				System.out.println("ID: " + id);
				principal++;
			} else
				System.out.println("Ya no quedan lugares");
		}
		// Palco
		if (lugar == "PALCO") {
			if (palco <= 40) {
				llenarDatos(lugar, tipo, clientes);
				System.out.println("ID: " + id);
				palco++;
			} else
				System.out.println("Ya no quedan lugares");
		}
		// Central
		if (lugar == "CENTRAL") {
			if (central <= 400) {
				llenarDatos(lugar, tipo, clientes);
				System.out.println("ID: " + id);
				lateral++;
			} else
				System.out.println("Ya no quedan lugares");
		}
		// Lateral
		if (lugar == "LATERAL") {
			if (lateral <= 100) {
				llenarDatos(lugar, tipo, clientes);
				System.out.println("ID: " + id);
				lateral++;
			} else
				System.out.println("Ya no quedan lugares");
		}
	}

	@Override
	public void llenarDatos(String area, String tipo, List<Cliente> clientes) {
		Cliente cliente = new Cliente();
		cliente.setId(id);
		System.out.println("Dame tu nombre:");
		cliente.setName(scanner.nextLine());
		cliente.setArea(area);
		cliente.setTipo(tipo);

		if (area == "PRINCIPAL") {
			if (tipo == "ALUMNO" || tipo == "JUBILADO") {
				System.out.println("Cuantos alumnos o jubilados serian: ");
				cliente.setCantidadBoletos(scanner.nextLine());
				double total = 2500 * 0.85;
				cliente.setCostoTotal(total * Integer.parseInt(cliente.getCantidadBoletos()));
			} else {
				System.out.println("Cuantos boletos generales compraras: ");
				cliente.setCantidadBoletos(scanner.nextLine());
				cliente.setCostoTotal(2500 * Integer.parseInt(cliente.getCantidadBoletos()));
			}
		}
		if (area == "PALCO") {
			if (tipo == "ALUMNO" || tipo == "JUBILADO") {
				System.out.println("Cuantos alumnos o jubilados serian: ");
				cliente.setCantidadBoletos(scanner.nextLine());
				double total = 7000 * 0.85;
				cliente.setCostoTotal(total * Integer.parseInt(cliente.getCantidadBoletos()));
			} else {
				System.out.println("Cuantos boletos generales compraras: ");
				cliente.setCantidadBoletos(scanner.nextLine());
				cliente.setCostoTotal(7000 * Integer.parseInt(cliente.getCantidadBoletos()));
			}
		}
		if (area == "CENTRAL") {
			if (tipo == "ALUMNO" || tipo == "JUBILADO") {
				System.out.println("Cuantos alumnos o jubilados serian: ");
				cliente.setCantidadBoletos(scanner.nextLine());
				double total = 2000 * 0.85;
				cliente.setCostoTotal(total * Integer.parseInt(cliente.getCantidadBoletos()));
			} else {
				System.out.println("Cuantos boletos generales compraras: ");
				cliente.setCantidadBoletos(scanner.nextLine());
				cliente.setCostoTotal(2000 * Integer.parseInt(cliente.getCantidadBoletos()));
			}
		}
		if (area == "LATERAL") {
			if (tipo == "ALUMNO" || tipo == "JUBILADO") {
				System.out.println("Cuantos alumnos o jubilados serian: ");
				cliente.setCantidadBoletos(scanner.nextLine());
				double total = 1550 * 0.85;
				cliente.setCostoTotal(total * Integer.parseInt(cliente.getCantidadBoletos()));
			} else {
				System.out.println("Cuantos boletos generales compraras: ");
				cliente.setCantidadBoletos(scanner.nextLine());
				cliente.setCostoTotal(1550 * Integer.parseInt(cliente.getCantidadBoletos()));
			}
		}
		clientes.add(cliente);
		id++;
	}
}
