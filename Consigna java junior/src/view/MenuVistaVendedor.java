package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.MenuControllerMain;

import controller.MenuControllerVendedor;
import controller.MenuControllerVenta;
import model.negocio.Global;
import model.negocio.Producto;
import model.negocio.Vendedor;
import util.IOGeneral;

public class MenuVistaVendedor {

	public int imprimirMenuPrinc() 
	{
		return IOGeneral.leerInt("<<<MENU VENDEDOR>>>\nIngrese el numero: "
				+ "\n1-Agregar Vendedor"
				+ "\n2-Listar Vendedores"
				+ "\n0-Atras","Lo ingresado no fue un numero entero");
		
	}
	
	
	public Global menuVendedor(Global global) {
		MenuControllerMain menu = new MenuControllerMain();
		MenuControllerVendedor imppro = new MenuControllerVendedor();
		
		int res = -1;
		while(res!=0){
			res= this.imprimirMenuPrinc();
			switch(res){
				case 1: global.setVendedores(imppro.agregar(global.getVendedores()));
						break;
				case 2: imppro.Listar(global.getVendedores());
				break;
				case 0:	menu.menuMain(global);
				default: System.out.println("Numero equivocado");
			}
		}
		return global;
		
	}
	
	public Vendedor agregarVendedor() {
		Vendedor vendedor = new Vendedor();
		try {
			
			IOGeneral.pritln("Ingrese codigo del vendedor: ");
			Scanner scan = new Scanner(System.in);
			Scanner scan2 = new Scanner(System.in);
			vendedor.setCodigo(scan.nextInt());
			scan.reset();
			IOGeneral.pritln("Ingrese nombre del vendedor: ");
			vendedor.setNombre(scan2.nextLine());
			
			IOGeneral.pritln("Ingrese sueldo del vendedor: ");
			vendedor.setSueldo(scan.nextDouble());
			
			IOGeneral.pritln("Ingrese Nombre de usuario del vendedor: ");
			vendedor.setUsuario(scan2.nextLine());
			
			IOGeneral.pritln("Ingrese contraseña del vendedor: ");
			vendedor.setContraseña(scan2.nextLine());
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Ingreso invalido de datos");
		}
		return vendedor;
	}
	
	public void listar(ArrayList<Vendedor> vendedores) {
		for (Vendedor vendedor : vendedores) {
			IOGeneral.pritln("codigo del vendedor: "+vendedor.getCodigo()+""
					+ "\n Nombre del vendedor: "+vendedor.getNombre()+""
							+ "\n Sueldo del vendedor: "+vendedor.getSueldo()+""
									+ "\n Usuario del vendedor: "+vendedor.getUsuario());
			
		}
		
	}
}
