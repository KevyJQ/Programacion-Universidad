package service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Cliente;
import service.Logica;
import service.MostrarMenu;
import service.ScanService;

public class MostrarMenuImpl implements MostrarMenu {

	private List<Cliente> clientes = new ArrayList<Cliente>();

	private ScanService scanService;
	private Logica logica;

	public MostrarMenuImpl(ScanService scanService, Logica logica) {
		this.scanService = scanService;
		this.logica = logica;
	}

	private enum MenuType {
		PRINCIPAL, PALCO, CENTRAL, LATERAL, IMPRIMIR_DATOS, CONSULTA_POR_ID, SALIR
	};

	private enum MenuType2 {
		GENERAL, ALUMNO, JUBILADO, ATRAS
	};

	public void mostrarMenu() {

		System.out.println("================================");
		System.out.println("      Bienvenido al Teatro		");
		System.out.println("================================");

		while (true) {
			MenuType opcion = mostrarOpciones();
			switch (opcion) {
			case PRINCIPAL:
				MenuType2 vali = mostrarId();
				logica.entrada(opcion.name(), vali.name(), clientes);
				// System.out.println("prin");
				break;
			case PALCO:
				MenuType2 vali2 = mostrarId();
				logica.entrada(opcion.name(), vali2.name(), clientes);
				System.out.println("palco");
				break;
			case CENTRAL:
				MenuType2 vali3 = mostrarId();
				logica.entrada(opcion.name(), vali3.name(), clientes);
				System.out.println("central");
				break;
			case LATERAL:
				MenuType2 vali4 = mostrarId();
				logica.entrada(opcion.name(), vali4.name(), clientes);
				System.out.println("lateral");
				break;
			case IMPRIMIR_DATOS:
				imprimirDatos();
				break;
			case CONSULTA_POR_ID:
				consultarDatos();
				break;
			case SALIR:
				System.out.println("\n\tLindo dia...");
				return;
			}
		}
	}

	private MenuType mostrarOpciones() {
		int opcion;

		System.out.println("================================");
		System.out.println("        Menu Principal			");
		System.out.println("================================");

		System.out.println("1. Zona - Principal");
		System.out.println("2. Zona - Palco");
		System.out.println("3. Zona - Central");
		System.out.println("4. Zona - Lateral");
		System.out.println("5. Imprimir datos");
		System.out.println("6. Consultar por ID");
		System.out.println("7. Salir");

		opcion = scanService.pedirNumeroEntreRango("Opcion:", "Opcion no valida, ingrese nuevamente", 1, 7);

		MenuType[] menu = MenuType.values();
		return menu[opcion - 1];
	}

	private MenuType2 mostrarId() {
		int opcion;

		System.out.println("================================");
		System.out.println("        Tipo de cliente 		");
		System.out.println("================================");

		System.out.println("1. General");
		System.out.println("2. Estudiante");
		System.out.println("3. Jubilado");
		System.out.println("4. Atras");

		opcion = scanService.pedirNumeroEntreRango("Opcion:", "Opcion no valida, ingrese nuevamente", 1, 4);

		MenuType2[] menu = MenuType2.values();
		return menu[opcion - 1];
	}

	private void imprimirDatos() {
		for (Cliente cliente : clientes) {
			System.out.println("ID: " + cliente.getId());
			System.out.println(cliente.getArea());
			System.out.println(cliente.getTipo());
			System.out.println(cliente.getName());
			System.out.println("cantidad de boletos: " + cliente.getCantidadBoletos());
			System.out.println("Costo total: " + cliente.getCostoTotal());
			System.out.println("--------------");
		}
	}

	private void consultarDatos() {
		Scanner s = new Scanner(System.in);
		System.out.print("Que ID deseas buscar: ");
		int consultaId = s.nextInt() - 1;
		System.out.println(clientes.get(consultaId).getArea());
		System.out.println(clientes.get(consultaId).getTipo());
		System.out.println(clientes.get(consultaId).getName());

	}
}
