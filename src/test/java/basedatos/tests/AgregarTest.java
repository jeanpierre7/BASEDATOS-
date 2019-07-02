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

public class AgregarTest {
	
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
	public void cuandoAgregarEntoncesTrue() {
		Dato dato = new Dato ("Juanito","Arcoiris");
		boolean resultado = this.bd.agregar(dato);
		assertTrue(resultado);
	}
	
	@Test
	public void cuandoAgregarEntoncesFalse() {
		Dato dato = new Dato ("","Peres Jackson");
		boolean resultado = this.bd.agregar(dato);
		assertTrue(resultado);
	}
	
	@Test
	public void cuandoAgregarOrdenadoEntoncesFalse() {
		Dato dato = new Dato ("pato","reyes");
		boolean resultado = this.bd.agregar(dato);
		assertTrue(resultado);
	}
	

}
