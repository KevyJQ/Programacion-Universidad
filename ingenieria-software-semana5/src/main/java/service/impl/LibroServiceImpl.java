package service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Libros;
import service.LibroService;
import service.ScanService;

public class LibroServiceImpl implements LibroService {

	Libros libros;
	ScanService scanService;
	List<Libros> libro;

	private enum MenuType {
		AGREGAR_LIBRO, PRESTAR_LIBRO, DEVOLVER_LIBRO, MOSTRAR_LIBROS, ATRAS
	}

	public LibroServiceImpl(ScanService scanService, Libros libros) {
		this.scanService = scanService;
		this.libros = libros;
	}

	@Override
	public void menuLibro() {
		// System.out.println("Menu Libro...");
		while (true) {
			MenuType opcion = opciones();
			switch (opcion) {
			case AGREGAR_LIBRO:
				while (true) {
					pedirDatos(new Libros());
					int opc = scanService.pedirNumeroEntreRango("Desea agregar otro libro\n1.Si\n2.No : ",
							"Opcion no valilda", 1, 2);
					if (opc == 2) {
						break;
					}
				}
			case PRESTAR_LIBRO:
				break;
			case DEVOLVER_LIBRO:
				break;
			case MOSTRAR_LIBROS:
				mostrarLibros();
				break;
			case ATRAS:
				return;
			}
		}
	}

	private MenuType opciones() {
		int opcion;

		System.out.println("================================");
		System.out.println("1. Agregar libro");
		System.out.println("2. Prestar libro");
		System.out.println("3. Devolver libro");
		System.out.println("4. Imprimir todos los libros");
		System.out.println("5. Salir");

		opcion = scanService.pedirNumeroEntreRango("Opcion: ", "Opcion no valida...", 1, 4);
		MenuType[] menu = MenuType.values();
		return menu[opcion - 1];
	}

	@Override
	public void pedirDatos(Libros libros) {
		Scanner scanner = new Scanner(System.in);
		libro = new ArrayList<Libros>();

		System.out.print("Dame el codigo del libro: ");
		libros.setCodigo(scanner.nextLine());
		System.out.print("Cual es el titulo del libro: ");
		libros.setTitulo(scanner.nextLine());
		System.out.print("Cual es el anio de publicacion: ");
		libros.setaPublicacion(scanner.nextLine());
		libros.devolver();

		libro.add(libros);
	}

	@Override
	public void mostrarLibros() {
		for (Libros AllBooks : libro) {
			System.out.println("================================");
			System.out.println("Codigo: " + AllBooks.getCodigo());
			System.out.println("Titulo: " + AllBooks.getTitulo());
			System.out.println("Anio de Publicacion: " + AllBooks.getaPublicacion());
			System.out.println("Estatus: " + AllBooks.getEstatus());
		}

	}

}
