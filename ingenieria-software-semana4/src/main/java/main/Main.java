package main;

import model.Cliente;
import model.Empleado;
import model.Persona;
import service.LlenarDatos;
import service.MostrarMenu;
import service.imp.LlenarDatosImp;
import service.imp.MostarMenuImp;

public class Main {

	public static void main(String[] args) {
		LlenarDatos datos = new LlenarDatosImp();
		Persona cliente = new Cliente();
		Persona empleado = new Empleado();
		Cliente cliente2 = new Cliente();
		Empleado empleado2 = new Empleado();

		MostrarMenu menu = new MostarMenuImp(datos, cliente, empleado, cliente2, empleado2);
		menu.mostrarMenu();

	}
}
