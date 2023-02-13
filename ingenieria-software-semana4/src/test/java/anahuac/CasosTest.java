package anahuac;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

import model.Cliente;
import model.Empleado;

public class CasosTest {

	@Test
	public void existeClienteTest() {
		Cliente cliente = new Cliente();
		cliente.setNombre("Kevy");
		assertNotNull(cliente.getNombre());
	}

	@Test
	public void compararPersonas() {
		Cliente cliente = new Cliente();
		Empleado empleado = new Empleado();
		assertNotSame(cliente, empleado);
	}
}
