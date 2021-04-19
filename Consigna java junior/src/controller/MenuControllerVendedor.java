package controller;

import java.util.ArrayList;

import model.negocio.Global;
import model.negocio.Producto;
import model.negocio.Vendedor;
import view.MenuVistaProducto;
import view.MenuVistaVendedor;

public class MenuControllerVendedor {
	
	private MenuVistaVendedor mivista = new MenuVistaVendedor();
	
	public Global menuVendedor(Global global) {
		
		global=mivista.menuVendedor(global);
		
		return global;
	}

	public ArrayList<Vendedor> agregar(ArrayList<Vendedor> vendedores) {
		vendedores.add(mivista.agregarVendedor());
		return vendedores;
	}

	public void Listar(ArrayList<Vendedor> vendedores) {
		mivista.listar(vendedores);
		
	}

}
