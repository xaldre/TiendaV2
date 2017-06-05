package control.adaptador;

import java.util.ArrayList;

import modelo.DAO;
import utiles.Tipo;

public class AdaptadorDAO {
	protected Tipo tipo;
	protected DAO dao;
	protected boolean started = false;

	// obligo al que crea el objeto a decirme que tipo es
	public AdaptadorDAO(Tipo tipo) {
		super();
		this.tipo = tipo;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public boolean escribir(Object obj) {
		dao = new DAO(tipo.getRuta(), tipo.isLista());
		return dao.grabar(obj);
	}
	
	public boolean add(Object obj){
		if (tipo.isLista()){
			ArrayList list = new ArrayList<>();
			list = (ArrayList) getNext();
			list.add(obj);
			return escribir(list);
		} else {
			return escribir(obj);
		}
	}

	public Object getNext() {
		if (tipo.isLista() || !started) {
			dao = new DAO(tipo.getRuta(), tipo.isLista());
		}
		return dao.leer();
	}

	/**
	 * Retorna una lista con todos los elementos que se encuentren en el archivo
	 * especificado por el tipo
	 * 
	 * @return ArrayList con elementos
	 */
	private Object getAll() {
		if (tipo.isLista()) {
			return getNext();
		} else {
			ArrayList list = new ArrayList<>();
			Object object = getNext();
			while (object != null) {
				list.add(object);
				object = getNext();
			}
			return list;
		}
	}

	public int buscar(Object obj) {
		dao = new DAO(tipo.getRuta(), tipo.isLista());
		return dao.buscar(obj);
	}

	public boolean exist(Object obj) {
		dao = new DAO(tipo.getRuta(), tipo.isLista());
		return dao.exist(obj);
	}

	public Object obtener(Object obj) {
		dao = new DAO(tipo.getRuta(), tipo.isLista());
		return dao.obtener(obj);
	}

	public boolean borrar(Object obj) {
		DAO dao = new DAO(tipo.getRuta(), tipo.isLista());
		int posicion = dao.buscar(obj);
		if (posicion != -1) {
			return dao.borrar(posicion);
		} else {
			return false;
		}

	}

}
