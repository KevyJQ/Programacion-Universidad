package service.imp;

import model.Cliente;
import model.Empleado;
import model.Persona;
import service.LlenarDatos;
import service.MostrarMenu;

public class MostarMenuImp implements MostrarMenu {

	private LlenarDatos datos;
	private Persona cliente;
	private Persona empleado;
	private Cliente cliente2;
	private Empleado empleado2;

	public MostarMenuImp(LlenarDatos datos, Persona cliente, Persona empleado, Cliente cliente2, Empleado empleado2) {
		this.datos = datos;
		this.cliente = cliente;
		this.empleado = empleado;
		this.cliente2 = cliente2;
		this.empleado2 = empleado2;
	}

	public void mostrarMenu() {
		// TODO Auto-generated method stub
		System.out.println("================================");
		System.out.println("      Bienvenido al Banco		");
		System.out.println("================================");

		System.out.println("Ingrese los siguientes datos...");
		System.out.println("================================");
		System.out.println("       Datos del cliente		");
		System.out.println();

		datos.llenarDatosPersona(cliente2);
		datos.llenarDatoCliente(cliente2);

		System.out.println("================================");
		System.out.println("       Datos del empleado		");
		System.out.println();

		datos.llenarDatosPersona(empleado2);
		datos.llenarDatosEmpleado(empleado2);

		System.out.println("================================");
		System.out.println("       	 Datos generales		");
		
		System.out.println("---Cliente---");
		datos.imprimirDatosCliente(cliente2);
		cliente.status(); // Implementando polimorfismo
		System.out.println();
		
		System.out.println("---Empleado---");
		datos.imprimirDatosEmpleado(empleado2);
		empleado.status(); // Implementando polimorfismo

	}
}
