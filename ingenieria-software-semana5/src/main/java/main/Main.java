package main;

import model.Libros;
import model.Revistas;
import service.MostrarMenu;
import service.RevistaService;
import service.ScanService;
import service.impl.LibroServiceImpl;
import service.impl.MostrarMenuImp;
import service.impl.RevistaServiceImpl;
import service.impl.ScanServiceImp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ScanService service = new ScanServiceImp();

		Libros libros = new Libros();
		Revistas revistas = new Revistas();
		LibroServiceImpl libroService = new LibroServiceImpl(service, libros);
		RevistaService revistaService = new RevistaServiceImpl();
		MostrarMenu menu = new MostrarMenuImp(libros, revistas, service, libroService, revistaService);
		menu.menu();

	}

}
