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
 	* La prueba sirve para verificar la funcionalidad de seleccionar un lugar de asiento
	 * */
	    @Test
    public void seleccionarLugarAsiento() {
        Cliente cliente = new Cliente();
        cliente.setLugarAsiento("A1");
        assertEquals(cliente.getLugarAsiento(), "A1");
    }

	/*
 	* La prueba sirve para verificar la funcionalidad de seleccionar un lugar de asiento
	 * */
    @Test
    public void calcularPrecioPagar() {
        Cliente cliente = new Cliente();
        cliente.setPrecio(100);
        assertEquals(cliente.calcularPrecioDescuento(), 90); // Suponiendo un descuento del 10%
    }

	/*
 	* La prueba sirve para verificar que se muestra el menú completo de forma adecuada
	 * */
    @Test
    public void mostrarMenuCompleto() {
        Cliente cliente = new Cliente();
        List<String> menu = cliente.obtenerMenuCompleto();
        assertNotNull(menu);
        assertEquals(menu.size(), 5); // depende el número de opciones
    }
}
