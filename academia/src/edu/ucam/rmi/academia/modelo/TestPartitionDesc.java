package edu.ucam.rmi.academia.modelo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestPartitionDesc {
	@Test
	//Se prueba el constructor
	public void testConstructor() { 
		// Se crea un objeto Curso
		Curso curso=new Curso("12A","Programaci�n Orientada a Objetos");
		// Se comprueba que el objeto se ha creado correctamente
		assertEquals("Programaci�n Orientada a Objetos",curso.getDescripcion());
	}
	@Test
	//Se prueba el m�todo getDescripcion()
	public void testGet() { 
		// Se crea un objeto Curso
		Curso curso=new Curso("12A","Programaci�n Orientada a Objetos");
		// Se comprueba que el objeto se ha creado correctamente
		assertTrue("Programaci�n Orientada a Objetos"==curso.getDescripcion());
	}
	@Test
	//Se prueba el m�todo setId()
	public void testSet() { 
		// Se crea un objeto Curso
		Curso curso=new Curso("12A","Programaci�n Orientada a Objetos");
		//Se modifica el atributo descripcion
		curso.setDescripcion("Bases de Datos");
		assertTrue("Bases de Datos"==curso.getDescripcion());
	}
}
