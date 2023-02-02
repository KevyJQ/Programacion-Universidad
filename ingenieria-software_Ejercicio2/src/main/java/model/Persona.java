package model;

import java.util.Objects;

public class Persona {

	private String name;
	private String apellidoPaterno;
	private String ApellidoMaterno;
	private String id;
	private String EstadoCivil;
	private String anoIngreso;
	private String numOficina;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return ApellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		ApellidoMaterno = apellidoMaterno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEstadoCivil() {
		return EstadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		EstadoCivil = estadoCivil;
	}

	public String getAnoIngreso() {
		return anoIngreso;
	}

	public void setAnoIngreso(String anoIngreso) {
		this.anoIngreso = anoIngreso;
	}

	public String getNumOficina() {
		return numOficina;
	}

	public void setNumOficina(String numOficina) {
		this.numOficina = numOficina;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		return Objects.equals(id, other.getId());
	}
}
