package control.logica;

import java.util.Set;

import control.adaptador.GestorUnificado;
import modelo.Articulo;
import modelo.Pedido;
import modelo.Cliente;
import utiles.Tipo;

public class Gestor {
	Tipo tipo;

	private boolean borra(Object obj, Tipo tipo) {
		if (tipo.isLista()) {
			return borraLista(obj, tipo);
		} else {
			return borraObjeto(obj, tipo);
		}
	}

	private boolean borraObjeto(Object obj, Tipo tipo) {
		GestorUnificado gestor = new GestorUnificado(tipo);
		return gestor.borrar(obj);
	}

	private boolean borraLista(Object obj, Tipo tipo) {
		// Necesito hacer dos operaciones por eso creo un objeto
		GestorUnificado gestor = new GestorUnificado(tipo);
		// Obtengo la lista del gestor
		Set lista = (Set) gestor.obtener();
		// Borro el elemento de la lista
		boolean borrado = lista.remove(obj);
		// Si lo borra bien debemos volver a grabar la nueva lista en el fichero
		if (borrado) {
			gestor.escribir(lista);
		}
		// Retornamos el resultado de la operacion
		return borrado;
	}

	public boolean insertar(Cliente obj) {
		return escribe(obj, Tipo.cliente);
	}

	public boolean insertar(Articulo obj) {
		return escribe(obj, Tipo.articulo);
	}

	public boolean insertar(Pedido obj) {
		return escribe(obj, Tipo.pedido);
	}

	private boolean escribe(Object obj, Tipo tipo) {
		return new GestorUnificado(tipo).escribir(obj);
	}

	public int buscar(Cliente obj) {
		return busca(obj, Tipo.cliente);
	}

	public int buscar(Articulo obj) {
		return busca(obj, Tipo.articulo);
	}

	public int buscar(Pedido obj) {
		return busca(obj, Tipo.pedido);
	}

	private int busca(Object obj, Tipo tipo) {
		if (tipo.isLista()) {
			return buscaLista(obj, tipo);
		} else {
			return buscaObjeto(obj);
		}
	}

	/**
	 * Busca un objeto en un fichero
	 * 
	 * @param obj
	 *            el objeto a buscar
	 * @return el valor de la pasocion en la que se encuentra o -1 si no existe
	 */
	private int buscaObjeto(Object obj) {
		GestorUnificado buscador = new GestorUnificado(tipo);
		return buscador.buscar(obj);
	}

	private int buscaLista(Object obj, Tipo tipo) {
		Set col = (Set) new GestorUnificado(tipo).obtener();
		if (col.contains(obj)) {
			return 0;
		} else {
			return -1;
		}
	}

}
