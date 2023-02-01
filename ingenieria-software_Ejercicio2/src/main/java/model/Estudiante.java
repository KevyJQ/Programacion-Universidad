package model;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {

	private int cursoInscrito;
	private List<Materias> materias = new ArrayList<Materias>();

	public int getCursoInscrito() {
		return cursoInscrito;
	}

	public int setCursoInscrito(int cursoInscrito) {
		return this.cursoInscrito = cursoInscrito;
	}

	public List<Materias> getMaterias() {
		return materias;
	}

	public void setMaterias(List<Materias> materias) {
		this.materias = materias;
	}

}
