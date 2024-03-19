package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.unju.fi.listas.ListaProducto;
import ar.edu.unju.fi.model.Producto;
import ar.edu.unju.fi.service.imp.ProductoServiceImp;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/producto")
public class ListadoController {
	@Autowired
	private ProductoServiceImp productoServicioImp;
	ListaProducto listaProducto = new ListaProducto();
	@Autowired 
	private Producto producto;
	
	@GetMapping("/listado")
	public String getListaProductosPagina(Model model) {
		model.addAttribute("productos", ListaProducto.getProductos());
		return "listadoproductos";
	}
	@GetMapping("/nuevo")
	public String getNuevoProductoPagina(Model model) {
		producto= new Producto();
		boolean edicion=false;
		model.addAttribute("producto", new Producto());
		model.addAttribute("edicion",edicion);
		return "nuevo_producto";
	}
	
	@PostMapping("/guardar")
	public ModelAndView getGuardarProductosPage(@Valid @ModelAttribute ("producto") Producto producto, BindingResult result){
		ModelAndView modelView =new ModelAndView ("listadoproductos");
		if(result.hasErrors()) {
			modelView.setViewName("nuevo_producto");
			modelView.addObject("producto", producto);
		}
		else {
			ListaProducto.getProductos().add(producto);
		}
		modelView.addObject("productos",ListaProducto.getProductos());
		return modelView;
	}
	
	@GetMapping("/modificar/{codigo}")
	public String getModificarProductoPage(Model model, @PathVariable(value="codigo")Integer codigo) {
		Producto productoEncontrado=new Producto();
		boolean edicion=true;
		for(Producto prod: ListaProducto.getProductos()) {
			if(prod.getCodigo().equals(codigo)) {
				productoEncontrado=prod;
				break;
			}
		}
		model.addAttribute("producto", productoEncontrado);
		model.addAttribute("edicion", edicion);
		return "nuevo_producto";
	}
	
	@PostMapping("/modificar")
	public String modificarProducto(@ModelAttribute("producto")Producto producto) {
		for(Producto prod: ListaProducto.getProductos()) {
			if(prod.getCodigo().equals(producto.getCodigo())) {
				prod.setNombre(producto.getNombre());
				prod.setPrecio(producto.getPrecio());
				prod.setCategoria(producto.getCategoria());
				prod.setCategoria(producto.getCategoria());
			}
		}
		return "redirect:/producto/listado";
	}
	@GetMapping("/eliminar/{codigo}")
	public String eliminarSucursal(@PathVariable(value="codigo")Integer codigo) {
		for(Producto prod:ListaProducto.getProductos()){
			if(prod.getCodigo().intValue()==codigo.intValue()) {
				ListaProducto.getProductos().remove(prod);
			}
			break;
		}
		return "redirect:/producto/listado";
	}
}