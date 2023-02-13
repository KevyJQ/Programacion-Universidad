package service;

import model.Cliente;
import model.Empleado;
import model.Persona;

public interface LlenarDatos {

	void llenarDatosPersona(Persona persona);

	void llenarDatoCliente(Cliente cliente);

	void llenarDatosEmpleado(Empleado empleado);

	void imprimirDatosCliente(Cliente cliente);

	void imprimirDatosEmpleado(Empleado empleado);

}
