/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por sus 10 alumnos
para luego obtener una cantidad de aprobados y desaprobados. 
Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales.
Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados,
teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.

 */

/**
 *
 * @author gcopes
 */
import java.util.Scanner;
public class Ej4_Extra_ProfesNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float[] notas = new float[5];
        int suma = 0;
        for (int i = 0; i < 9; i++) {
            System.out.println("Alumno " + (i+1));
          int resultado = rellenar(notas);
          suma = suma + resultado;
        }
        System.out.println("La cantidad de aprobados es: " + suma + " y la cantidad de desaprobados es: " + (10-suma));
        
    }
    public static int rellenar(float[] notas){
            Scanner sc = new Scanner(System.in);
            do{
        System.out.println("Ingrese la nota del Primer trabajo práctico: ");
            
        notas[0] = (float) (sc.nextFloat()*1.10); 
            }while(notas[0]>10);
            do{
        System.out.println("Ingrese la nota del Segundo trabajo práctico: ");
            notas[1] = (float) (sc.nextFloat()*1.15);
            }while(notas[1]>10);
            do{
            System.out.println("Ingrese la nota del Primer Ingegrador: ");
            notas[2] = (float) (sc.nextFloat()*1.25);
            }while(notas[2]>10);
            do{
            System.out.println("Ingrese la nota del Segundo Ingegrador: ");
            notas[3] = (float) (sc.nextFloat()*1.5);
            }while(notas[3]>10);
        
        float suma = 0;
        for (int i = 0; i < 4; i++) {
            suma = suma + notas[i];
        }
        float promedio = suma / 4;
        notas[4] = promedio;
         int c=0;
        if(promedio >=7){
           
            c++;
        }
        return c;
        
        
    }
}
