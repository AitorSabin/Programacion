package proyecto;

public class Aeropuerto {

	private String nombre;
	private String ciudad;
	private String pais;
	private Compa�ia[] listaCompa�ias = new Compa�ia[10];
	private int numCompa�ia;
	
	public Aeropuerto(String nombre, String ciudad, String pais) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
		this.numCompa�ia = 0;
	}

	public Aeropuerto(String nombre, String ciudad, String pais, Compa�ia[] listaCompa�ias) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
		this.listaCompa�ias = listaCompa�ias;
		this.numCompa�ia = listaCompa�ias.length;
	}
	
	public void insertarCompa�ia(Compa�ia compa�ia) {
		listaCompa�ias[numCompa�ia] = compa�ia;
		numCompa�ia++;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public String getPais() {
		return pais;
	}

	public Compa�ia[] getListaCompa�ias() {
		return listaCompa�ias;
	}

	public int getNumCompa�ia() {
		return numCompa�ia;
	}
	
	public Compa�ia getCompa�ia(int i) {
		return listaCompa�ias[i];
	}
	
	public Compa�ia getCompa�ia(String nombreCompa�ia) {
		boolean encontrado = false;
		int i=0;
		Compa�ia c = null;
		while((!encontrado)&& i<listaCompa�ias.length) {
			if(nombreCompa�ia.equals(listaCompa�ias[i].getNombre())) {
				encontrado = true;
				c= listaCompa�ias[i];
			}
			i++;
		}
		return c;
	}
	
}
