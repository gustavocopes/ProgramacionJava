/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package relaciones;

/**
 *
 * @author gcopes 
 */
public class Relaciones {

    
    public static void main(String[] args) {
        
        Dni doc = new Dni();
        doc.setSerie('x');
        doc.setNumero(132456);
        Persona ps = new Persona();
        ps.setNombre("Gianni");
        ps.setApellido("Fabbro");
        ps.setDocumento(doc);
        
        System.out.println(ps.getNombre() + ps.getApellido() + ps.getDocumento());
        
    }

}
