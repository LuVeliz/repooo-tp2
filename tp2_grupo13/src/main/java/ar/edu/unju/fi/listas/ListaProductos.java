package ar.edu.unju.fi.listas;
import java.util.ArrayList;
import java.util.List;
import ar.edu.unju.fi.model.Producto;

public class ListaProductos {
	private static List<Producto> productos;

	
	public ListaProductos() {
		productos= new ArrayList<Producto>();
		productos.add( new Producto("Alimento",234, 12.322,"Alimento",40));
		productos.add(new Producto("Correa",123,7.430,"Juguete",20));
		productos.add(new Producto("Buzo",265,9.372,"Vestimenta",25));
		productos.add(new Producto("Pipeta",140, 2.490,"Cuidado",30));
	}

	public static List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		ListaProductos.productos = productos;
	}
}
