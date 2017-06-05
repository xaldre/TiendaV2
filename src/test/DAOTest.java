package test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import jdk.nashorn.internal.ir.annotations.Ignore;
import modelo.DAO;
import modelo.Cliente;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DAOTest {
	// TODO Rehacer todo el test y adaptarlo a el nuevo DAO
	private static final boolean LISTA_SI = true;
	private static final String PRUEBA_LISTA_TST = "pruebalista.tst";
	private static final String PRUEBA_OBJ_TST = "pruebaObj.tst";
	private static final boolean LISTA_NO = false;

	DAO instanciaObjeto = new DAO(PRUEBA_OBJ_TST, LISTA_NO);
	DAO instanciaLista = new DAO(PRUEBA_LISTA_TST, LISTA_SI);
	ArrayList<Cliente> lista = new ArrayList<Cliente>();

	@Before
	public void setUp() throws Exception {
		lista.add(new Cliente("1", "A"));
		lista.add(new Cliente("2", "B"));
		lista.add(new Cliente("3", "C"));
		lista.add(new Cliente("4", "D"));
		lista.add(new Cliente("5", "E"));
	}

	@Test
	public void test01Grabar() {
		// Borramos para asegurarnos que sólo se graba lo que queremos
		new File(PRUEBA_LISTA_TST).delete();
		assertTrue(instanciaLista.grabar(lista));
	}

	@Ignore
	public void test02Leer() {
		ArrayList<?> listaActual = (ArrayList<?>) instanciaLista.leer();
		// delegar la responsabilidad de la compararcion en el propio objeto que
		// compara
		boolean iguales = true;
		for (int i = 0; i < listaActual.size() && iguales; i++) {
			iguales = lista.get(i).equals(listaActual.get(i));
		}
		// como no hay un assert para lista delego la comparacion en los
		// elementos de la
		// lista. concretamente en su metodo equals
		assertTrue(iguales);
	}

	@Test
	public void test03GrabarO() {
		// es mejor borrar el archivo para cada prueba
		new File(PRUEBA_OBJ_TST).delete();
		assertTrue(instanciaObjeto.grabar(new Cliente("1", "F")));
		assertTrue(instanciaObjeto.grabar(new Cliente("2", "G")));
	}

	@Test
	public void test04LeerO() {
		// primer objeto
		assertTrue(instanciaObjeto.leer().equals(new Cliente("1", "")));
		// segundo Objeto
		assertTrue(instanciaObjeto.leer().equals(new Cliente("2", "")));
	}
	
	@Test
	public void test05ObtenerO() {
		assertEquals(new Cliente("2","G"), instanciaObjeto.obtener(new Cliente("2","")));
	}
	
	@Test
	public void test06ObtenerL() {
		assertEquals(new Cliente("2","B"), instanciaLista.obtener(new Cliente("2","")));
	}

}
