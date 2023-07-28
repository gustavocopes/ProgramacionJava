/*
 
 */
package libreria.Servicio;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import libreria.Entidad.Autor;

public class AutorServicio {

    // Creamos un EntityManager
    EntityManager em = Persistence.createEntityManagerFactory("Eje1JPAPU").createEntityManager();
    
    Scanner read = new Scanner(System.in);
    
    //Creamos un objeto Autor 
    public void persistirAutor(Autor autor) {

        //Iniciamos una transacción con el método getTransaction().begin();
        em.getTransaction().begin();

        //Persistimos el objeto
        em.persist(autor);

        //Terminamos la transacción con el método commit. Commit en programación
        //significa confirmar un conjunto de cambios, en este caso persistir el
        //objeto
        em.getTransaction().commit();
    }

    public void findAutor(String nombreSQL) {
        //Consulta JPQL
        //.setParameter() recibe un parametro ingresado y el cambia por un alias || .getResultList() devuelve una lista de dichos objetos
        List<Autor> autores = em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombreSQL", Autor.class).setParameter("nombreSQL", "%" + nombreSQL + "%").getResultList();

        for (Autor autore : autores) {
            System.out.println(autore);
        }
    }

    public void mergeAutor(int IdSQL) {
        //Usamos el método find para buscar el alumno a editar
        Autor autor = em.find(Autor.class, IdSQL);

        //Le asignamos un nuevo nombre
        System.out.println("Ingrese el nuevo nombre de Autor: ");
        autor.setNombre(read.next());
        em.getTransaction().begin();

        //Actualizamos el autor
        em.merge(autor);

        em.getTransaction().commit();
    }

    public void removeAutor(int IdSQL) {
        Autor autor = em.find(Autor.class, IdSQL);

        em.getTransaction().begin();

        em.remove(autor);

        em.getTransaction().commit();
    }

}
