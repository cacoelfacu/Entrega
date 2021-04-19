package model.negocio;

import java.util.ArrayList;

public class Venta 
{
	private Integer id;
	private ArrayList<Producto> prod;
	private Vendedor vend;
	private Double costeTotal;
	private Double comision;
	
	
	
	public Venta(Integer id, ArrayList<Producto> prod, Vendedor vend, Double costeTotal, Double comision) {
		super();
		this.id = id;
		this.prod = prod;
		this.vend = vend;
		this.costeTotal = costeTotal;
		this.comision = comision;
	}
	public Double getCosteTotal() {
		return costeTotal;
	}
	public void setCosteTotal(Double costeTotal) {
		this.costeTotal = costeTotal;
	}
	public Double getComision() {
		return comision;
	}
	public void setComision(Double comision) {
		this.comision = comision;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public ArrayList<Producto> getProd() {
		return prod;
	}
	public void setProd(ArrayList<Producto> prod) {
		this.prod = prod;
	}
	public Vendedor getVend() {
		return vend;
	}
	public void setVend(Vendedor vend) {
		this.vend = vend;
	}
	
	public Venta() {
		
	}
	
	
	
	
	
	
	

	
	
}

