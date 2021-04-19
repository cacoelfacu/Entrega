package view;

import java.util.Scanner;

import controller.MenuControllerProducto;
import util.IOGeneral;





public class MenuVistaPrincipal {

	public int imprimirMenuPrincipalPrograma()
	{
		return IOGeneral.leerInt("<<<MENU PRINCIPAL>>>\nIngrese el numero: \n1-Menu de productos\n2-Menu de Vendedores\n3-Menu Ventas\n0-salir","Lo ingresado no fue un numero entero");
	}

	
	
	


}
