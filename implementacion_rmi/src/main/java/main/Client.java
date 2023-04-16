package main;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Clientes;
import service.HelloService;
import service.imp.HelloServant;

public class Client {
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {

		Scanner sc = new Scanner(System.in);
		/*
		 * Traemos la informacion ya antes almacenada en la interfas
		 */
		Registry registry = LocateRegistry.createRegistry(5099);
		registry.rebind("conexion", new HelloServant());
		HelloService service = (HelloService) Naming.lookup("rmi://localhost:5099/conexion");

		// Prueba de conexion exitosa con el servidor
		System.out.println("--- " + service.echo("hey server") + " " + service.getClass().getName());

		// Desarrollo de codigo main
		System.out.println("=== Bievenido ===");
		while (true) {
			System.out.println(
					"1.Crear una cuenta\n2.Realizar deposito\n3.Realizar retiro\n4.ImprimirAllClients\n5.Salir\nOpcion: ");
			int opcion = sc.nextInt();
			service.opcion(opcion);

			System.out.println("==============");
			if (opcion == 5)
				return;
		}

	}
}
