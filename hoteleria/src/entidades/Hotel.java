package entidades;

import java.util.Comparator;

public class Hotel extends Resort {

    private Integer hab;

    private Integer camas;

    private Integer pisos;

    private Integer precioHab;

    public Hotel() {
    }

    public Hotel(Integer hab, Integer camas, Integer pisos, Integer precioHab, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.hab = hab;
        this.camas = camas;
        this.pisos = pisos;
        this.precioHab = precioHab;
    }


    public Integer getHab() {
        return hab;
    }

    public void setHab(Integer hab) {
        this.hab = hab;
    }

    public Integer getCamas() {
        return camas;
    }

    public void setCamas(Integer camas) {
        this.camas = camas;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    public Integer getPrecioHab() {
        return precioHab;
    }

    public void setPrecioHab(Integer precioHab) {
        this.precioHab = precioHab;
    }
    /*El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).*/
    
    public void calcularPrecio() {
        
        setPrecioHab(50 + (getCamas() * getHab() * getPisos()));
    }
    
    public static Comparator<Hotel> compararPrecio = new Comparator<Hotel>(){
        @Override
        public int compare(Hotel h1, Hotel h2) {
            return  h2.getPrecioHab().compareTo(h1.getPrecioHab());
        }
    };
}
