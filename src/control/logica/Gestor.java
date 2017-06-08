package control.logica;

import java.util.Set;
import control.adaptador.AdaptadorDAO;
import modelo.Articulo;
import modelo.Pedido;
import modelo.Cliente;
import utiles.Tipo;

public class Gestor implements iGestorAlta, iGestorConsulta {
	Tipo tipo;

	private boolean borra(Object obj, Tipo tipo) {
		if (tipo.isLista()) {
			return borraLista(obj, tipo);
		} else {
			return borraObjeto(obj, tipo);
		}
	}

	private boolean borraObjeto(Object obj, Tipo tipo) {
		AdaptadorDAO gestor = new AdaptadorDAO(tipo);
		return gestor.borrar(obj);
	}

	private boolean borraLista(Object obj, Tipo tipo) {
		// Necesito hacer dos operaciones por eso creo un objeto
		AdaptadorDAO gestor = new AdaptadorDAO(tipo);
		// Obtengo la lista del gestor
		Set lista = (Set) gestor.getNext();
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
		return new AdaptadorDAO(tipo).escribir(obj);
	}

	/**
	 * Solicita el retorno de un objeto que concuerde con el objeto introducido
	 * 
	 * @param obj
	 *            El Pedido a buscar
	 * @return El objeto encontrado, en caso de que coincidan, null en caso de
	 *         que no.
	 */
	public Pedido obtener(Pedido obj) {
		return (Pedido) get(obj, tipo);
	}

	/**
	 * Solicita el retorno de un objeto que concuerde con el objeto introducido
	 * 
	 * @param obj
	 *            El Cliente a buscar
	 * @return El objeto encontrado, en caso de que coincidan, null en caso de
	 *         que no.
	 */
	public Cliente obtener(Cliente obj) {
		return (Cliente) get(obj, tipo);
	}

	/**
	 * Solicita el retorno de un objeto que concuerde con el objeto introducido
	 * 
	 * @param obj
	 *            El Articulo a buscar
	 * @return El objeto encontrado, en caso de que coincidan, null en caso de
	 *         que no.
	 */
	public Articulo obtener(Articulo obj) {
		return (Articulo) get(obj, tipo);
	}

	private Object get(Object obj, Tipo tipo) {
		AdaptadorDAO gestor = new AdaptadorDAO(tipo);
		if (gestor.exist(obj)) {
			return gestor.obtener(obj);
		} else {
			return null;
		}
	}

	/**
	 * Busca la posicion de un objeto en un archivo de persistencia
	 * 
	 * @param obj
	 *            El objeto a buscar
	 * @return la posicion que ocupa dentro del objeto de persistencia, o -1 si
	 *         no se encuentra
	 * @deprecated usa {@link #obtener(Cliente obj)} en su lugar.
	 */
	@Deprecated
	public int buscar(Cliente obj) {
		return busca(obj, Tipo.cliente);
	}

	/**
	 * Busca la posicion de un objeto en un archivo de persistencia
	 * 
	 * @param obj
	 *            El objeto a buscar
	 * @return la posicion que ocupa dentro del objeto de persistencia, o -1 si
	 *         no se encuentra
	 * @deprecated usa {@link #obtener(Articulo obj)} en su lugar.
	 */
	@Deprecated
	public int buscar(Articulo obj) {
		return busca(obj, Tipo.articulo);
	}

	/**
	 * Busca la posicion de un objeto en un archivo de persistencia
	 * 
	 * @param obj
	 *            El objeto a buscar
	 * @return la posicion que ocupa dentro del objeto de persistencia, o -1 si
	 *         no se encuentra
	 * @deprecated usa {@link #obtener(Pedido obj)} en su lugar.
	 */
	@Deprecated
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
		AdaptadorDAO buscador = new AdaptadorDAO(tipo);
		return buscador.buscar(obj);
	}

	private int buscaLista(Object obj, Tipo tipo) {
		Set col = (Set) new AdaptadorDAO(tipo).getNext();
		if (col.contains(obj)) {
			return 0;
		} else {
			return -1;
		}
	}
	
	public boolean exist(Object obj) {
		AdaptadorDAO adaptador = new AdaptadorDAO(tipo);
		return adaptador.exist(obj);
	}

}
