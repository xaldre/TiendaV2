package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import control.adaptador.AdaptadorDAO;
import modelo.Cliente;
import utiles.Tipo;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AdaptadorDAOTest {

	AdaptadorDAO adaptadorCliente = new AdaptadorDAO(Tipo.cliente);
	ArrayList<Cliente> lista = new ArrayList<Cliente>();

	@Before
	public void setUp() {
		lista.add(new Cliente("53573141T", "Carlos Rodrigo SMV"));
		lista.add(new Cliente("20202020H", "Herna"));
		lista.add(new Cliente("99999999Z", "pablo"));
		lista.add(new Cliente("777", "ghost"));
		adaptadorCliente.escribir(lista);
	}

	@Test
	public void test10Escribir() {
		// TODO completar
		fail("Not yet implemented");
	}

	@Test
	public void test20GetNext() {
		// TODO completar
		fail("Not yet implemented");
	}

	@Test
	public void test20GetAll() {
		// TODO completar
		fail("Not yet implemented");
	}

	@Test
	public void test30Buscar() {
		// TODO completar
		fail("Not yet implemented");
	}

	@Test
	public void test40Exist() {
		// TODO completar
		fail("Not yet implemented");
	}

	@Test
	public void test50Obtener() {
		// TODO completar
		fail("Not yet implemented");
	}

	@Test
	public void test60Borrar() {
		// TODO completar
		fail("Not yet implemented");
	}

}
