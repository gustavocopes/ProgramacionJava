/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;

/**
 *
 * @author gcopes
 */
public class EditorialServicio {
        EntityManager em = Persistence.createEntityManagerFactory("libreriaPU")
.createEntityManager();
    
      public Editorial persistirEditorial(int id, String nombre){
          try{
        Editorial ed = new Editorial(id, nombre,true);
       
        em.getTransaction().begin();
        
        em.persist(ed);
        em.getTransaction().commit();
        return ed;
          }catch(Exception e){
              throw e;
          }
    }
}
