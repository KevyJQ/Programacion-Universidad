package main;

import model.Libros;
import service.MostrarMenu;
import service.RevistaService;
import service.ScanService;
import service.impl.LibroServiceImpl;
import service.impl.MostrarMenuImp;
import service.impl.RevistaServiceImpl;
import service.impl.ScanServiceImp;

public class Main {

	public static void main(String[] args) {

		ScanService service = new ScanServiceImp();
		Libros libros = new Libros();
		LibroServiceImpl libroService = new LibroServiceImpl(service, libros);
		RevistaService revistaService = new RevistaServiceImpl(service);
		MostrarMenu menu = new MostrarMenuImp(libros, service, libroService, revistaService);
		menu.menu();

	}
}
