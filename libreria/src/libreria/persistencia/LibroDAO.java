/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Libro;

/**
 *
 * @author gcopes
 */

    public class LibroDAO extends DAO<Libro> {

    @Override
    public void guardar(Libro libro) {
        super.guardar(libro);
    }

    public void eliminar(int IdSQL) {
        Libro libroBorrar = em.find(Libro.class, IdSQL);

        super.eliminar(libroBorrar);
    }

    public void editar(int IdSQL, String nom) {
        Libro libro = em.find(Libro.class, IdSQL);

        libro.setTitulo(nom);

        super.editar(libro);
    }

    public void buscar(String nombreSQL) {

        super.conectar();
        List<Libro> editoriales = em.createQuery("SELECT a FROM Libro a WHERE a.titulo LIKE :nom", Libro.class).setParameter("nom", "%" + nombreSQL + "%").getResultList();

        for (Libro x : editoriales) {
            System.out.println(x);
        }
        
       
    }
}
