package model;

import service.Prestable;

public class Libros extends Publicacion implements Prestable {

	private String estatus;

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	@Override
	public void prestar() {
		System.out.println("Metodo prestar en clase libro");
		setEstatus("No Disponible...Prestado");
	}

	@Override
	public void devolver() {
		System.out.println("Metodo devolver en clase Libro");
		setEstatus("Disponible");

	}

	@Override
	public void prestado(Libros libros) {
		System.out.println("Metodo prestado en clase libro");
		setEstatus("Este libro se encuentra prestado actualmente");
	}

}
