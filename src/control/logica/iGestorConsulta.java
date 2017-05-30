package control.logica;

import modelo.Articulo;
import modelo.Cliente;
import modelo.Pedido;

public interface iGestorConsulta {

	public int buscar(Cliente obj);

	public int buscar(Articulo obj);

	public int buscar(Pedido obj);
}
