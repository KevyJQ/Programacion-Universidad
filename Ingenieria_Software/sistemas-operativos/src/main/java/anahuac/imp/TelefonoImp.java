package anahuac.imp;

import java.util.Scanner;

import anahuac.intf.ScanService;
import anahuac.intf.Telefono;
import anahuac.model.TipoTelefono;

public class TelefonoImp implements Telefono {
	final double minNumFijo = 0.5;
	final double minNumCel = 1.0;
	int cantMinF = 0;
	int cantMinC = 0;

	ScanService scanService = new ScanServiceImp();
	Scanner sc = new Scanner(System.in);

	public TelefonoImp(ScanService scanService) {
		this.scanService = scanService;
	}

	@Override
	public void telefonoFijo(TipoTelefono telefono) {
		if (telefono.getContadorF() == 0) {
			telefono.setContadorF(1);
		} else {
			telefono.setContadorF(telefono.getContadorF() + 1);
		}
		while (true) {
			System.out.println("Llamada " + telefono.getContadorF());
			System.out.println("Cuantos minutos te tardaste en la llamada: ");
			telefono.setCantMinFijo(cantMinF += sc.nextInt());
			telefono.setCostoLlamadasFijas(telefono.getCantMinFijo() * minNumFijo);
			int opc = scanService.pedirNumeroEntreRango("Desea hacer otra llamada\n1.Si\n2.No", "Esa opcion no existe",
					1, 2);
			if (opc == 2) {
				telefono.setCantLlamadasFijas(telefono.getContadorF());
				return;
			}
			telefono.setContadorF(telefono.getContadorF() + 1);
		}
	}

	@Override
	public void telefonoCelular(TipoTelefono telefono) {
		if (telefono.getContadorC() == 0) {
			telefono.setContadorC(1);
		} else {
			telefono.setContadorC(telefono.getContadorC() + 1);
		}
		while (true) {
			System.out.println("Llamada " + telefono.getContadorC());
			System.out.println("Cuantos minutos te tardaste en la llamada: ");
			telefono.setCantMinCel(cantMinC += sc.nextInt());
			telefono.setCostoLlamadasCel(telefono.getCantMinCel() * minNumCel);
			int opc = scanService.pedirNumeroEntreRango("Desea hacer otra llamada\n1.Si\n2.No", "Esa opcion no existe",
					1, 2);
			if (opc == 2) {
				telefono.setCantLlamadasCelular(telefono.getContadorC());
				return;
			}
			telefono.setContadorC(telefono.getContadorC() + 1);
		}
	}

	@Override
	public void pedirDatos(TipoTelefono telefono) {
		System.out.print("Dame tu nombre: ");
		telefono.setName(sc.nextLine());
	}

	@Override
	public void imprirmirDatos(TipoTelefono telefono) {
		// Impirmimos el nombre
		System.out.println("Nombre del usuario: " + telefono.getName());
		// Imprimimos los datos de las llamadas a telefono fijo
		System.out.println("Cantidad de llamadas realizadas por telefono fijo: " + telefono.getCantLlamadasFijas());
		System.out.println("Cantidad de minutos de llamadas a telefono fijo: " + telefono.getCantMinFijo());
		System.out
				.println("Costo total en pesos de las llamadas fijas realizadas: " + telefono.getCostoLlamadasFijas());
		System.out.println();
		// Imprimimos los datos de las llamadas a telefonos celulares
		System.out
				.println("Cantidad de llamadas realizadas por telefono celular: " + telefono.getCantLlamadasCelular());
		System.out.println("Cantidad de minutos de llamadas a telefonos celular: " + telefono.getCantMinCel());
		System.out.println(
				"Costo total en pesos de las llamadas en celular realizadas: " + telefono.getCostoLlamadasCel());
		System.out.println();
		// Imprimimos los tados globales
		int totalLlamadas = telefono.getCantLlamadasFijas() + telefono.getCantLlamadasCelular();
		System.out.println("Total de llamadas en genera: " + totalLlamadas);
		int totalMinutos = telefono.getCantMinFijo() + telefono.getCantMinCel();
		System.out.println("Totatl de minutos en llamadas: " + totalMinutos);
		double totalCosto = telefono.getCostoLlamadasFijas() + telefono.getCostoLlamadasCel();
		System.out.println("Total de pesos: " + totalCosto);
		System.out.println();
		// Imprimirmos el costo promedio por minuto
		double costoPromedio = totalCosto / totalLlamadas;
		System.out.println("El Costo promedio por minuto fue de: " + costoPromedio);
	}

}
