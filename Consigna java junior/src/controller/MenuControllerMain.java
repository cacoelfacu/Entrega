package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.negocio.Global;
import model.negocio.Producto;
import model.negocio.Vendedor;
import model.negocio.Venta;
import util.IOGeneral;
import view.MenuVistaPrincipal;

public class MenuControllerMain {

	public ArrayList<Producto> productos = new ArrayList<Producto>();
	public ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
	public ArrayList<Venta> ventas = new ArrayList<Venta>();
	public MenuVistaPrincipal aca = new MenuVistaPrincipal();
	public Global global= new Global();
	
	
	public MenuControllerMain(){
		
		
		
		global.setVentas(ventas);
		
		Vendedor vendedor = new Vendedor();
		Vendedor admin = new Vendedor();
		admin.setUsuario("admin");
		admin.setContraseña("1234");
		admin.setCodigo(1);
		admin.setSueldo(900.0);
		admin.setNombre("Facundo Guerrero");
		
		Vendedor producto1 = new Vendedor();
		producto1.setContraseña("fruta");
		producto1.setUsuario("admin2");
		producto1.setCodigo(5);
		producto1.setNombre("Santiago Guerrero");
		producto1.setSueldo(90.2);
		
		vendedores.add(admin);
		vendedores.add(producto1);
		
		Producto produc = new Producto();
		Producto produc2 = new Producto();
		produc.setCodigo("1");
		produc2.setCodigo("2");
		produc.setCategoria("Fruta");
		produc2.setCategoria("Carne");
		produc.setNombre("Manzana");
		produc2.setNombre("Pollo");
		produc.setPrecio(200.00);
		produc2.setPrecio(90.01);
		productos.add(produc2);
		productos.add(produc);
		
		global.setProductos(productos);
		global.setVendedores(vendedores);
	}
	
	public void login() {
		
		Vendedor vendedor = new Vendedor();
		try {
			
			IOGeneral.pritln("Ingrese usuario: ");
			Scanner scan = new Scanner(System.in);
			vendedor.setUsuario(scan.nextLine());
			for (Vendedor vendedor1 : vendedores) {
				if(vendedor1.getUsuario().equals(vendedor.getUsuario())) {
					IOGeneral.pritln("Ingrese la contraseña: ");
					vendedor.setContraseña(scan.nextLine());
					if(vendedor1.getContraseña().equals(vendedor.getContraseña())) {
						IOGeneral.pritln("contraseña valida ");
						
						global.setVendedorActual(vendedor1);
						
						menuMain(global);
					}else {
						IOGeneral.pritln("Contraseña invalida");
						login();
					}
					
				}else {
					IOGeneral.pritln("Usuario inexistente");
					login();
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			IOGeneral.pritln("Ingreso invalido de datos");
		}
		
	}
	
	public void menuMain(Global global) {
		
		
		MenuControllerProducto menuProducto = new MenuControllerProducto();
		MenuControllerVendedor menuVendedor = new MenuControllerVendedor();
		MenuControllerVenta menuVenta = new MenuControllerVenta();
		int res = -1;
		while(res!=0){
			res= aca.imprimirMenuPrincipalPrograma();
			switch(res){
				case 1: global=menuProducto.menuProductos(global);
						break;
				case 2: global=menuVendedor.menuVendedor(global);
						break;
				case 3: global=menuVenta.vender(global);
						break;
				case 0:	System.exit(0);
				default: System.out.println("Numero equivocado");
			}
		}
	}
	

	
	
	
	
	
}
