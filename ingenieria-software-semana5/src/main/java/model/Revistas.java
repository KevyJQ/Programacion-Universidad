package model;

public class Revistas extends Publicacion {

	private String numRevista;

	public Revistas(String numRevista) {
		this.numRevista = numRevista;
	}

	public String getNumRevista() {
		return numRevista;
	}

	public void setNumRevista(String numRevista) {
		this.numRevista = numRevista;
	}

}
