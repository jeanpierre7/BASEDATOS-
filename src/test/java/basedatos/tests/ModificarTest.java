package basedatos.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import basedatos.modelo.BaseDeDatos;
import basedatos.modelo.Dato;

public class ModificarTest {
	
	private BaseDeDatos bd;
	@Before
	public void setUp() throws Exception {
		Dato d1 = new Dato("pato", "reyes");
		Dato d2 = new Dato("jean", "leyton");
		Dato d3 = new Dato("claudio", "reyes");
		Dato d4 = new Dato("John", "newman");

	    this.bd = new BaseDeDatos();
	    bd.agregar(d1);
	    bd.agregar(d2);
	    bd.agregar(d3);
	    bd.agregar(d4);
		
	}

	@Test
	public void cuandoModificarEntoncesTrue() {
		Dato dato = new Dato("jean", "leyton Reyes");
		boolean resultado = this.bd.modificar(dato);
		System.out.println("Modificado " + resultado);
		System.out.println(bd.listar());
		assertTrue(resultado);
	}
	
	@Test
	public void cuandoModificarEntoncesFalse() {
		Dato dato = new Dato("juan", "leyton Reyes");
		boolean resultado = this.bd.modificar(dato);
		System.out.println("Modificado " + resultado);
		System.out.println(bd.listar());
		assertTrue(resultado);
	}
	

}
