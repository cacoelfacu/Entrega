package model.negocio;

public class Producto {
	
	private Double precio;
	private String codigo;
	private	String nombre;
	private	String categoria;
	
	public Producto() {
		
	}
	public Producto(Double precio, String codigo, String nombre, String categoria) {
		super();
		this.precio = precio;
		this.codigo = codigo;
		this.nombre = nombre;
		this.categoria = categoria;
	}
	
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
}
