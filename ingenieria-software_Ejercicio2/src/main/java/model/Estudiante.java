package model;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {

	private List<Materia> materias;

	public Estudiante() {
		this.materias = new ArrayList<>();
	}

	public List<Materia> getMaterias() {
		return materias;
	}

	public void agregarMateria(Materia materia) {
		materias.add(materia);
	}

	public void removerMateria(Materia materia) {
		materias.remove(materia);
	}
}
