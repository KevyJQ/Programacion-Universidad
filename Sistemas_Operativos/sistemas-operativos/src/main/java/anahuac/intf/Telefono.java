package anahuac.intf;

import anahuac.model.TipoTelefono;

public interface Telefono {

	public void pedirDatos(TipoTelefono telefono);

	public void telefonoFijo(TipoTelefono telefono);

	public void telefonoCelular(TipoTelefono telefono);

	public void imprirmirDatos(TipoTelefono telefono);
}
