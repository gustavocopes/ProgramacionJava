/*

 */
package servicios;

import entidades.Curso;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author GCopes
 */
public class CursoService {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    /**Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
     * que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
     * en un arreglo e iterar con un bucle, solicitando en cada repetición que se 
     * ingrese el nombre de cada alumno.*/
    
    public void cargarAlumnos(Curso aula){
        int cont = 0;
        //String opcion = sc.next();
        //System.out.println("Cuántos estudiantes desea ingresar: ");
        //cont = sc.nextInt();
        for (int q = 0; q < cont; q++) {
            //do{
            System.out.println("Ingrese nombre del estudiante: ");
            Arrays.fill(aula.getAlumnos(),q, q +1,sc.next());
            cont++;
//            
//            System.out.println("Desea cargar otro estudiante? s/n");
//            
//            }while(opcion.equalsIgnoreCase("n"));
            
        }
           // return cont;
    }
    
 /**Método crearCurso(): el método crear curso, le pide los valores de los atributos al
  * usuario y después se le asignan a sus respectivos atributos para llenar el objeto
  * Curso. En este método invocamos al método cargarAlumnos() para asignarle 
  * valor al atributo alumnos*/
    
    public void crearCurso(Curso aula){
        System.out.println("Ingrese en nombre del Curso: ");
        aula.setNombreCurso(sc.nextLine());
        System.out.println("Ingrese el turno (mañana/tarde): ");
        aula.setTurno(sc.next());
        System.out.println("Ingrese la cantidad de horas al día del curso: ");
        aula.setCantidadHorasDia(sc.nextFloat());
        System.out.println("Ingrese la cantidad de días a la semana del curso: ");
        aula.setCandiadDiasPorSemana(sc.nextInt());
        System.out.println("Ingrese el precio por hora del curso: ");
        aula.setPrecioPorHora(sc.nextFloat());
        cargarAlumnos(aula);
        
    }
    
/**Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia 
 * en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por 
 * día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana 
 * que se repite el encuentro.*/    

public void calcularGananciaSemanal(Curso aula){
    
    float ganancia = aula.getCantidadHorasDia() * aula.getPrecioPorHora() * aula.getAlumnos().length * aula.getCantidadDiasPorSemana();
    System.out.println("La ganancia total por el curso " + aula.getNombreCurso() + " es : " + ganancia);
}

}
