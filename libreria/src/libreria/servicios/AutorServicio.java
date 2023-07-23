/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import libreria.entidades.Autor;

/**
 *
 * @author gcopes
 */
public class AutorServicio {
    
    EntityManager em = Persistence.createEntityManagerFactory("libreriaPU")
.createEntityManager();
    
    public Autor persistirAutor(int id, String nombre){
        try{
        Autor aut = new Autor(id, nombre, true);
        
        em.getTransaction().begin();
        
        em.persist(aut);
        em.getTransaction().commit();
        return aut;
        }catch(Exception e){
            throw e;
        }
    }
    
    public void buscarAutor(String nombre){
        
        List<Autor> autores = em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nom").setParameter("nom", nombre).getResultList();
        
        System.out.println(autores);
    }
}
