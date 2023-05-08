/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas
y la cantidad jugadas máximas que puede realizar el usuario.
 */
package entidades;

/**
 *
 * @author GCopes
 */
public class Ahorcado {
    
    private int cantLetras;
    private int cantJugadas;
    private String[] vector = new String[cantLetras];// qué valor le doy a la dimensión??

    public Ahorcado() {
    }

    public Ahorcado(int cantLetras, int cantJugadas) {
        this.cantLetras = cantLetras;
        this.cantJugadas = cantJugadas;
    }

    public String[] getVector() {
        return vector;
    }

    public void setVector(String[] vector) {
        this.vector = vector;
        
    }

    public int getCantLetras() {
        return cantLetras;
    }

    public void setCantLetras(int cantLetras) {
        this.cantLetras = cantLetras;
    }

    public int getCantJugadas() {
        return cantJugadas;
    }

    public void setCantJugadas(int cantJugadas) {
        this.cantJugadas = cantJugadas;
    }
    
    
}
