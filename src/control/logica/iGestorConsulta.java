package control.logica;

import modelo.Articulo;
import modelo.Cliente;
import modelo.Pedido;

public interface iGestorConsulta {

	public Cliente obtener(Cliente obj);

	public Articulo obtener(Articulo obj);

	public Pedido obtener(Pedido obj);
}
