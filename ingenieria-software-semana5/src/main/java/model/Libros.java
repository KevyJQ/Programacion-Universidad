package model;

import java.util.ArrayList;
import java.util.List;

import service.Prestable;

public class Libros extends Publicacion implements Prestable {
	private List<Libros> libros = new ArrayList<Libros>();
	private String estatus;

	public List<Libros> getLibros() {
		return libros;
	}

	public void setLibros(List<Libros> libros) {
		this.libros = libros;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	@Override
	public void prestar() {
		System.out.println("Metodo prestar en clase libro");
		setEstatus("Prestado");
	}

	@Override
	public void devolver() {
		System.out.println("Metodo devolver en clase Libro");
		setEstatus("Disponible");

	}

	@Override
	public void prestado(Libros libros) {
		System.out.println("Metodo prestado en clase libro");
		estatus = "Este libro esta prestado";
	}

}
