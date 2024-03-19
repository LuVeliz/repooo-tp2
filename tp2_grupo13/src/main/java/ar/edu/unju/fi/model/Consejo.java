package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;

@Component
public class Consejo {
	private String titulo;
	private String cuerpo;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCuerpo() {
		return cuerpo;
	}
	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	public Consejo(String titulo, String cuerpo) {
		super();
		this.titulo = titulo;
		this.cuerpo = cuerpo;
	}
	public Consejo() {
		super();
	}
	
}
