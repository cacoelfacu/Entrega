package view;

import java.util.ArrayList;

import model.negocio.Producto;
import util.IOGeneral;

public class MenuVistaVenta {

	public void imprimirProductos(ArrayList<Producto> productos) {
		
		for (Producto producto : productos) {
			IOGeneral.pritln("codigo de producto:"+producto.getCodigo()+""
					+ "\n Nombre del producto: "+producto.getNombre()+""
							+ "\n Precio del producto: "+producto.getPrecio()+""
									+ "\n Categoria: "+producto.getCategoria());
			
		}
		
		
		
	}

	
	
	
	
}
