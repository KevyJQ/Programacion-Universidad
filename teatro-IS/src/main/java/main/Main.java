package main;

import service.Logica;
import service.MostrarMenu;
import service.ScanService;
import service.impl.LogicaImpl;
import service.impl.MostrarMenuImpl;
import service.impl.ScanServiceImp;

public class Main {

	public static void main(String[] args) {

		ScanService scanService = new ScanServiceImp();
		Logica logica = new LogicaImpl();

		MostrarMenu menu = new MostrarMenuImpl(scanService, logica);
		menu.mostrarMenu();

	}

}
