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
		ESTUDIANTE, PROFESOR, PERSONAL_SERVICIO, CAMBIAR_ESTADO_CIVIL, RE_ASIGNACION_OFICINA, MOSTRAR_DATOS, SALIR
	};

	private enum MenuType2 {
		ESTUDIANTE, PROFESOR, PERSONAL_SERVICIO, ATRAS
	};

	private enum MenuType3 {
		PROFESOR, PERSONAL_SERVICIO, ATRAS
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
				System.out.println("Ingresa los datos del estudiante");
				datos.pedirDatos(estudiante);
				int opc = scanService.pedirNumeroEntreRango("Deseas meter una materia?\n1.Si\n2.No",
						"Esa opcion no existe", 1, 2);
				while (true) {
					if (opc == 1) {
						datos.agregarMaterias(estudiante);
						int opc2 = scanService.pedirNumeroEntreRango("Deseas meter otra materia?\n1.Si\n2.No",
								"Opcion no valida", 1, 2);
						if (opc2 == 2) {
							break;
						}
					} else {
						break;
					}
				}
				break;

			case PROFESOR:
				System.out.println("Menu profesor");
				datos.pedirDatos(profesor);
				datos.pedirDatosProfesor(profesor);
				break;

			case PERSONAL_SERVICIO:
				System.out.println("Menu personal de servicio");
				datos.pedirDatos(personalServicio);
				datos.pedirDatosPersonalSerivicio(personalServicio);
				break;

			case CAMBIAR_ESTADO_CIVIL:
				cambioEstadoCivil();
				break;

			case RE_ASIGNACION_OFICINA:
				reAsignacionOficina();
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
				datos.imprimirDatosGeneral(estudiante);
				datos.imprimirMaterias(estudiante);
				break;

			case PROFESOR:
				datos.imprimirDatosGeneral(profesor);
				datos.imprimirDepartamento(profesor);
				break;

			case PERSONAL_SERVICIO:
				datos.imprimirDatosGeneral(personalServicio);
				datos.imprimirSeccionAsignada(personalServicio);
				break;

			case ATRAS:
				return;
			}
		}
	}

	private void cambioEstadoCivil() {
		while (true) {
			MenuType2 opc = opcionesPersona();
			switch (opc) {
			case ESTUDIANTE:
				if (estudiante.getEstadoCivil() == null) {
					System.out.println("Aun no has ingresado datos del estudiante");
					break;
				} else {
					datos.cambioEstadoCivil(estudiante);
				}
				break;

			case PROFESOR:
				if (profesor.getEstadoCivil() == null) {
					System.out.println("Aun no has ingresado datos del profesor");
					break;
				} else {
					datos.cambioEstadoCivil(profesor);
				}
				break;

			case PERSONAL_SERVICIO:
				if (personalServicio.getEstadoCivil() == null) {
					System.out.println("Aun no has ingresado datos del personal de servicio");
					break;
				} else {
					datos.cambioEstadoCivil(personalServicio);
				}
				break;

			case ATRAS:
				return;
			}
		}
	}

	private void reAsignacionOficina() {
		while (true) {
			MenuType3 opc = opcionesEmpleado();
			switch (opc) {
			case PROFESOR:
				if (profesor.getNumOficina() == null) {
					System.out.println("Aun no se han llenado los datos del profesor");
					break;
				} else {
					datos.reAsignacionOficina(profesor);
				}
				break;

			case PERSONAL_SERVICIO:
				if (personalServicio.getNumOficina() == null) {
					System.out.println("Aun no se han llenado los datos del personal de servicio");
					break;
				} else {
					datos.reAsignacionOficina(personalServicio);
				}
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
		System.out.println("4. Cambiar Estado civil");
		System.out.println("5. Re-Asignar oficina");
		System.out.println("6. Mostrar datos");
		System.out.println("7. Salir");

		opcion = scanService.pedirNumeroEntreRango("Opcion:", "Opcion no valida, ingrese nuevamente", 1, 7);

		MenuType[] menu = MenuType.values();
		return menu[opcion - 1];

	}

	private MenuType2 opcionesPersona() {
		int opcion;

		System.out.println("================================");

		System.out.println("1. Estudiante");
		System.out.println("2. Profesor");
		System.out.println("3. Personal de Servicio");
		System.out.println("4. Atras..");

		opcion = scanService.pedirNumeroEntreRango("Opcion:", "Opcion no valida, ingrese nuevamente", 1, 4);

		MenuType2[] menu = MenuType2.values();
		return menu[opcion - 1];

	}

	private MenuType3 opcionesEmpleado() {
		int opcion;

		System.out.println("================================");

		System.out.println("1. Profesor");
		System.out.println("2. Personal de Servicio");
		System.out.println("3. Atras..");

		opcion = scanService.pedirNumeroEntreRango("Opcion:", "Opcion no valida, ingrese nuevamente", 1, 4);

		MenuType3[] menu = MenuType3.values();
		return menu[opcion - 1];

	}

}
