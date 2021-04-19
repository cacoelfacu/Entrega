package view;


import java.util.ArrayList;
import java.util.Scanner;

import controller.MenuControllerMain;
import controller.MenuControllerProducto;
import model.negocio.Global;
import model.negocio.Producto;
import util.IOGeneral;

public class MenuVistaProducto {

	public int imprimirMenuPrinc() 
	{
		return IOGeneral.leerInt("<<<MENU PRODUCTO>>>\nIngrese el numero: "
				+ "\n1-Agregar producto"
				+ "\n2-Listar Productos"
				+ "\n3-Listar Productos por categoria"
				+ "\n0-Atras","Lo ingresado no fue un numero entero");
		
	}
	public Global menuProducto(Global global) 
	{
		MenuControllerMain menu = new MenuControllerMain();
		MenuControllerProducto imppro = new MenuControllerProducto();
		int res = -1;
		while(res!=0){
			res= this.imprimirMenuPrinc();
			switch(res){
				case 1: global=imppro.agregar(global);
						break;
				case 2: imppro.Listar(global.getProductos());
				break;
				case 3: imppro.ListarC(global.getProductos());
				break;
				case 0:	menu.menuMain(global);
				default: System.out.println("Numero equivocado");
			}
		}
		return global;
	}
	
	public Producto agregarProducto() {
		Producto producto = new Producto();
		try {
			
			IOGeneral.pritln("Ingrese codigo del producto");
			Scanner scan = new Scanner(System.in);
			producto.setCodigo(scan.nextLine());
			IOGeneral.pritln("Ingrese nombre del producto");
			producto.setNombre(scan.nextLine());
			IOGeneral.pritln("Ingrese categoria del producto");
			producto.setCategoria(scan.nextLine());
			scan.reset();
			IOGeneral.pritln("Ingrese precio del producto");
			producto.setPrecio(scan.nextDouble());
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Ingreso invalido de datos");
		}
		return producto;
	}
	public void listarProductos(ArrayList<Producto> productos) {
		for (Producto producto : productos) {
			IOGeneral.pritln("codigo de producto:"+producto.getCodigo()+""
					+ "\n Nombre del producto: "+producto.getNombre()+""
							+ "\n Precio del producto: "+producto.getPrecio()+""
									+ "\n Categoria: "+producto.getCategoria());
			
		}
		
	}
	public void listarProductosC(ArrayList<Producto> productos,String casio) {
		IOGeneral.pritln("Productos listados por la categoria: "+casio);
		for (Producto producto : productos) {
			if (producto.getCategoria().equals(casio)) {
				IOGeneral.pritln("codigo de producto:"+producto.getCodigo()+""
						+ "\n Nombre del producto: "+producto.getNombre()+""
								+ "\n Precio del producto: "+producto.getPrecio()+""
										+ "\n Categoria: "+producto.getCategoria());
			}
				
		}
		
	}
	public String ingreseC() {
		IOGeneral.pritln("Ingrese categoria de los productos:");
		Scanner scan = new Scanner(System.in);
		String casio = scan.nextLine();
		return casio;
	}
	
	
}
