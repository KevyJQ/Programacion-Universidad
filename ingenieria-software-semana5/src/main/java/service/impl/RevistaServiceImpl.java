package service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Revistas;
import service.RevistaService;
import service.ScanService;

public class RevistaServiceImpl implements RevistaService {

	Scanner scanner = new Scanner(System.in);
	Revistas revistas;
	ScanService scanService;
	List<Revistas> revista;

	private enum MenuType {
		AGREGAR_REVISTA, MOSTRAR_REVISTAS, ATRAS
	}

	public RevistaServiceImpl(ScanService scanService) {
		this.scanService = scanService;
	}

	@Override
	public void menuRevista() {
		while (true) {
			MenuType opcion = opciones();
			switch (opcion) {

			case AGREGAR_REVISTA:
				revista = new ArrayList<Revistas>();
				while (true) {
					pedirDatos();
					int opc = scanService.pedirNumeroEntreRango("Desea agregar otra revista\n1.Si\n2.No : ",
							"Opcion no valilda", 1, 2);
					if (opc == 2) {
						break;
					}
				}
				break;
			case MOSTRAR_REVISTAS:
				if (revista == null) {
					System.out.println("Aun no tenemos revistas..");
				} else {
					mostrarRevistas();
				}
				break;

			case ATRAS:
				return;
			}
		}
	}

	public String numRevis() {
		System.out.print("Cual es el numero de la revista: ");
		String valor = scanner.nextLine();
		return valor;
	}

	private MenuType opciones() {
		int opcion;

		System.out.println("================================");
		System.out.println("1. Agregar Revista");
		System.out.println("2. Imprimir todas las revistas");
		System.out.println("3. Salir");

		opcion = scanService.pedirNumeroEntreRango("Opcion: ", "Opcion no valida...", 1, 3);
		MenuType[] menu = MenuType.values();
		return menu[opcion - 1];
	}

	@Override
	public void pedirDatos() {
		String valor = numRevis();
		revistas = new Revistas(valor);	//Pasamos el parametro de numero de revista
		System.out.print("Dame el codigo de la revista: ");
		revistas.setCodigo(scanner.nextLine());
		System.out.print("Que revista es: ");
		revistas.setTitulo(scanner.nextLine());
		System.out.print("De que anio es la revista: ");
		revistas.setaPublicacion(scanner.nextLine());

		revista.add(revistas);
	}

	@Override
	public void mostrarRevistas() {
		for (Revistas AllMagazine : revista) {
			System.out.println("================================");
			System.out.println("Codigo: " + AllMagazine.getCodigo());
			System.out.println("Titulo: " + AllMagazine.getTitulo());
			System.out.println("Anio de Publicacion: " + AllMagazine.getaPublicacion());
			System.out.println("Estatus: " + AllMagazine.getNumRevista());
		}

	}

}
