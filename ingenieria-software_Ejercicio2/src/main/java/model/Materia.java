package model;

import java.util.List;

public class Materia {
	private int id;
	private String nombre;
	private List<Estudiante> estudiantes;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	// Agregar un estudiante a la lista estudiantes
	public void agregarEstudiante(Estudiante estudiante) {
		estudiantes.add(estudiante);
	}

	// Remover estudiante
	public void removerEstudiante(Estudiante estudiante) {
		estudiantes.remove(estudiante);
	}

}
