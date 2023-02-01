package intf;

import model.Estudiante;
import model.Persona;
import model.PersonalServicio;
import model.Profesor;

public interface InfoService {

	void pedirDatos(Persona persona);

	void pedirDatosEmpleados(Persona persona);

	void pedirCursos(Estudiante estudiante);

	void cambioEstadoCivil(Persona persona);

	void reAsignacionOficina(Persona persona);

	void departamentoAsignado(Profesor profesor);

	void seccionAsignada(PersonalServicio personalServicio);

	void imprimirDatos(Persona persona);

}
