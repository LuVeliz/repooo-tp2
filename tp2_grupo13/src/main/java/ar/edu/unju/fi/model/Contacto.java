package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;

@Component
public class Contacto {
	private String nombreC;
	private String correo;
	private String ciudad;
	private String mensaje;
	
	public String getNombreC() {
		return nombreC;
	}
	public void setNombreC(String nombreC) {
		this.nombreC = nombreC;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public Contacto(String nombreC, String correo, String ciudad, String mensaje) {
		super();
		this.nombreC = nombreC;
		this.correo = correo;
		this.ciudad = ciudad;
		this.mensaje = mensaje;
	}
	public Contacto() {
		super();
	}
	
}
