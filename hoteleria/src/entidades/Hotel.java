package entidades;

public class Hotel extends Resort {

    private int hab;

    private int camas;

    private int pisos;

    private int precioHab;

    public Hotel() {
    }

    public Hotel(int hab, int camas, int pisos, int precioHab, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.hab = hab;
        this.camas = camas;
        this.pisos = pisos;
        this.precioHab = precioHab;
    }


    public int getHab() {
        return hab;
    }

    public void setHab(int hab) {
        this.hab = hab;
    }

    public int getCamas() {
        return camas;
    }

    public void setCamas(int camas) {
        this.camas = camas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getPrecioHab() {
        return precioHab;
    }

    public void setPrecioHab(int precioHab) {
        this.precioHab = precioHab;
    }
    /*El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).*/
    
    public void calcularPrecio() {
        
        setPrecioHab(50 + (getCamas() * getHab() * getPisos()));
    }
}
