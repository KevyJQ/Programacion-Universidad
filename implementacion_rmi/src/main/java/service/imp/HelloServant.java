package service.imp;

import java.io.FilterInputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Clientes;
import service.HelloService;

public class HelloServant extends UnicastRemoteObject implements HelloService {

	List<Clientes> clientes = new ArrayList<Clientes>();

	Scanner sc = new Scanner(new FilterInputStream(System.in) {
		public void close() {
		}
	});

	int numCuenta = 1;

	// Es importante que declaremos el constructor con sus devidas throws
	public HelloServant() throws RemoteException {
	}

	// Implmentacion de los metodos
	public String echo(String input) throws RemoteException {
		return "From server: " + input;
	}

	@SuppressWarnings("unlikely-arg-type")
	public void opcion(int opc) throws RemoteException {
		switch (opc) {
		case 1:
			System.out.println("Apertura de cuenta");

			Clientes cliente = new Clientes();
			llenarDatos(cliente);

			System.out.println("=== Datos de la cuenta ===");
			imprimirDatos(cliente);

			break;

		case 2:
			System.out.println("Deposito");

			if (clientes.size() == 0) {
				System.out.println("Aun no hay cuentas agregadas");
				break;
			}

			System.out.print("Cual es tu numero de Cuenta: ");
			String cuenta = sc.nextLine();

			System.out.println("Cuenta '" + cuenta + "'");
			System.out.println("Size: " + clientes.size());

			if (existeCuenta(cuenta)) {
				System.out.print("Cuanto deseas depositar $$: ");
				int dinero = Integer.parseInt(sc.nextLine());
				operacinoDeposito(cuenta, dinero);
				System.out.println("Saldo inicial: " + clientes.get(Integer.parseInt(cuenta) - 1).getSaldoInicial());
				System.out.println("Saldo final: " + clientes.get(Integer.parseInt(cuenta) - 1).getSaldoFinal());
			} else {
				System.out.println("Este numero de cuenta no existe");
				break;
			}
			break;

		case 3:
			System.out.println("Retiro");
			if (clientes.size() == 0) {
				System.out.println("Aun no hay cuentas agregadas");
				break;
			}
			System.out.println("Cual es tu numero de cuenta: ");
			String cuentaa = sc.nextLine();

			if (existeCuenta(cuentaa)) {
				System.out.println("Cuanto deseas retirar $$: ");
				int retiro = Integer.parseInt(sc.nextLine());
				if (retiro > Integer.parseInt(clientes.get(Integer.parseInt(cuentaa) - 1).getSaldoFinal())) {
					System.out.println("Lo sentimos el saldo que ingreso no es posible retirar");
					break;
				}
				operacionRetiro(cuentaa, retiro);
				System.out.println("Saldo inicial: " + clientes.get(Integer.parseInt(cuentaa) - 1).getSaldoInicial());
				System.out.println("Saldo final: " + clientes.get(Integer.parseInt(cuentaa) - 1).getSaldoFinal());
			} else {
				System.out.println("Este numero de cuenta no existe");
				break;
			}
			break;

		case 4:
			imprimirAll();
			break;

		case 5:
			System.out.println("\n\tHasta luego\n\t");
			return;
		default:
			System.out.println("Esa opcion no existe..");
			break;
		}
	}

	public void llenarDatos(Clientes cliente) {
		System.out.print("Dame tu nombre: ");
		cliente.setName(sc.nextLine());
		System.out.print("Con cuanto dinero deseas abrir tu cuenta: ");
		cliente.setSaldoInicial(sc.nextLine());
		cliente.setSaldoFinal(cliente.getSaldoInicial());
		cliente.setNumCuenta(Integer.toString(numCuenta));
		clientes.add(cliente);
		numCuenta++;
	}

	public void imprimirDatos(Clientes cliente) {
		System.out.println("Nombre: " + cliente.getName());
		System.out.println("Numero de cuenta: " + cliente.getNumCuenta());
		System.out.println("Saldo de apertura: " + cliente.getSaldoInicial());
	}

	public void imprimirAll() {
		for (Clientes clien : clientes) {
			System.out.println("----");
			System.out.println("Name: " + clien.getName());
			System.out.println("Numero de Cuenta: " + clien.getNumCuenta());
			System.out.println("Saldo incial: " + clien.getSaldoInicial());
			System.out.println("Saldo final: " + clien.getSaldoFinal());
		}
	}

	public void operacinoDeposito(String cuenta, int dinero) {
		Clientes cliente = clientes.get(Integer.parseInt(cuenta) - 1);

		int valIni = Integer.parseInt(cliente.getSaldoFinal()); // Extraemos el
																// valor inicial
		cliente.setSaldoInicial(Integer.toString(valIni)); // Asignamos el mismo valor
															// a valor final
		int suma = valIni + dinero;// Hacemos la suma
		cliente.setSaldoFinal(Integer.toString(suma));// Asignamos el nuevo valor
	}

	public void operacionRetiro(String cuentaa, int retiro) {
		Clientes cliente = clientes.get(Integer.parseInt(cuentaa)-1);
		int valIni = Integer.parseInt(cliente.getSaldoFinal()); // Extraemos el
																									// valor inicial
		cliente.setSaldoInicial(Integer.toString(valIni));
		int resta = valIni - retiro;
		cliente.setSaldoFinal(Integer.toString(resta));
	}

	public boolean existeCuenta(String cuenta) {
		int cuentaa = Integer.parseInt(cuenta)-1;
		if (cuentaa >= 0 && cuentaa < clientes.size()) {
			return true;
		}
		return false;
	}
}
