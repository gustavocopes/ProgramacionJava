/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import libreria.entidades.Cliente;

/**
 *
 * @author gcopes
 */
public class ClienteServicio {
    
    EntityManager em = Persistence.createEntityManagerFactory("libreriaPU").createEntityManager();
    
    public Cliente crearCliente(Integer id, long documento, String nombre, String apellido, String telefono){
        Cliente cl = new Cliente(id, documento, nombre, apellido, telefono);
        
        em.getTransaction().begin();
        em.persist(cl);
        
        em.getTransaction().commit();
        return cl;
    }
    
}
