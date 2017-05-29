package modelo;

public class Pedido {

	private String numero;
	private String fecha;
	private String dni;
	private LineaPedido lineas[];
	
	public Pedido(String numero, String fecha, String dni, LineaPedido[] lineas) {
		super();
		this.numero = numero;
		this.fecha = fecha;
		this.dni = dni;
		this.lineas = lineas;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public LineaPedido[] getLineas() {
		return lineas;
	}
	public void setLineas(LineaPedido[] lineas) {
		this.lineas = lineas;
	}
}
