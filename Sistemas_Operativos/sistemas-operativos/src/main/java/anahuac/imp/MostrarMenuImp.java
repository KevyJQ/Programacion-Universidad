package anahuac.imp;

import anahuac.intf.MostrarMenu;
import anahuac.intf.ScanService;
import anahuac.intf.Telefono;
import anahuac.model.TipoTelefono;

public class MostrarMenuImp implements MostrarMenu {

	private Telefono telefono;
	private ScanService scanService;
	TipoTelefono tipoTelefono = new TipoTelefono();

	private enum MenuType {
		FIJO, CELULAR, REINICIAR_SISTEMA, MOSTRAR_DATOS, SALIR
	};

	public MostrarMenuImp(Telefono telefono, ScanService scanService, TipoTelefono tipoTelefono2) {
		this.telefono = telefono;
		this.scanService = scanService;
	}

	public void mostrarMenu() {
		System.out.println("==========================================");
		System.out.println("----- Bienvenido a mi sistema -----");
		telefono.pedirDatos(tipoTelefono);
		while (true) {
			MenuType opcion = mostrarOpciones();
			switch (opcion) {
			case FIJO:
				telefono.telefonoFijo(tipoTelefono);
				break;
			case CELULAR:
				telefono.telefonoCelular(tipoTelefono);
				break;
			case REINICIAR_SISTEMA:
				tipoTelefono = new TipoTelefono();
				break;
			case MOSTRAR_DATOS:
				telefono.imprirmirDatos(tipoTelefono);
				break;
			case SALIR:
				System.out.println("\n\tLindo dia.");
				return;
			}
		}
	}

	private MenuType mostrarOpciones() {
		int opcion;

		System.out.println("================================");
		System.out.println("        Menu Principal");
		System.out.println("================================");

		System.out.println("1. Llamada a numero fijo");
		System.out.println("2. Llamada a celular");
		System.out.println("3. Reiniciar servicios");
		System.out.println("4. Mostrar datos");
		System.out.println("5. Salir");

		opcion = scanService.pedirNumeroEntreRango("Opcion:", "Opcion no valida, ingrese nuevamente", 1, 5);

		MenuType[] menu = MenuType.values();
		return menu[opcion - 1];

	}
}
