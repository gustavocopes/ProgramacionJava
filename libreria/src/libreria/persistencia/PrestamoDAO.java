/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Cliente;
import libreria.entidades.Prestamo;

/**
 *
 * @author gcopes
 */
 public class PrestamoDAO extends DAO<Prestamo> {

    @Override
    public void guardar(Prestamo prestamo) {
        super.guardar(prestamo);
    }

    public void eliminar(int IdSQL) {
       Prestamo prestamoBorrar = em.find(Prestamo.class, IdSQL);

        super.eliminar(prestamoBorrar);
    }

//    public void editar(int IdSQL, String nom) {
//        Prestamo prestamo = em.find(Prestamo.class, IdSQL);
//
//        prestamo.setNombre(nom);
//
//        super.editar(prestamo);
//    }

//    public void buscar(String nombreSQL) {
//
//        super.conectar();
//        List<Cliente> clientes = em.createQuery("SELECT a FROM Cliente a WHERE a.nombre LIKE :nom", Cliente.class).setParameter("nom", "%" + nombreSQL + "%").getResultList();
//
//        for (Cliente x : clientes) {
//            System.out.println(x);
//        }
        
       
    }
}
