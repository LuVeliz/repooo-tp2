package ar.edu.unju.fi.listas;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unju.fi.model.Sucursal;

public class ListaSucursal {
	private List<Sucursal> sucursales;
	
	public ListaSucursal() {
		sucursales=new ArrayList<Sucursal>();
		
		sucursales.add(new Sucursal("Macotitas 1", "Palpala", "Belgrano", 321 ,"388822901"));
		sucursales.add(new Sucursal("Mascotitas 2", "San Salvador", "San Martin", 221,"3882910292"));
		sucursales.add(new Sucursal("Mascotitas 3", "San Pedro","Mitre", 190,"3884789201"));
	}

	public List<Sucursal> getSucursales() {
		return sucursales;
	}

	public void setSucursales(List<Sucursal> sucursales) {
		this.sucursales = sucursales;
	}
}
