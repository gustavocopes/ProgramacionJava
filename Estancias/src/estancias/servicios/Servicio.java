/*

b) Buscar y listar las casas disponibles para el periodo comprendido entre el 1 de agosto de
2020 y el 31 de agosto de 2020 en Reino Unido.
c) Encuentra todas aquellas familias cuya dirección de mail sea de Hotmail.
d) Consulta la BD para que te devuelva aquellas casas disponibles a partir de una fecha dada
y un número de días específico.
e) Listar los datos de todos los clientes que en algún momento realizaron una estancia y la
descripción de la casa donde la realizaron.

f) Listar todas las estancias que han sido reservadas por un cliente, mostrar el nombre, país y
ciudad del cliente y además la información de la casa que reservó. La que reemplazaría a
la anterior
g) Debido a la devaluación de la libra esterlina con respecto al euro se desea incrementar el
precio por día en un 5% de todas las casas del Reino Unido. Mostar los precios
actualizados.
h) Obtener el número de casas que existen para cada uno de los países diferentes.
i) Busca y listar aquellas casas del Reino Unido de las que se ha dicho de ellas (comentarios)
que están ‘limpias’.
j) Insertar nuevos datos en la tabla estancias verificando la disponibilidad de las fechas.
Para finalizar, pensar junto con un compañero cómo sería posible optimizar las tablas de la BD
para tener un mejor rendimiento.
 */
package estancias.servicios;

import estancias.persistencia.FamiliasDAO;
import java.util.Scanner;

/**
 *
 * @author gcopes
 */
public class Servicio {
    int opc = 0;
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    FamiliasDAO fd = new FamiliasDAO();
    
    public void menu() throws Exception{
    do{
            System.out.println("-----------------------------MENÚ---------------------------");
            System.out.println("1. Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años. ");
            System.out.println("2.");
            System.out.println("3.");
            System.out.println("4.");
            System.out.println("5.");
            System.out.println("6.");
            System.out.println("7.");
            System.out.println("8.");
            System.out.println("9.");
            System.out.println("10.");
            System.out.println("11. Finalizar.");
            System.out.println("----------------------------------------------------\n");
            
            System.out.println("Ingrese una opción: \n");
            opc = sc.nextInt();
            
            switch(opc){
                case 1: fd.consultarFamilia();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
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
                case 11: System.out.println("Fin!");
                    break;
                default: System.out.println("Ingrese una opción válida!");
            }            
            
    }while(opc != 11);
    }
}
