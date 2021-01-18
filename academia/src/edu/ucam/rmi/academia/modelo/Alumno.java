package edu.ucam.rmi.academia.modelo;

import java.io.Serializable;



/**
 *
 * @author Salvador
 */
public class Alumno implements Serializable
{
    private static final long serialVersionUID = 4L;
    private String codigo;
    private String nombre;
    private String apellido;

    

    public Alumno(String codigo, String nombre, String apellido) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	/**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

	@Override
	public String toString() {
		return "Alumno [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
    
      
}

