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
import libreria.entidades.Editorial;
import libreria.entidades.Libro;

/**
 *
 * @author gcopes
 */
public class LibroServicio {
    
        EntityManager em = Persistence.createEntityManagerFactory("libreriaPU")
.createEntityManager();
        
      public void persistirLibro(long isbn, String titulo, int anio, int ejempP, int ejemp, Autor aut, Editorial ed){
          
        Libro lib = new Libro();
        try{
        lib.setIsbn(isbn);
       lib.setTitulo(titulo);
       lib.setAnio(anio);
       lib.setEjemplaresPrestados(ejempP);
       lib.setEjemplares(ejemp);
       lib.setEjemplaresRestantes(ejemp- ejempP);
       lib.setAutor(aut);
       lib.setEditorial(ed);
        em.getTransaction().begin();
        
        em.persist(lib);
        em.getTransaction().commit();
        }catch(Exception e){
            throw e;
        }
    }
      
      public Libro buscarLibro(long isbn){
          
          Libro lib = em.find(Libro.class, isbn);
          System.out.println(lib);
          return lib;
      }
      
      public void busarLibroTitulo(String tit){
          
          List<Libro> lib =  em.createQuery("SELECT a FROM Libro a WHERE a.titulo LIKE :titulo").setParameter("titulo", tit).getResultList();
          System.out.println(lib);
      }
      
      public void buscarLibroAutor(String escritor){
          
          List<Libro> lib = em.createQuery("Select a FROM Libro a Where a.autor.nombre LIKE :autor").setParameter("autor", escritor).getResultList();
          System.out.println(lib);
      }
      public void buscarLibroEditorial(String ed){
          
          List<Libro> lib = em.createQuery("SELECT a FROM Libro a WHERE a.editorial.nombre LIke :edit").setParameter("edit", ed).getResultList();
          System.out.println(lib);
      }
}
