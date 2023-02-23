package model;

import java.util.Date;

public class Logger {

	private static Logger log;
	private String name;
	private String password;
	private String usuario;
	private String contra;

	private Logger() { // Constructor
		// Lo hacemos privado para que solo se pueda acceder desde la clase
	}

	public static Logger getInstance() {
		if (log == null) {
			log = new Logger();
		}
		return log;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContra() {
		return contra;
	}

	public void setContra(String contra) {
		this.contra = contra;
	}

	public void login() {
		if (usuario!= null && usuario.equals(name)) {
			System.out.println("El Usuario " + getName() + " a entrado en la fecha " + new Date());
		} else {
			System.out.println("Falla de autentificacion...");
		}
	}

}
