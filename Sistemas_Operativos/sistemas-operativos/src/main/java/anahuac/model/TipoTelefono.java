package anahuac.model;

public class TipoTelefono {

	private String name;
	private double costoLlamadasFijas;
	private double costoLlamadasCel;
	private double costoTotalFinal;
	private int cantLlamadasFijas;
	private int cantLlamadasCelular;
	private int cantMinFijo;
	private int cantMinCel;
	private int contadorF ;
	private int contadorC ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCantLlamadasFijas() {
		return cantLlamadasFijas;
	}

	public void setCantLlamadasFijas(int cantLlamadasFijas) {
		this.cantLlamadasFijas = cantLlamadasFijas;
	}

	public int getCantLlamadasCelular() {
		return cantLlamadasCelular;
	}

	public void setCantLlamadasCelular(int cantLlamadasCelular) {
		this.cantLlamadasCelular = cantLlamadasCelular;
	}

	public int getCantMinFijo() {
		return cantMinFijo;
	}

	public void setCantMinFijo(int cantMinFijo) {
		this.cantMinFijo = cantMinFijo;
	}

	public int getCantMinCel() {
		return cantMinCel;
	}

	public void setCantMinCel(int cantMinCel) {
		this.cantMinCel = cantMinCel;
	}

	public double getCostoLlamadasFijas() {
		return costoLlamadasFijas;
	}

	public void setCostoLlamadasFijas(double costoLlamadasFijas) {
		this.costoLlamadasFijas = costoLlamadasFijas;
	}

	public double getCostoLlamadasCel() {
		return costoLlamadasCel;
	}

	public void setCostoLlamadasCel(double costoLlamadasCel) {
		this.costoLlamadasCel = costoLlamadasCel;
	}

	public double getCostoTotalFinal() {
		return costoTotalFinal;
	}

	public void setCostoTotalFinal(double costoTotalFinal) {
		this.costoTotalFinal = costoTotalFinal;
	}

	public int getContadorF() {
		return contadorF;
	}

	public void setContadorF(int contadorF) {
		this.contadorF = contadorF;
	}

	public int getContadorC() {
		return contadorC;
	}

	public void setContadorC(int contadorC) {
		this.contadorC = contadorC;
	}

}
