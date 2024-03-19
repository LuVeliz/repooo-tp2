package ar.edu.unju.fi.listas;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Contacto;

public class ListaContacto {
	private static  List<Contacto> contactos;

	public ListaContacto() {
		contactos = new ArrayList<Contacto>();
		contactos.add(new Contacto("Lu","lu@gmail.com","Palpala", "holi"));
		contactos.add(new Contacto("Ale","Ale@gmail.com","Palpala","uwu"));
		contactos.add(new Contacto("Ro","ro@gmail.com","Palpala",":3"));
	}

	public static List<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(List<Contacto> contactos) {
		ListaContacto.contactos = contactos;
	}
	
}
