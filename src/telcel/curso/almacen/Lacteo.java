package telcel.curso.almacen;

public class Lacteo extends Producto {
	
	private String tipoLacteo; 
	
	private float peso;

	public Lacteo(String nombre, double precio, String tipoLacteo, float peso) {
		super(nombre, precio);
		this.tipoLacteo = tipoLacteo;
		this.peso = peso;
	}

	public String getTipoLacteo() {
		return tipoLacteo;
	}

	public float getPeso() {
		return peso;
	}

	
	
}
