package model.negocio;

import java.util.ArrayList;

public class Global {

	private ArrayList<Venta> ventas;
	private ArrayList<Producto> productos;
	private ArrayList<Vendedor> vendedores;
	private Vendedor vendedorActual;
	
	
	
	public Global(ArrayList<Venta> ventas, ArrayList<Producto> productos, ArrayList<Vendedor> vendedores,
			Vendedor vendedorActual) {
		super();
		this.ventas = ventas;
		this.productos = productos;
		this.vendedores = vendedores;
		this.vendedorActual = vendedorActual;
	}
	public Vendedor getVendedorActual() {
		return vendedorActual;
	}
	public void setVendedorActual(Vendedor vendedorActual) {
		this.vendedorActual = vendedorActual;
	}
	public Global() {
	
	}
	
	public ArrayList<Venta> getVentas() {
		return ventas;
	}
	public void setVentas(ArrayList<Venta> ventas) {
		this.ventas = ventas;
	}
	public ArrayList<Producto> getProductos() {
		return productos;
	}
	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	public ArrayList<Vendedor> getVendedores() {
		return vendedores;
	}
	public void setVendedores(ArrayList<Vendedor> vendedores) {
		this.vendedores = vendedores;
	}
	
	
}
