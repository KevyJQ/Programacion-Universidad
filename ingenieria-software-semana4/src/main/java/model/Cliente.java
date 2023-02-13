package model;

public class Cliente extends Persona {

	private String rfc;
	private String edad;
	private String sexo;

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void status() {
		System.out.println("Yo no trabajo en un banco...");
	}

}
