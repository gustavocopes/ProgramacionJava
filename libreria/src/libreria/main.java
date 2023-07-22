/*
13) Agregar las siguientes validaciones a todas las funcionalidades de la aplicación:
• Validar campos obligatorios.
• No ingresar datos duplicados.*/
package libreria;

import java.util.Scanner;
import libreria.servicios.AutorServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;

/**
 *
 * @author gcopes 
 */
public class main {

    
    public static void main(String[] args) {
        
        menu();
        
    }
        public static void menu(){
            Scanner sc = new Scanner(System.in).useDelimiter("\n");
            AutorServicio as = new AutorServicio();
            LibroServicio ls = new LibroServicio();
            EditorialServicio es = new EditorialServicio();
            
        int opc;
            do{
                System.out.println("---------------------MENÚ----------------------");
                System.out.println("1) Persistir libro.");
                System.out.println("2) Buscar libro por autor");
                System.out.println("3)  Búsqueda de un libro por ISBN.");
                System.out.println("10) Búsqueda de un libro por Título.");
                System.out.println("11) Búsqueda de un libro/s por nombre de Autor.");
                System.out.println("12) Búsqueda de un libro/s por nombre de Editorial.");
                System.out.println("13) Fin.");
                System.out.println("----------------------------\n");
                System.out.println("Elija una opción: ");
                opc = sc.nextInt();
                
                switch(opc){
                    case 1:ls.persistirLibro(1,"Cthulu",1905,1,5,as.persistirAutor(1, "Lovecraft"), es.persistirEditorial(1, "Planete"));
                     ls.persistirLibro(2,"Principito",1930,3,10,as.persistirAutor(5,"Exupery"), es.persistirEditorial(3,"Sudamericana"));
                     ls.persistirLibro(3,"Persepolis",1988,0,2,as.persistirAutor(12, "Satrapi"), es.persistirEditorial(8, "Norma"));
                        break;
                    case 2: as.buscarAutor("Pepe");
                        break;
                    case 3: ls.buscarLibro(3);
                        break;
                    case 4: ls.busarLibroTitulo("Principito");
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        break;
                    case 10:
                        break;
                    case 11:
                        break;
                    case 12:
                        break;
                    case 13: System.out.println("Fin!");
                        break;
                }
            }while(opc != 13);
        
        }
    }


