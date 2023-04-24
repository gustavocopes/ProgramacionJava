/*
Crea una clase "Estudiante" con las propiedades "nombre", "edad" y "nota media".
Crea un método para calcular la nota media de un grupo de estudiantes y otro para 
mostrar por pantalla los estudiantes que tienen una nota media superior.
 */
package Entidad;

import java.util.Scanner;

public class Estudiante {

    private String nombre;
    private int edad;
    private float notaMedia;
    private float notaMedia1;

    public Estudiante() {

    }

    public Estudiante(String nombre, int edad, float notaMedia, float notaMedia1) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
        this.notaMedia1 = notaMedia1;

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

    public float getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }

    public float getNotaMedia1() {
        return notaMedia1;
    }

    public void setNotaMedia1(float notaMedia1) {
        this.notaMedia1 = notaMedia1;

    }

    public boolean CargarDatos() {
        boolean salir = true;
        String opcion = "si";
        int suma = 0;
        do {
            Scanner read = new Scanner(System.in).useDelimiter("\n");
            int cantidadEstu;
            System.out.println("ingrese a continuacion la cantidad de estudiantes");
            cantidadEstu = read.nextInt();
            System.out.println("ingrese el nombre");
            setNombre(read.nextLine());
            System.out.println("ingrese la edad");
            setEdad(read.nextInt());
            System.out.println("ingrese la nota media del alumno");
            setNotaMedia(read.nextFloat());
            
            //for(int i = 1; i <= ; i++){
                
                System.out.println("Desesa cargar otro alumno?: ");
                opcion = read.next();
            }while(opcion.equals("si"));
        return salir;
        }
        
        
    
    }
