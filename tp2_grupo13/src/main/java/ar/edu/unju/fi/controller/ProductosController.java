package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.unju.fi.listas.ListaProductos;
import ar.edu.unju.fi.model.Producto;

@Controller
@RequestMapping("/")
public class ProductosController {
	ListaProductos listaProducto = new ListaProductos();
	
	@GetMapping("/productos")
	public String getProductosPagina() {
		return "productos";
	}
	@GetMapping("/listadoproductos")
	public String getListaProductosPagina(Model model) {
		model.addAttribute("productos", ListaProductos.getProductos());
		return "listadoproductos";
	}
	@GetMapping("/nuevo_producto")
	public String getNuevoProductoPagina(Model model) {
		model.addAttribute("producto", new Producto());
		return "nuevo_producto";
	}
	
	@PostMapping("/guardar")
	public ModelAndView getGuardarProductosPage(@ModelAttribute ("producto") Producto producto){
		ModelAndView modelView =new ModelAndView ("productos");
		ListaProductos.getProductos().add(producto);
		modelView.addObject("productos",ListaProductos.getProductos());
		return modelView;
	}
	
}