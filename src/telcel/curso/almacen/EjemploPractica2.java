package telcel.curso.almacen;


public class EjemploPractica2 {

	public static void main(String[] args) {
		Producto[] producto = new Producto[8];
		
		Producto lacteo1 = new Lacteo("Leche", 24, "Origen Animal", 2);
		Producto lacteo2 = new Lacteo("Queso", 42, "Origen Vegetal", 10);
		
		Producto fruta1 = new Fruta("Mango", 20, 5, "Amarillo");
		Producto fruta2 = new Fruta("Sandia", 25, 10, "Roja");
		
		Producto limpieza1 = new Limpieza("Escoba", 50, "N/A", "Unidad");
		Producto limpieza2 = new Limpieza("Suavizante", 35, "Bote", "Litros");
		
		Producto noPre1 = new NoPerecible("Lata", 26, 5, "Esferica");
		Producto noPre2 = new NoPerecible("Esponjas", 10, 30, "Rectangular");
		
		producto[0] = lacteo1;
		producto[1] = lacteo2;
		producto[2] = fruta1;
		producto[3] = fruta2;
		producto[4] = limpieza1;
		producto[5] = limpieza2;
		producto[6] = noPre1;
		producto[7] = noPre2;
		
		for (Producto item: producto) {
			
			System.out.println(" =========================== " + item.getClass().getSimpleName() + " =========================== ");
			System.out.println("Nombre: " + item.getNombre());
			System.out.println("Precio: " + item.getPrecio());
			
			if(item instanceof Lacteo) {
				System.out.println("Tipo Lacteo: " + ((Lacteo) item).getTipoLacteo());
				System.out.println("Peso: " + ((Lacteo) item).getPeso());
				
			}
			if(item instanceof Fruta) {
				System.out.println("Color: " + ((Fruta) item).getColor());
				System.out.println("Peso: " + ((Fruta) item).getPeso());
				
			}
			if(item instanceof Limpieza) {
				System.out.println("Tipo Envase: " + ((Limpieza) item).getTipoEnvase());
				System.out.println("Medida: " + ((Limpieza) item).getMedida());
				
			}
			if(item instanceof NoPerecible) {
				System.out.println("Cantidad: " + ((NoPerecible) item).getCantidad());
				System.out.println("Forma: " + ((NoPerecible) item).getForma());
				
			}
			
		}

	}

}
