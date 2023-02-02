package services;

import model.Estudiante;
import model.Persona;
import model.PersonalServicio;
import model.Profesor;

public interface InfoService {

	void pedirDatos(Persona persona);

	void cambioEstadoCivil(Persona persona);

	void reAsignacionOficina(Persona persona);

	void agregarMaterias(Estudiante estudiante);

	void imprimirDatosGeneral(Persona persona);

	void imprimirMaterias(Estudiante estudiante);

	void imprimirDepartamento(Profesor profesor);

	void imprimirSeccionAsignada(PersonalServicio personalServicio);

	void inicializarMaterias();

	void pedirDatosProfesor(Profesor profesor);

	void pedirDatosPersonalSerivicio(PersonalServicio personalServicio);

}
