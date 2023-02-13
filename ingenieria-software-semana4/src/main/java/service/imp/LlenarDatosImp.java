package service.imp;

import java.util.Scanner;

import model.Cliente;
import model.Empleado;
import model.Persona;
import service.LlenarDatos;

public class LlenarDatosImp implements LlenarDatos {

	Scanner sc = new Scanner(System.in);

	@Override
	public void llenarDatoCliente(Cliente cliente) {
		System.out.print("Ingrese su RFC: ");
		cliente.setRfc(sc.nextLine());
		System.out.print("Edad: ");
		cliente.setEdad(sc.nextLine());
		System.out.print("Sexo: ");
		cliente.setSexo(sc.nextLine());
		System.out.println();
	}

	@Override
	public void llenarDatosEmpleado(Empleado empleado) {
		System.out.print("Dame tu numero de empleado: ");
		empleado.setNoEmpleado(sc.nextLine());
		System.out.print("Sucursal: ");
		empleado.setSucursal(sc.nextLine());
		System.out.print("Salario: ");
		empleado.setSalario(sc.nextInt());
		System.out.println();
	}

	@Override
	public void llenarDatosPersona(Persona persona) {
		System.out.print("Dame tu nombre: ");
		persona.setNombre(sc.nextLine());
		System.out.print("Dame tu apellido peterno: ");
		persona.setaPaterno(sc.nextLine());
		System.out.print("Dame tu apellido materno: ");
		persona.setaPaterno(sc.nextLine());
	}

	@Override
	public void imprimirDatosCliente(Cliente cliente) {
		System.out.println("Nombre: " + cliente.getNombre());
		System.out.println("Apellido paterno: " + cliente.getaPaterno());
		System.out.println("Apellido materno: " + cliente.getaMaterno());
		System.out.println("RFC: " + cliente.getRfc());
		System.out.println("Edad: " + cliente.getEdad());
		System.out.println("Sexo: " + cliente.getSexo());
	}

	@Override
	public void imprimirDatosEmpleado(Empleado empleado) {
		System.out.println("Nombre: " + empleado.getNombre());
		System.out.println("Apellido paterno: " + empleado.getaPaterno());
		System.out.println("Apellido materno: " + empleado.getaMaterno());
		System.out.println("Numero de empleado: " + empleado.getNoEmpleado());
		System.out.println("Sucursal: " + empleado.getSucursal());
		System.out.println("Salario: " + empleado.getSalario());

	}

}
