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

/**
 *
 * @author GCopes
 */
public class Curso {
    private String nombreCurso, turno;
    private float cantidadHorasDia, precioPorHora;
    private int candiadDiasPorSemana;
    private String[] alumnos = new String[5];

    public Curso() {
    }

    public Curso(String nombreCurso, String turno, float cantidadHorasDia, int candiadDiasPorSemana, float precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.turno = turno;
        this.cantidadHorasDia = cantidadHorasDia;
        this.candiadDiasPorSemana = candiadDiasPorSemana;
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
        this.turno = turno;
    }

    public float getCantidadHorasDia() {
        return cantidadHorasDia;
    }

    public void setCantidadHorasDia(float cantidadHorasDia) {
        this.cantidadHorasDia = cantidadHorasDia;
    }

    public int getCandiadDiasPorSemana() {
        return candiadDiasPorSemana;
    }

    public void setCandiadDiasPorSemana(int candiadDiasPorSemana) {
        this.candiadDiasPorSemana = candiadDiasPorSemana;
    }

    public float getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(float precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
    
}
