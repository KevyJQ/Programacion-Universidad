package main;

import model.Estudiante;
import model.PersonalServicio;
import model.Profesor;
import services.InfoService;
import services.MostrarMenu;
import services.ScanService;
import services.impl.InfoServiceImpl;
import services.impl.MostrarMenuImpl;
import services.impl.ScanServiceImp;

public class Main {

	public static void main(String[] args) {

		ScanService scanService = new ScanServiceImp();
		InfoService infoService = new InfoServiceImpl();

		Estudiante estudiante = new Estudiante();
		Profesor profesor = new Profesor();
		PersonalServicio personalServicio = new PersonalServicio();

		MostrarMenu menu = new MostrarMenuImpl(estudiante, profesor, personalServicio, scanService, infoService);
		infoService.inicializarMaterias();
		menu.mostrarMenu();
	}

}
