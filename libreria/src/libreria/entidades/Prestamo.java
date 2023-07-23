/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author gcopes
 */
@Entity
public class Prestamo {
    @Id
    private Integer id;
    @Temporal(TemporalType.DATE)
    private Date fechaPrestamo;
    @Temporal(TemporalType.DATE)
    private Date FechaDevolucion;
    @OneToOne
    private Libro libro;
    @OneToOne
    private Cliente cliente;

    public Prestamo() {
    }

    public Prestamo(Integer id, Date fechaPrestamo, Date FechaDevolucion, Libro libro, Cliente cliente) {
        this.id = id;
        this.fechaPrestamo = fechaPrestamo;
        this.FechaDevolucion = FechaDevolucion;
        this.libro = libro;
        this.cliente = cliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return FechaDevolucion;
    }

    public void setFechaDevolucion(Date FechaDevolucion) {
        this.FechaDevolucion = FechaDevolucion;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "id=" + id + ", fechaPrestamo=" + fechaPrestamo + ", FechaDevolucion=" + FechaDevolucion + ", libro=" + libro + ", cliente=" + cliente + '}';
    }
    
}
