package service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import model.Cliente;

/*
 * En esta seccion mostraremos 10 pruebas manuelaes
 * */

public class ClienteTest {

	/*
	 * La funcion de este Test es checar que una vez creado el cliente, solo lo
	 * registre como 1
	 */
	@Test
	public void agregarCliente() {
		List<Cliente> clientes = new ArrayList<Cliente>();
		Cliente cliente = new Cliente();
		cliente.setName("pedro");
		cliente.setArea("principal");
		clientes.add(cliente);
		assertEquals(clientes.size(), 1);
	}

	/*
	 * La funcion es checar que el nombre del cliente se haya guardado de forma
	 * correcta
	 */
	@Test
	public void exiteCliente() {
		Cliente cliente = new Cliente();
		cliente.setName("NameClienteTest");
		assertNotNull(cliente.getName());
	}

	/*
	 * */
	@Test
	public void dddd() {
		
	}
}
