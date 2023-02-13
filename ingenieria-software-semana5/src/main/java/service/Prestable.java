package service;

import model.Libros;

public interface Prestable {
	void prestar();

	void devolver();

	void prestado(Libros libros);

}
