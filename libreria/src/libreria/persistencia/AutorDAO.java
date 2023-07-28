/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Autor;

/**
 *
 * @author gcopes
 */

    public class AutorDAO extends DAO<Autor> {

    @Override
    public void guardar(Autor autor) {
        super.guardar(autor);
    }

    public void eliminar(int IdSQL) {
        Autor editorialBorrar = em.find(Autor.class, IdSQL);

        super.eliminar(editorialBorrar);
    }

    public void editar(int IdSQL, String nom) {
        Autor autor = em.find(Autor.class, IdSQL);

        autor.setNombre(nom);

        super.editar(autor);
    }

    public void buscar(String nombreSQL) {

        super.conectar();
        List<Autor> autores = em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nom", Autor.class).setParameter("nom", "%" + nombreSQL + "%").getResultList();

        for (Autor x : autores) {
            System.out.println(x);
        }
        
       
    }
}
