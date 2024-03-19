package ar.edu.unju.fi.listas;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unju.fi.model.Paseador;

public class ListaPaseador {
	private List<Paseador> paseadores;
	
	public ListaPaseador() {
		paseadores = new ArrayList<Paseador>();
		
		paseadores.add(new Paseador("Luis","Lunes","388920183"));
		paseadores.add(new Paseador("Juan", "Miercoles","0238092832"));
		paseadores.add(new Paseador("Matias", "Viernes","384729383"));
	}

	public List<Paseador> getPaseadores() {
		return paseadores;
	}

	public void setPaseadores(List<Paseador> paseadores) {
		this.paseadores = paseadores;
	}
	
}
