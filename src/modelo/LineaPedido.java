package modelo;

public class LineaPedido {
	
	private int numero;
	private String referencia;
	private int cantidad;

	public LineaPedido(int numero, String referencia, int cantidad) {
		super();
		this.numero = numero;
		this.referencia = referencia;
		this.cantidad = cantidad;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getReferenciaArticulo() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}

