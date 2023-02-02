package services.impl;

import model.Estudiante;
import model.PersonalServicio;
import model.Profesor;
import services.InfoService;
import services.MostrarMenu;
import services.ScanService;

public class MostrarMenuImpl implements MostrarMenu {

	private ScanService scanService;
	private InfoService datos;
	private Estudiante estudiante;
	private Profesor profesor;
	private PersonalServicio personalServicio;

	private enum MenuType {
		ESTUDIANTE, PROFESOR, PERSONAL_SERVICIO, MOSTRAR_DATOS, SALIR
	};

	private enum MenuType2 {
		ESTUDIANTE, PROFESOR, PERSONAL_SERVICIO, ATRAS
	};

	public MostrarMenuImpl(Estudiante estudiante, Profesor profesor, PersonalServicio personalServicio,
			ScanService scanService, InfoService datos) {
		this.estudiante = estudiante;
		this.profesor = profesor;
		this.personalServicio = personalServicio;
		this.scanService = scanService;
		this.datos = datos;
	}

	public void mostrarMenu() {
		System.out.println("==========================================");
		System.out.println("----- Bienvenido a mi sistema -----");
		while (true) {
			MenuType opcion = mostrarOpciones();
			switch (opcion) {
			case ESTUDIANTE:
				System.out.println("Menu estudiante");
				datos.pedirDatos(estudiante);
				// TODO: Checar el error de las materias
				datos.agregarMaterias(estudiante);
				break;

			case PROFESOR:
				System.out.println("Menu profesor");
				datos.pedirDatos(profesor);
				datos.pedirDatosEmpleados(profesor);
				datos.departamentoAsignado(profesor);
				break;

			case PERSONAL_SERVICIO:
				System.out.println("Menu personal de servicio");
				datos.pedirDatos(personalServicio);
				datos.pedirDatosEmpleados(personalServicio);
				datos.seccionAsignada(personalServicio);
				break;

			case MOSTRAR_DATOS:
				System.out.println("Mostrar datos");
				mostrarSubMenu();
				break;

			case SALIR:
				System.out.println("\n\tLindo dia...");
				return;
			}
		}
	}

	private void mostrarSubMenu() {
		while (true) {
			MenuType2 opc = opcionesPersona();
			switch (opc) {
			case ESTUDIANTE:
				datos.imprimirDatos(estudiante);
				break;

			case PROFESOR:
				datos.imprimirDatos(profesor);
				break;

			case PERSONAL_SERVICIO:
				datos.imprimirDatos(personalServicio);
				break;

			case ATRAS:
				return;
			}
		}

	}

	private MenuType mostrarOpciones() {
		int opcion;

		System.out.println("================================");
		System.out.println("        Menu Principal");
		System.out.println("================================");

		System.out.println("1. Menu-Estudiantes");
		System.out.println("2. Menu-Profesor");
		System.out.println("3. Menu-Personal de Servicio");
		System.out.println("4. Mostrar datos");
		System.out.println("5. Salir");

		opcion = scanService.pedirNumeroEntreRango("Opcion:", "Opcion no valida, ingrese nuevamente", 1, 5);

		MenuType[] menu = MenuType.values();
		return menu[opcion - 1];

	}

	private MenuType2 opcionesPersona() {
		int opcion;

		System.out.println("================================");

		System.out.println("1. Datos de Estudiante");
		System.out.println("2. Datos del Profesor");
		System.out.println("3. Datos del Personal de Servicio");
		System.out.println("4. Atras..");

		opcion = scanService.pedirNumeroEntreRango("Opcion:", "Opcion no valida, ingrese nuevamente", 1, 4);

		MenuType2[] menu = MenuType2.values();
		return menu[opcion - 1];

	}

}
