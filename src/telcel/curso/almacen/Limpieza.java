package telcel.curso.almacen;

public class Limpieza extends Producto{
	private String tipoEnvase;
	
	private String medida;

	public Limpieza(String nombre, double precio, String tipoEnvase, String medida) {
		super(nombre, precio);
		this.tipoEnvase = tipoEnvase;
		this.medida = medida;
	}

	public String getTipoEnvase() {
		return tipoEnvase;
	}

	public String getMedida() {
		return medida;
	}
	
	
	
	

}
