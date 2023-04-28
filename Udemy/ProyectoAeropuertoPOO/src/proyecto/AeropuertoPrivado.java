package proyecto;

public class AeropuertoPrivado extends Aeropuerto {

	private String[] listaEmpresas = new String[10];
	private int numEmpresa;
	
	public AeropuertoPrivado(String nombre, String ciudad, String pais) {
		super(nombre, ciudad, pais);
	}

	public AeropuertoPrivado(String nombre, String ciudad, String pais, Compañia[] listaCompañias, String[] empresas) {
		super(nombre, ciudad, pais, listaCompañias);
		this.listaEmpresas = empresas;
		numEmpresa = empresas.length;
	}

	public void insertarEmpresas(String[] empresas) {
		this.listaEmpresas = empresas;
		this.numEmpresa = empresas.length;
	}
	
	public void insetarEmpresa(String empresa) {
		listaEmpresas[numEmpresa]= empresa;
		numEmpresa++;
	}

	public String[] getListaEmpresas() {
		return listaEmpresas;
	}

	public int getNumEmpresa() {
		return numEmpresa;
	}
	
	
}
