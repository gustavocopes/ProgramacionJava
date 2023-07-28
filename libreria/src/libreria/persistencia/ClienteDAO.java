/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Cliente;

/**
 *
 * @author gcopes
 */

    public class ClienteDAO extends DAO<Cliente> {

    @Override
    public void guardar(Cliente cliente) {
        super.guardar(cliente);
    }

    public void eliminar(int IdSQL) {
        Cliente clienteBorrar = em.find(Cliente.class, IdSQL);

        super.eliminar(clienteBorrar);
    }

    public void editar(int IdSQL, String nom) {
        Cliente cliente = em.find(Cliente.class, IdSQL);

        cliente.setNombre(nom);

        super.editar(cliente);
    }

    public void buscar(String nombreSQL) {

        super.conectar();
        List<Cliente> clientes = em.createQuery("SELECT a FROM Cliente a WHERE a.nombre LIKE :nom", Cliente.class).setParameter("nom", "%" + nombreSQL + "%").getResultList();

        for (Cliente x : clientes) {
            System.out.println(x);
        }
        
       
    }
}
