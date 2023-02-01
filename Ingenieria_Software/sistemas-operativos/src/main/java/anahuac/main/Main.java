package anahuac.main;

import anahuac.imp.MostrarMenuImp;
import anahuac.imp.ScanServiceImp;
import anahuac.imp.TelefonoImp;
import anahuac.intf.MostrarMenu;
import anahuac.intf.ScanService;
import anahuac.intf.Telefono;
import anahuac.model.TipoTelefono;

public class Main {
	public static void main(String[] args) {
		
		ScanService scanService = new ScanServiceImp();
		TipoTelefono tipoTelefono=	new TipoTelefono();
		Telefono telefono = new TelefonoImp(scanService);
		MostrarMenu menu = new MostrarMenuImp(telefono,scanService,tipoTelefono);
		menu.mostrarMenu();
			
	}
}
