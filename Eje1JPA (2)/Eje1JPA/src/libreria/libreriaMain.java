
package libreria;

//import libreria.Servicio.AutorServicio;
//import libreria.Entidad.Autor;
import libreria.Entidad.Editorial;
import libreria.Servicio.EditorialServicio;


public class libreriaMain{
   
    public static void main(String[] args) {
//        Editorial e = new Editorial(12, "asd", true);
        EditorialServicio es = new EditorialServicio();
       
       // es.crearEditorial(12, "manu", true);
        es.findEditorial();
        
    }
    
}
