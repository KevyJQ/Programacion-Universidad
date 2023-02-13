package model;

import java.util.ArrayList;
import java.util.List;

public class Revistas extends Publicacion{

	private List<Revistas> revista = new ArrayList<Revistas>();
	private String numRevista;

	public List<Revistas> getRevista() {
		return revista;
	}

	public void setRevista(List<Revistas> revista) {
		this.revista = revista;
	}

	public String getNumRevista() {
		return numRevista;
	}

	public void setNumRevista(String numRevista) {
		this.numRevista = numRevista;
	}

}
