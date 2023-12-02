package model;

public class Cliente {

	private int id;
	private String area;
	private String tipo;
	private String name;
	private String cantidadBoletos;
	private double costoTotal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCantidadBoletos() {
		return cantidadBoletos;
	}

	public void setCantidadBoletos(String cantidadBoletos) {
		this.cantidadBoletos = cantidadBoletos;
	}

	public double getCostoTotal() {
		return costoTotal;
	}

	public void setCostoTotal(double costoTotal) {
		this.costoTotal = costoTotal;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
