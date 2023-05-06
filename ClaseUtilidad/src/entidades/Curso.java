/*
Para ello, crearemos una clase entidad llamada Curso, cuyos atributos serán: 
nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde), 
precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de dimensión 5 
(cinco), donde se alojarán los nombres de cada alumno. A continuación, se implementarán 
los siguientes métodos:
Un constructor por defecto.
Un constructor con todos los atributos como parámetro.
Métodos getters y setters de cada atributo.

 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author GCopes
 */
public class Curso {
    Scanner sc = new Scanner(System.in);
    
    private String nombreCurso, turno;
    private float cantidadHorasDia, precioPorHora;
    private int cantidadDiasPorSemana;
    private String[] alumnos = new String[5];

    public Curso() {
    }

    public Curso(String nombreCurso, String turno, float cantidadHorasDia, int cantidadDiasPorSemana, float precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.turno = turno;
        this.cantidadHorasDia = cantidadHorasDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.precioPorHora = precioPorHora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        if (!turno.equalsIgnoreCase("tarde") && !turno.equalsIgnoreCase("maniana")) {
            do {
                System.out.println("Turno incorrecto!. Ingrese un turno válido: ");
                turno = sc.next();
            } while (!turno.equalsIgnoreCase("tarde") && !turno.equalsIgnoreCase("maniana"));
            
            
        }
        this.turno = turno;
    }

    public float getCantidadHorasDia() {
        return cantidadHorasDia;
    }

    public void setCantidadHorasDia(float cantidadHorasDia) {
        do {
            if (cantidadHorasDia >10 || cantidadHorasDia <=0) {
                System.out.println("El curso no puede tener más de 12 hs ni menos de 0 ");
                cantidadHorasDia = sc.nextFloat();
            }
            
        } while (cantidadHorasDia >10 || cantidadHorasDia <=0);
        
        this.cantidadHorasDia = cantidadHorasDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCandiadDiasPorSemana(int cantidadDiasPorSemana) {
         do {
            if (cantidadDiasPorSemana >7 || cantidadDiasPorSemana <=0) {
                System.out.println("El curso no puede tener más de 7 dias a la semana ni menos de 0 ");
                cantidadDiasPorSemana = sc.nextInt();
            }
            
        } while (cantidadDiasPorSemana >7 || cantidadDiasPorSemana <=0);
        
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public float getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(float precioPorHora) {
        do {
            if (precioPorHora <0) {
                System.out.println("Debe pagarse algo por el curso ");
            }
            
        } while ( precioPorHora <0);
        
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
    
}
