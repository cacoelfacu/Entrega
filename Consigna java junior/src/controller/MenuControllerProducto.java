package controller;

import java.util.ArrayList;

import model.negocio.Global;
import model.negocio.Producto;
import view.MenuVistaProducto;



public class MenuControllerProducto {

	private MenuVistaProducto mivista = new MenuVistaProducto();

	
	public Global menuProductos(Global global) 
	{
		
		
		ArrayList<Producto> productos = global.getProductos();
		
		
		
		global.setProductos(productos);
		mivista.menuProducto(global);
		return global;
		
	}
	
	public Global agregar(Global global) {
		
		global.getProductos().add(mivista.agregarProducto()); 
		
		return global;
	}
	public void Modificar() {
		
	}
	public void Eliminar(){
		
	}
	public void Listar(ArrayList<Producto>productos) {
		mivista.listarProductos(productos);
	}

	public void ListarC(ArrayList<Producto> productos) {
		String casio=mivista.ingreseC();
		mivista.listarProductosC(productos,casio);
		
	}
}
