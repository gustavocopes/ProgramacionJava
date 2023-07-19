/*Lista el nombre de todos los productos que hay en la tabla producto.
b) Lista los nombres y los precios de todos los productos de la tabla producto.
c) Listar aquellos productos que su precio esté entre 120 y 202.
d) Buscar y listar todos los Portátiles de la tabla producto.
e) Listar el nombre y el precio del producto más barato.
f) Ingresar un producto a la base de datos.
g) Ingresar un fabricante a la base de datos
h) Editar un producto con datos a elección.
 */
package tienda.servicios;

import java.util.Scanner;
import tienda.persistencia.FabricanteDAO;
import tienda.persistencia.ProductoDao;

/**
 *
 * @author gcopes
 */
public class productoService{
   
 public void menu() throws Exception{
     int opc = 0;
     ProductoDao pd = new ProductoDao();
     FabricanteDAO fd = new FabricanteDAO();
     Scanner sc = new Scanner(System.in);
     do{
     System.out.println("--------------MENÚ-----------------");
     System.out.println("1. Lista el nombre de todos los productos que hay en la tabla producto.");
     System.out.println("2. Lista los nombres y los precios de todos los productos de la tabla producto.");
     System.out.println("3. Listar aquellos productos que su precio esté entre 120 y 202.");
     System.out.println("4. Buscar y listar todos los Portátiles de la tabla producto.");
     System.out.println("5. Listar el nombre y el precio del producto más barato.");
     System.out.println("6. Ingresar un producto a la base de datos.");
     System.out.println("7. Ingresar un fabricante a la base de datos.");
     System.out.println("8. Editar un producto con datos a elección.");
     System.out.println("9. Finalizar.");
     System.out.println("--------------------------\n");
     System.out.println("Ingrese una opción: ");
     opc = sc.nextInt();
     
     switch(opc){
         case 1: pd.productoTodos();
             break;
         case 2: pd.precioProducto();
             break;
         case 3: pd.precioRango();
             break;
         case 4: pd.busqueda();
             break;
         case 5: pd.precioBarato();
             break;
         case 6: pd.insertarProducto();
             break;
         case 7: fd.insertarFabricante();
             break;
         case 8: System.out.println("Ingrese el código de producto que desea modificar: ");
         int cod = sc.nextInt();
             System.out.println("Ingrese el nuevo nombre del producto: ");
             String item = sc.next();
             System.out.println("Ingrese el precio del nuevo producto: ");
             double costo = sc.nextDouble();
             pd.editarProducto(cod, item, costo);
             break;
         case 9: System.out.println("Fin!");
             break;
         default: System.out.println("Ingrese una opción válida!");
     }
 }while(opc != 9);
   
   
}
}
