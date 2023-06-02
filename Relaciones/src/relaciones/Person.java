/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones;

/**
 *
 * @author gcopes
 */
public class Person {
    private String nombre;
    private String apellido;
    private int edad;
    private int documento;
    private Perro can;

    public Person() {
    }

    public Person(String nombre, String apellido, int edad, int documento, Perro can) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.can = can;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Perro getCan() {
        return can;
    }

    public void setCan(Perro can) {
        this.can = can;
    }

    @Override
    public String toString() {
        return "Person{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", can=" + can + '}';
    }
    
}
