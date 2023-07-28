package libreria.persistencia;

import java.util.List;
import libreria.Entidad.Editorial;

public class EditorialDAO extends DAO<Editorial> {

    @Override
    public void guardar(Editorial editorial) {
        super.guardar(editorial);
    }

    public void eliminar(int IdSQL) {
        Editorial editorialBorrar = em.find(Editorial.class, IdSQL);

        super.eliminar(editorialBorrar);
    }

    public void editar(int IdSQL, String nom) {
        Editorial editorial = em.find(Editorial.class, IdSQL);

        editorial.setNombre(nom);

        super.editar(editorial);
    }

    public void buscar(String nombreSQL) {

        super.conectar();
        List<Editorial> editoriales = em.createQuery("SELECT a FROM Editorial a WHERE a.nombre LIKE :nom", Editorial.class).setParameter("nom", "%" + nombreSQL + "%").getResultList();

        for (Editorial x : editoriales) {
            System.out.println(x);
        }
        
       
    }
}
