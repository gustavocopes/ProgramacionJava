package Cine;

public class Pelicula {

    private String titulo;

    private String director;

    private int edadMinima;

    private int duracion;

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", edadMinima=" + edadMinima + ", duracion=" + duracion + '}';
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

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Pelicula(String titulo, String director, int edadMinima, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.edadMinima = edadMinima;
        this.duracion = duracion;
    }

    public Pelicula() {
    }
}
