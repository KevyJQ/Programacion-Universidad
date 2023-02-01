package main;

import impl.MostrarMenuImpl;
import impl.ScanServiceImp;
import intf.InfoService;
import intf.MostrarMenu;
import intf.ScanService;
import model.Estudiante;
import model.PersonalServicio;
import model.Profesor;
import services.InfoServiceImpl;

public class Main {

	public static void main(String[] args) {

		ScanService scanService = new ScanServiceImp();
		InfoService infoService = new InfoServiceImpl();

		Estudiante estudiante = new Estudiante();
		Profesor profesor = new Profesor();
		PersonalServicio personalServicio = new PersonalServicio();

		MostrarMenu menu = new MostrarMenuImpl(estudiante, profesor, personalServicio, scanService, infoService);
		menu.mostrarMenu();
	}

}
