/*
Crea una clase Alumnos, donde tendrá como Atributos el nombre, apellido, 
la nacionalidad y su fecha de nacimiento. La nacionalidad podrá ser
ARGENTINA – CHILENA – VENEZOLANA solamente.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author gcopes
 */
public class Alumnos {
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private Date nacimiento;

    public Alumnos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + ", nacimiento=" + nacimiento + '}';
    }

    public Alumnos(String nombre, String apellido, String nacionalidad, Date nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.nacimiento = nacimiento;
    }
    
    
}


