/*
 En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package servicios;

import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gcopes
 */
public class PeliculaServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> listaPelicula = new ArrayList<Pelicula>();

    public void crearPelicula() {
        String opcion = null;

        do {
            Pelicula movie = new Pelicula();
            System.out.println("Ingrese el título de la película: ");
            movie.setTitulo(sc.next());
            System.out.println("Ingrese el director de la película: ");
            movie.setDirector(sc.next());
            System.out.println("Ingrese la duración de la película: ");
            movie.setHoras(sc.nextDouble());

            listaPelicula.add(movie);
            System.out.println("Desea ingresar otra película? s/n");
            opcion = sc.next();
        } while (opcion.equalsIgnoreCase("s"));

    }

    public void mostrarPelicula() {
        for (Pelicula aux : listaPelicula) {
            System.out.println(aux);
        }
    }

    public void mostrarPeliLarga() {
        for (Pelicula aux : listaPelicula) {
            if (aux.getHoras() >= 1) {
                System.out.println(aux.getTitulo() + " dura más de una hora.");

            }
        }
    }

    public void ordenarPeliDesc() {

        listaPelicula.sort(Pelicula.compararDuracion);
        System.out.println(listaPelicula);
    }

    public void ordenarPeliAsc() {
        listaPelicula.sort(Pelicula.compararDuracion.reversed());
        System.out.println(listaPelicula);
    }

    public void ordenarPeliTitulo() {
        listaPelicula.sort(Pelicula.compararTitulo);
        System.out.println(listaPelicula);
    }

    public void ordenarPeliDirector() {
        listaPelicula.sort(Pelicula.compararDirector);
        System.out.println(listaPelicula);
    }

}
/**
 * public class ServiciosPelicula { Scanner read=new Scanner(System.in).useDelimiter("\n"); ArrayList<Pelicula> lista=new ArrayList<>(); Pelicula peli=new Pelicula();
 *
 * public void crearLista (){ //Declaracion de variables boolean chek=true; String pelicula =""; String dire=""; double hora= 0; String respuesta=""; int c = 0;
 *
 * do{// carga n mascotas
 *
 * System.out.println("Ingrese el NOMBRE de la Pelicula: "); pelicula=read.next(); peli.setTitulo(pelicula);
 *
 * System.out.println("Ingrese el DIRECTORA/OR de la Pelicula: "); dire=read.next(); peli.setDireccion(dire);
 *
 * System.out.println("Ingrese la Duracion de la Pelicula(min): "); hora=read.nextDouble(); peli.setDuracion(hora);
 *
 * //Crear objetos y guardarlos en la Lista Pelicula pely = new Pelicula(peli.getTitulo(),peli.getDireccion(),peli.getDuracion()); lista.add(pely);//Carga un objeto estudiante la lista lista.set(c, pely);// Setea la lista en la posicion c c++;
 *
 * do{//Pide cargar o no un segundo objeto System.out.println("Desea cargar otra pelicula? Ingrese:(S o N)"); respuesta=read.next(); if(respuesta.equalsIgnoreCase("N")){ chek=false; } }while(!respuesta.equalsIgnoreCase("N") && !respuesta.equalsIgnoreCase("S"));
 *
 * }while(chek); System.out.println("Listas: "+Arrays.toString(lista.toArray())); }
 *
 * public void mayorA1Hora(){ System.out.println("------------------------------------------------"); Iterator<Pelicula> buscar = lista.iterator();//El metodo iterator busca objetos en la Lista de objetos
 *
 * System.out.println("Peliculas de menos de 1 hora:"); while(buscar.hasNext()){//hasNex da verdadero mientras queden elementos por recorrer
 *
 * Pelicula pely = buscar.next();
 *
 * if(pely.getDuracion()<=60){ System.out.println("Titulo: "+pely.getTitulo()); System.out.println("Direccion: "+pely.getDireccion()); System.out.println("Duracion: "+ pely.getDuracion()+" min"); System.out.println("-----------------------------------"); } } }
 *
 * public void mayor_a_menor(){
 *
 * lista.sort(Pelicula.compararDuracion); System.out.println("Listas: "+Arrays.toString(lista.toArray())); }
 *
 * public void menor_a_mayor(){ lista.sort(Pelicula.compararDuracion.reversed()); System.out.println("Listas x Duracion: "+Arrays.toString(lista.toArray())); }
 *
 * public void titulo(){ lista.sort(Pelicula.compararTitulo.reversed()); System.out.println("Listas x Titulo: "+Arrays.toString(lista.toArray())); }
 *
 * public void dirreccion(){ lista.sort(Pelicula.compararDireccion.reversed()); System.out.println("Listas x Direccion: "+Arrays.toString(lista.toArray())); } } MAIN public static void main(String[] args) { ServiciosPelicula p=new ServiciosPelicula();
 *
 * p.crearLista(); p.mayorA1Hora(); p.mayor_a_menor(); p.menor_a_mayor(); p.dirreccion(); p.titulo();
    }
 */
