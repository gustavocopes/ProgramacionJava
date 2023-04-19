/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas,
y un constructor con todos los atributos pasados por parámetro y un constructor vacío.
Crear un método para cargar un libro pidiendo los datos al usuario y luego 
informar mediante otro método el número de ISBN, el título, el autor del libro y el número de páginas..
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author gcopes
 */
public class Libro { //creo mi clase llamda Libro y luego los atributos
    String ISBN;
    String titulo;
    String autor;
    int paginas;
    
   public Libro(){

} 
   /**
    * 
    * @param ISBN
    * @param titulo
    * @param autor
    * @param paginas 
    */
   public Libro(String ISBN, String titulo, String autor, int paginas){
       this.ISBN = ISBN;
       this.titulo = titulo;
       this.autor= autor;
       this.paginas = paginas;
   }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public void llenarLibro(){
        
       Scanner sc = new Scanner(System.in).useDelimiter("\n");
       System.out.println("Ingrese la cantidad de páginas del libro: ");
       setPaginas(sc.nextInt());
       System.out.println("Ingrese ISBN del libro: ");
       setISBN(sc.next());
       System.out.println("Ingrese título del libro: ");
       setTitulo(sc.next());
       System.out.println("Ingrese autor del libro: ");
       setAutor(sc.next());
       
   }
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + '}';
    }
   
   
}


