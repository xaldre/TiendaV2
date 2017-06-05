package control.adaptador;

import modelo.DAO;
import utiles.Tipo;

public class AdaptadorDAO {
	protected Tipo tipo;
	protected DAO dao;

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

	public Object getNext() {
		dao = new DAO(tipo.getRuta(), tipo.isLista());
		return dao.leer();
	}
	
	public int buscar(Object obj){
		dao = new DAO(tipo.getRuta(), tipo.isLista());
		return dao.buscar(obj);
	}
	
	public boolean exist(Object obj){
		dao = new DAO(tipo.getRuta(),tipo.isLista());
		return dao.exist(obj);		
	}
	
	public Object obtener(Object obj){
		dao = new DAO(tipo.getRuta(),tipo.isLista());
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
