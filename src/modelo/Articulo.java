package modelo;

public class Articulo {

	private String referencia;
	private String descripcion;
	private String nombre;
	private float precio;
	
	public Articulo(String referencia, String descripcion, String nombre, float precio) {
		super();
		this.referencia = referencia;
		this.descripcion = descripcion;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String getReferencia() {
		return referencia;
	}
	
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
}
