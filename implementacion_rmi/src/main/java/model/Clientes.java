package model;

public class Clientes {

	private String name;
	private String numCuenta;
	private String saldoInicial;
	private String saldoFinal;

	public Clientes() {
		this.saldoInicial = "0";
		this.saldoFinal = "0";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public String getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(String saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	public String getSaldoFinal() {
		return saldoFinal;
	}

	public void setSaldoFinal(String saldoFinal) {
		this.saldoFinal = saldoFinal;
	}

}
