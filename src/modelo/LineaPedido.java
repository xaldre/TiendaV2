package modelo;

public class LineaPedido {
	
	private int numero;
	private String referenciaArticulo;
	private float precio;
	private int cantidad;

	public LineaPedido(int numero, String referenciaArticulo, float precio, int cantidad) {
		super();
		this.numero = numero;
		this.referenciaArticulo = referenciaArticulo;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getReferenciaArticulo() {
		return referenciaArticulo;
	}

	public void setReferenciaArticulo(String referenciaArticulo) {
		this.referenciaArticulo = referenciaArticulo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}

