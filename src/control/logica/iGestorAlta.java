package control.logica;

import modelo.Articulo;
import modelo.Cliente;
import modelo.Pedido;

public interface iGestorAlta {

	public boolean insertar(Cliente obj);

	public boolean insertar(Articulo obj);

	public boolean insertar(Pedido obj);
}
