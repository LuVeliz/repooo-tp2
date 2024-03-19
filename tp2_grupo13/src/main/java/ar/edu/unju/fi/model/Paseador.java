package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;

@Component
public class Paseador {
	private String nombre;
	private String dia;
	private String celular;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public Paseador(String nombre, String dia, String celular) {
		super();
		this.nombre = nombre;
		this.dia = dia;
		this.celular = celular;
	}
	public Paseador() {
		super();
	}
	
}
