package service.impl;

import model.Libros;
import model.Revistas;
import service.LibroService;
import service.MostrarMenu;
import service.RevistaService;
import service.ScanService;

public class MostrarMenuImp implements MostrarMenu {

	private ScanService scanService;
	private LibroService libroService;
	private RevistaService revistaService;

	private enum MenuType { // Enum para seleccionar la opcion
		LIBRO, REVISTA, SALIR
	};

	public MostrarMenuImp(Libros libros, Revistas revistas, ScanService service, LibroService libroService,
			RevistaService revistaService) { // Constructor
		this.scanService = service;
		this.libroService = libroService;
		this.revistaService = revistaService;
	}

	public void menu() {
		System.out.println("==========================================");
		System.out.println("----- Bienvenido a mi sistema -----");
		while (true) {
			MenuType opcion = mostrarOpciones();
			switch (opcion) {
			case LIBRO:
				libroService.menuLibro();
				break;
			case REVISTA:
				revistaService.menuRevista();
				break;
			case SALIR:
				System.out.println("\n\tLindo Dia");
				return;
			}
		}
	}

	private MenuType mostrarOpciones() {
		int opcion;

		System.out.println("================================");
		System.out.println("        Menu Principal");
		System.out.println("================================");

		System.out.println("1. Menu Libro");
		System.out.println("2. Menu Rvistas");
		System.out.println("3. Salir");

		opcion = scanService.pedirNumeroEntreRango("Opcion: ", "Esa opcion no existe..", 1, 3);
		MenuType[] menu = MenuType.values();
		return menu[opcion - 1];
	}

}