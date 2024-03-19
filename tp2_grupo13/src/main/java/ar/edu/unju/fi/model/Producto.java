 package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;

import jakarta.validation.constraints.*;

@Component 
public class Producto {
	@NotEmpty
	@Size(min = 2 , max = 10 ,message = "El nombre debe tener una longitud entre 2 y 10 caracteres")
	private String nombre;
	@Min (value = 1,message ="El codigo debe ser mayor que 0")
	private Integer codigo;
	@Min(value = 1,message="El precio debe ser mayor a 0")
	private Double precio;
	@NotBlank
	private String categoria;
	@Min( value = 1, message="El descuento debe ser mayor o igual a 0")
	@Max(value = 50, message="El descuento debe ser menor o igual a 50")
	private int descuento;
	
	public Producto() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	public Producto(String nombre, Integer codigo, Double precio, String categoria, int descuento) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
		this.categoria = categoria;
		this.descuento = descuento;
	}
	
	public Double calcularDescuento( Double precio,int descuento) {
		double resultado;
		resultado=precio-descuento;
		return resultado;
	}
	
}
