package model.negocio;

public class Vendedor 
{
	private Integer codigo;
	private	String nombre;
	private	Double sueldo;
	private String usuario;
	private String contraseña;
	
	
	
	public Vendedor(Integer codigo, String nombre, Double sueldo, String usuario, String contraseña) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.usuario = usuario;
		this.contraseña = contraseña;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public Vendedor() {
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getSueldo() {
		return sueldo;
	}
	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}
	
	
}
