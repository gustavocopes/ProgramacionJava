/*

 */

package libreria.Servicio;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import libreria.Entidad.Editorial;

public class LibroServicio {
    Scanner sc = new Scanner(System.in);
    
    // Creamos un EntityManager
    EntityManager em = Persistence.createEntityManagerFactory("Eje1JPAPU").createEntityManager();

    //Creamos un objeto Autor 
    public void persistirEditorial(Editorial editorial) {

        
        //Iniciamos una transacción con el método getTransaction().begin();
        em.getTransaction().begin();

        //Persistimos el objeto
        em.persist(editorial);


        //Terminamos la transacción con el método commit. Commit en programación
        //significa confirmar un conjunto de cambios, en este caso persistir el
        //objeto
        em.getTransaction().commit();
    }

    public void findEditorial(String nombreSQL) {
        //Consulta JPQL
        //.setParameter() recibe un parametro ingresado y el cambia por un alias || .getResultList() devuelve una lista de dichos objetos
        List<Editorial> editoriales = em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nom", Editorial.class).setParameter("nom", "%" + nombreSQL + "%").getResultList();

        for (Editorial x : editoriales) {
            System.out.println(x);
        }
    }

    public void mergeEditorial(int IdSQL) {
        //Usamos el método find para buscar el alumno a editar
        Editorial editorial = em.find(Editorial.class, IdSQL);

        //Le asignamos un nuevo nombre
        editorial.setNombre("ManuFacheroFacherito");

        em.getTransaction().begin();

        //Actualizamos el autor
        em.merge(editorial);

        em.getTransaction().commit();
    }

    public void removeEditorial(int IdSQL) {
        Editorial editorial = em.find(Editorial.class, IdSQL);

        em.getTransaction().begin();

        em.remove(editorial);

        em.getTransaction().commit();
    }
    
    public void menuFind(){
        System.out.println("Buscar: \n 1 - ISBM \n 2- Titulo");
        int x = sc.nextInt();
        boolean buscar = false;
        
        if (x == 1) {
            buscar = true;
        }
        
        
    }
}
