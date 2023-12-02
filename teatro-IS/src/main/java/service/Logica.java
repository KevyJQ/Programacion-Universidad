package service;

import java.util.List;

import model.Cliente;

public interface Logica {
	void entrada(String lugar, String tipo, List<Cliente> clientes);

	void llenarDatos(String area, String tipo, List<Cliente> clientes);

}
