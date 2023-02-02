package services;

import model.Estudiante;
import model.Persona;
import model.PersonalServicio;
import model.Profesor;

public interface InfoService {

	void pedirDatos(Persona persona);

	void pedirDatosEmpleados(Persona persona);

	void cambioEstadoCivil(Persona persona);

	void reAsignacionOficina(Persona persona);

	void agregarMaterias(Estudiante estudiante);

	void departamentoAsignado(Profesor profesor);

	void seccionAsignada(PersonalServicio personalServicio);

	void imprimirDatos(Persona persona);

	void inicializarMaterias();

}
