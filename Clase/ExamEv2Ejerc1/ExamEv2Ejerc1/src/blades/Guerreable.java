package blades;

//interface que declara los métodos abstractos lanzarBlade y atacar a Blade
public interface Guerreable {
	public void lanzarBlade(int velocidad);
	public void atacarABlade (Blade b);

}
