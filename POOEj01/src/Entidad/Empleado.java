/*
 Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario".
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado en función de su edad
y salario actual. El aumento salarial debe ser del 10% si el empleado tiene más de 30 años 
o del 5% si tiene menos de 30 años.
 */
package Entidad;

/**
 *
 * @author gcopes
 */
public class Empleado {
    private String nombre;
    private int edad;
    private float salario;
    
    public Empleado(){
        
    }
    public Empleado(String nombre, int edad, float salario){
        this.edad =  edad;
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void calcular_aumento(String nombre, int edad, float salario){
        if(edad>= 30){
            System.out.println("El aumento salarial de " + nombre + "es: " + (salario * 0.10));
        }
        else System.out.println("El aumento salarial de " +  nombre + "es: " + (salario * 0.05));
    }
}
