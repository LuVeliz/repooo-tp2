package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;

@Component
public class Sucursal {
	private String nombre;
	private String ciudad;
	private String calle;
	private int numero;
	private  String telefono;
	
	public Sucursal(String nombre, String ciudad, String calle, int numero, String telefono) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.calle = calle;
		this.numero = numero;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Sucursal() {
		super();
	}
	
}
