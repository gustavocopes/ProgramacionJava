/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
 */
package entidades;

import java.util.Comparator;

/**
 *
 * @author gcopes
 */
public class Pelicula {
    private String titulo;
    private String director;
    private Double horas;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Double horas) {
        this.titulo = titulo;
        this.director = director;
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", horas=" + horas + '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getHoras() {
        return horas;
    }

    public void setHoras(Double horas) {
        this.horas = horas;
    }
    
    public static Comparator<Pelicula> compararDuracion = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            return p1.getHoras().compareTo(p2.getHoras());
        }      
             
        };
    
      public static Comparator<Pelicula> compararTitulo = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            return p1.getTitulo().compareTo(p2.getTitulo());
        }      
             
        };
      
        public static Comparator<Pelicula> compararDirector = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            return p1.getDirector().compareTo(p2.getDirector());
        }      
             
        };
}
