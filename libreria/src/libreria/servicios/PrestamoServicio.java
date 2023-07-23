/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import libreria.entidades.Cliente;
import libreria.entidades.Libro;
import libreria.entidades.Prestamo;

/**
 *
 * @author gcopes
 */
public class PrestamoServicio {
    
    EntityManager em = Persistence.createEntityManagerFactory("libreriaPU").createEntityManager();
    
    public void crearPrestamo(Integer id, Date fechaPrestamo, Date FechaDevolucion, Libro libro, Cliente cliente){
        Prestamo pr = new Prestamo(id, fechaPrestamo,FechaDevolucion,  libro, cliente);
        
        em.getTransaction().begin();
        em.persist(pr);
        em.getTransaction().commit();
    }
}
