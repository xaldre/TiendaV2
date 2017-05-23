package control.adaptador;

import modelo.DAO;
import utiles.Tipo;

public class GestorUnificado {
	protected Tipo tipo;
	protected DAO dao;

	// obligo al que crea el objeto a decirme que tipo es
	public GestorUnificado(Tipo tipo) {
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

	public Object obtener() {
		dao = new DAO(tipo.getRuta(), tipo.isLista());
		return dao.leer();
	}
	
	public int buscar(Object obj){
		dao = new DAO(tipo.getRuta(), tipo.isLista());
		return dao.buscar(obj);
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
