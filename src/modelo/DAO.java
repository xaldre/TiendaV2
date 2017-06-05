package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import utiles.Constantes;

public class DAO {
	ObjectInputStream adaptadorLectura = null;
	String path;
	boolean unico;

	public DAO(String path, boolean unico) {
		super();
		this.path = path;
		this.unico = unico;
	}

	/**
	 * graba un objeto serialziado con sobreescritura en el archivo definido en
	 * el path
	 * 
	 * @param obj
	 *            lo que graba
	 * @param path
	 *            donde lo graba
	 * @return true si consigue grabar satisfactoriamente false en caso
	 *         contrario
	 */
	public boolean grabar(Object obj) {
		File archivo = new File(path);
		FileOutputStream flujoW = null;
		ObjectOutputStream adaptadorW = null;
		// El archivo no existia cuando entro en el metodo
		// es cuando inicial=false;
		boolean inicial = false;
		try {
			if (!archivo.exists()) {
				archivo.createNewFile();
				inicial = true;
			}
			// este flujo es de sobreescritura
			// flujoW = new FileOutputStream(archivo);
			// este aÃ±ade
			flujoW = new FileOutputStream(archivo, !unico);
			if (unico || inicial)
				adaptadorW = new ObjectOutputStream(flujoW);
			else
				adaptadorW = new MyObjectOutputStream(flujoW);
			adaptadorW.writeObject(obj);
		} catch (IOException e) {
			if (Constantes.errores)
				e.printStackTrace();
			return false;
		}
		try {
			adaptadorW.close();
		} catch (IOException e) {
			if (Constantes.errores)
				e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * 
	 * @param path
	 * @param unico
	 *            true soy una lista y false muchos elementos
	 * @return
	 */
	public Object leer() {
		File archivo = new File(path);
		Object obj = null;
		try {
			// este es el if que controla si el flujo debe abrirse o no
			if (unico || adaptadorLectura == null) {
				FileInputStream flujoEntrada = new FileInputStream(archivo);
				adaptadorLectura = new ObjectInputStream(flujoEntrada);
			}
			obj = adaptadorLectura.readObject();
			// este controla si debe cerrarse o no
			if (unico)
				cerrar();
			else {
				// si tras una operacion de lectura el resultado ha sido null
				// implica ue el flujo ha llegado al final del fichero
				if (obj == null) {
					adaptadorLectura.close();
				}
			}

		} catch (FileNotFoundException e) {
			if (Constantes.errores)
				e.printStackTrace();
		} catch (IOException e) {
			if (Constantes.errores)
				e.printStackTrace();
		} catch (ClassNotFoundException e) {
			if (Constantes.errores)
				e.printStackTrace();
		}
		return obj;
	}

	public boolean borrar(int posicion) {
		File antiguo = new File(path);
		File nuevo = new File("respaldo.bak");
		Object obtenido = leer();
		int contador = 0;
		while (obtenido != null) {
			// Antes de escribir hay que comprobar que sea el elemento
			// concreto que indica el elemento encontrado
			if (posicion == contador) {
				// Con esta orden salto un objeto y no lo grabo
				obtenido = leer();
			}
			if (obtenido != null) {
				// mientras el objeto que tengo que escribir no sea nulo
				grabar(obtenido);
			}
			contador++;
			obtenido = leer();
			// Tendriamos que renombrar el archivo nuevo y borrar el antiguo
		}
		// Aqui eliminamos el fichero fisico, pero no el objeto file que se ha
		// creado con una ruta
		antiguo.delete();
		// Aquí renombramos el archivo de respaldo al antiguo objeto
		return nuevo.renameTo(antiguo);
	}

	public int buscar(Object obj) {
		int contador = -1;
		Object comparador = null;
		boolean encontrado = false;
		// Recorremos la estructura de persistencia hasta encontrar el elemento
		// a buscar o llegar al final de la estructura
		do {
			contador++;
			comparador = leer();
			encontrado = comparar(comparador, obj);
		} while (!encontrado && comparador != null);
		// cerrar el flujo
		cerrar();
		if (encontrado) {
			return contador;
		} else {
			return -1;
		}
	}

	/**
	 * Solicita el retorno de un objeto que concuerde con el objeto introducido
	 * 
	 * @param obj
	 *            El objeto a buscar
	 * @return El objeto encontrado, en caso de que coincidan, null en caso de
	 *         que no.
	 */
	public Object obtener(Object obj) {
		// Nos aseguramos que esté cerrado antes de comenzar
		cerrar();
		if (unico) {
			// Si es una lista
			ArrayList<?> lista = (ArrayList<?>) leer();
			int pos = lista.indexOf(obj);
			if (pos!= -1){
				lista.get(pos);
			} else {
				return null;
			}
			return lista.get(pos);
		} else {
			int pos = buscar(obj);
			if (pos != -1) {
				Object found = null;
				// Si es un objeto
				for (int i = 0; i <= pos; i++) {
					found = leer();
				}
				// cerrar el flujo al finalizar
				cerrar();
				return found;
			} else {
				return null;
			}
			
		}
	}

	private boolean comparar(Object comparador, Object obj) {
		return comparador.equals(obj);
	}

	private void cerrar() {
		try {
			if (adaptadorLectura != null) {
				adaptadorLectura.close();
				adaptadorLectura = null;
			}
		} catch (IOException e) {
		}
	}
}
