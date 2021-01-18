package edu.ucam.rmi.academia.modelo;
import org.junit.Test; 

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;




public class PruebasTest {
	
	@BeforeClass
	public static void testBeforeClass() {
		// Se crea un objeto Curso
		Curso curso=new Curso("12A","Programación Orientada a Objetos");
		System.out.println("Se ha creado el siguiente objeto:");
		System.out.println("Id: "+curso.getId());
		System.out.println("Descripción: "+curso.getDescripcion());
	}
	
	@AfterClass
	public static void testAfterClass () {
	// Mensaje de terminación
	System.out.println ("Se han terminado de ejecutar todos los test.");
	}
	
	
	@Before
	public void testBefore() {
		//Se imprime un mensaje por pantalla
		System.out.println("------------------------------------------");
		System.out.println("Comienza la ejecución del siguiente test.");
	}
	
	
	@After
	public void testAfter() {
		//Se imprime un mensaje por pantalla
		System.out.println("Termina la ejecución del test.");
	}
	
	
	
	
	@Ignore
	@Test
	public void testAssertEquals() { 
		// Objeto con el que se va a comparar
		Curso curso1=new Curso("12A","Programación Orientada a Objetos");
		// Objeto Curso test
		Curso curso2=new Curso("23B","Bases de Datos");
		// Llamada al assert
		assertEquals(curso1,curso2);
	}
	
	
	
	
	
	@Test
	public void testAssertTrue() { 
		// Objeto utilizado para comparar
		Curso curso1=new Curso("12A","Programación Orientada a Objetos");
		// Identificador test
		String id="52C";
		// Llamada al assert
		assertTrue(id!=curso1.getId());
	}
	
	
	@Test
	public void testAssertNotNull() { 
		// Objeto nulo
		Curso curso3=null;
		// Assert
		assertNotNull(curso3);
	}
	
	@Test
	public void assertArrayEquals() { 
		// Objeto curso
		Curso curso=new Curso("23B","Bases de Datos");
		// Objeto curso test
		Curso testCurso=new Curso("23D","Bases de Datos");
		// Se genera un array con cada uno de los objetos
		String[] testArrayNames=new String[] {testCurso.toString()};
		String[] arrayCurso= {curso.toString()};
		// Assert
		Assert.assertArrayEquals(testArrayNames,arrayCurso);
	}
	
	
	
	
	@Test
	public void assertFalse() { 
		// Objeto Curso
		Curso curso1=new Curso("12A","Programación Orientada a Objetos");
		// Identificador con el que se va a comparar
		String id="52C";
		// Assert
		Assert.assertFalse(id==curso1.getId());
	}
	
	
	
	
	@Test
	public void testAssertNull() { 
		// Objeto nulo
		Curso curso3=null;
		// Assert
		assertNull(curso3);
	}
	
	
	
	@Test
	public void testAssertSame() { 
		// Se crea un objeto Curso
		Curso curso1=new Curso("12A","Programación Orientada a Objetos");
		// Se iguala un nuevo objeto al creado
		Curso curso2=curso1;
		// Assert
		assertSame(curso2,curso1);
	}
	
	
	
	@Test
	public void testAssertNotSame() { 
		// Se crea un objeto Curso
		Curso curso1=new Curso("12A","Programación Orientada a Objetos");
		// Objeto test
		Curso curso2=new Curso("12C","Programación Orientada a Objetos");
		// Assert
		assertNotSame(curso2,curso1);
	}
	

}
