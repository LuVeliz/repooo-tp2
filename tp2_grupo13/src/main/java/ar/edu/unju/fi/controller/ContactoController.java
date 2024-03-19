package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.listas.ListaContacto;
import ar.edu.unju.fi.model.Contacto;
//import jakarta.validation.Valid;

@Controller
@RequestMapping("/contactos")

public class ContactoController {
	ListaContacto listaContacto= new ListaContacto();
	
	@Autowired 
	private Contacto contacto;
	
	@GetMapping("/listado")
	public String getListaContactosPagina(Model model) {
		model.addAttribute("contactos", ListaContacto.getContactos());
		return "listado_contactos";
	}
	
	@GetMapping("/formulario")
	public String getNuevoContactoPagina(Model model) {
		contacto = new Contacto();
		model.addAttribute("contacto", new Contacto());
		return "contacto";
	}
	
	@PostMapping("/guardarContacto")
	public ModelAndView getGuardarContactosPage(@ModelAttribute ("contacto") Contacto contacto) {
		ModelAndView modelView = new ModelAndView("listado_contactos");
		ListaContacto.getContactos().add(contacto);
		modelView.addObject("contactos",ListaContacto.getContactos());
		return modelView;
	}
	
}
