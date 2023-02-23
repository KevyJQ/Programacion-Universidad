package service;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Logger;

public class MainTest {

	//Test que funciona y confirma que solo se genera una instancia
	@Test
	public void objectTest() {
		Logger login = Logger.getInstance();
		Logger login2 = Logger.getInstance();

		login.setUsuario("hola");

		assertNotNull(login2);
	}
	
	//Test que falla 
	@Test
	public void failTest() {
		Logger login = Logger.getInstance();
		Logger login2 = Logger.getInstance();
		
		assertNotSame(login, login2);
	}

}
