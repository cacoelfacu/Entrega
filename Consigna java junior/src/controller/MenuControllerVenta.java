package controller;

import java.util.ArrayList;
import java.util.Iterator;

import model.negocio.Global;
import model.negocio.Producto;
import model.negocio.Vendedor;
import model.negocio.Venta;
import util.IOGeneral;
import view.MenuVistaVenta;

public class MenuControllerVenta {

	
	public MenuControllerMain menu= new MenuControllerMain();
	
	public Global vender(Global global) 
	{
		try {
			
		int c=0;
		int i=1;
			do {
				MenuVistaVenta mivista = new MenuVistaVenta();
				mivista.imprimirProductos(global.getProductos());
				global=vende(global,c);
				 i=IOGeneral.leerInt("Quiere seguir comprando? "
						+ "\n 1-Si"
						+ "\n 2-No ","Numero equivocado");
				 c++;
			} while (i==1);
			
			for (Venta venta : global.getVentas()) {
				if (global.getVentas().indexOf(venta)>=global.getVentas().size()-1) {
					System.out.println("Comision del vendedor: "+venta.getComision());
					System.out.println("Vendedor: "+venta.getVend().getNombre()+" Nombre de usuario: "+venta.getVend().getUsuario());
					System.out.println("Productos comprados: ");
					for (Producto producto : venta.getProd()) {
						IOGeneral.pritln("codigo de producto:"+producto.getCodigo()+""
								+ "\n Nombre del producto: "+producto.getNombre()+""
										+ "\n Precio del producto: "+producto.getPrecio()+""
												+ "\n Categoria: "+producto.getCategoria());
					}
					System.out.println("Costo total: "+venta.getCosteTotal());
				}
				
			}
			menu.menuMain(global);
		} catch (Exception e) {
			e.getMessage();
		}
		
		return global;
	}
	
	public Global vende(Global global, int c)
	{
		try {
			
		
		ArrayList<Producto> productos= global.getProductos();
		ArrayList<Producto> productos2= new ArrayList<Producto>();
		ArrayList<Venta> ventas = new ArrayList<Venta>();
		Venta venta = new Venta();
		if(c==0) {
			//Para cuando compre 1 solo item
		String codigo=IOGeneral.leerLinea("Ingrese el codigo del item a vender: ");
		Producto p= new Producto();
		p.setCodigo(codigo);
		
		int i=0;
		for (Producto producto : productos) {
			if (producto.getCodigo().equals(p.getCodigo())) {
				productos2.add(producto);
				i++;
				System.out.println("Se encontro el producto");
			}
			
		}
		if (i==0) {
			System.out.println("no se encontro el producto");
		}
		venta.setProd(productos2);
		double costetotal=0;
		for (Producto producto : productos2) {
			costetotal=costetotal+producto.getPrecio();
		}
		double comision=0;
		int cantidadProductos=productos2.size();
		if (cantidadProductos<=2) {
			comision=(costetotal*5)/100;
		}
		if(cantidadProductos>2)
		{
			comision=(costetotal*10)/100;
		}
		venta.setComision(comision);
		venta.setVend(global.getVendedorActual());
		venta.setCosteTotal(costetotal);
		ventas.add(venta);
		global.setVentas(ventas);
		}
		if(c>=1)
			//Para cuando compro mas de 1 item
		{
			for (Venta venta2 : global.getVentas()) {
				if (global.getVentas().indexOf(venta2)>=global.getVentas().size()-1) {
						productos2=venta2.getProd();
						String codigo=IOGeneral.leerLinea("Ingrese el codigo del item a vender: "
								+ "\n-------------------");
						Producto p= new Producto();
						p.setCodigo(codigo);
						
						int i=0;
						for (Producto producto : productos) {
							if (producto.getCodigo().equals(p.getCodigo())) {
								productos2.add(producto);
								i++;
								System.out.println("Se encontro el producto"
								+"\n-------------------");
							}
							
						}
						if (i==0) {
							System.out.println("no se encontro el producto"
									+ "\n-------------------");
						}
						venta2.setProd(productos2);
						double costetotal=0;
						for (Producto producto : productos2) {
							costetotal=costetotal+producto.getPrecio();
						}
						double comision=0;
						int cantidadProductos=productos2.size();
						if (cantidadProductos<=2) {
							comision=(costetotal*5)/100;
						}
						if(cantidadProductos>2)
						{
							comision=(costetotal*10)/100;
						}
						venta2.setComision(comision);
						venta2.setVend(global.getVendedorActual());
						venta2.setCosteTotal(costetotal);
						ventas.add(venta2);
						global.setVentas(ventas);
				}
			}
		}
		} catch (Exception e) {
			e.getMessage();
		}
		return global;
	}

}
