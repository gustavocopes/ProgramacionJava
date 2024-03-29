/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.Scanner;

import libreria.entidades.Editorial;
import libreria.persistencia.EditorialDAO;

/**
 *
 * @author gcopes
 */
public class EditorialServicio {
       private final EditorialDAO DAO;

    Scanner read = new Scanner(System.in);

    public EditorialServicio() {
        this.DAO = new EditorialDAO();
    }

    //Creamos un objeto Editorial
    public void crearEditorial(int id, String nom, boolean altaBaja) {
        Editorial e = new Editorial();

        e.setId(id);
        e.setNombre(nom);
        e.setAlta(altaBaja);

        DAO.guardar(e);
    }

    public void removeEditorial() {
        System.out.println("ID a elimar: ");
        DAO.eliminar(read.nextInt());
    }

    public void findEditorial() {
        System.out.println("Nombre a buscar: ");
        String nombreSQL = read.next();
        
        DAO.buscar(nombreSQL);
    }

    public void mergeEditorial() {
        
        //Le asignamos un nuevo nombre
        System.out.println("Ingrese el nuevo nombre de Editorial: ");
        String nombre = read.next();
        
        System.out.println("Ingrese la PK: ");
        int PK = read.nextInt();
        
        DAO.editar(PK,nombre);
    }

}
