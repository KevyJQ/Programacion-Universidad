package intf;

public interface ScanService {

	public int pedirInt(String msg, String errorMsg);

	public int pedirNumeroEntreRango(String msg, String errorMsg, int limiteInferiorInclusivo,
			int limiteSuperiorInclusivo);
}
