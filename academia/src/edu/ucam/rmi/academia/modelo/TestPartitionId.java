package edu.ucam.rmi.academia.modelo;
import static org.junit.Assert.*;
import org.junit.Test;
public class TestPartitionId {

	@Test
	//Se prueba el constructor
	public void testConstructor() { 
		// Se crea un objeto Curso
		Curso curso=new Curso("12A","Programación Orientada a Objetos");
		// Se comprueba que el objeto se ha creado correctamente
		assertEquals("12A",curso.getId());
	}
	@Test
	//Se prueba el método getId()
	public void testGet() { 
		// Se crea un objeto Curso
		Curso curso=new Curso("12A","Programación Orientada a Objetos");
		// Se comprueba que el id coincide
		assertTrue("12A"==curso.getId());
	}
	@Test
	//Se prueba el método setId()
	public void testSet() { 
		// Se crea un objeto Curso
		Curso curso=new Curso("12A","Programación Orientada a Objetos");
		//Se modifica el atributo Id
		curso.setId("34R");
		assertTrue("34R"==curso.getId());
	}
	@Test
	public void testToString() { 
		// Objeto curso
		Curso curso=new Curso("23B","Bases de Datos");
		// String curso test
		String test="Curso{id=23B, descripcion=Bases de Datos}";
		String stringCurso= curso.toString();
		// Assert
		assertEquals(test,stringCurso);
	}
}
