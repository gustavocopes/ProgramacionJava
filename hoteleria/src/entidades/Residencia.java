package entidades;

public class Residencia extends ExtraHotel {

    private int hab;

    private boolean descGremial;

    private boolean campDeportivo;

    public Residencia(int hab, boolean descGremial, boolean campDeportivo, boolean priv, double sup, String nombre, String direccion, String localidad, String gerente) {
        super(priv, sup, nombre, direccion, localidad, gerente);
        this.hab = hab;
        this.descGremial = descGremial;
        this.campDeportivo = campDeportivo;
    }

    public Residencia(int hab, boolean descGremial, boolean campDeportivo, boolean priv, double sup) {
        super(priv, sup);
        this.hab = hab;
        this.descGremial = descGremial;
        this.campDeportivo = campDeportivo;
    }

    public Residencia(int hab, boolean descGremial, boolean campDeportivo) {
        this.hab = hab;
        this.descGremial = descGremial;
        this.campDeportivo = campDeportivo;
    }

    public Residencia() {
    }

    public int getHab() {
        return hab;
    }

    public void setHab(int hab) {
        this.hab = hab;
    }

    public boolean isDescGremial() {
        return descGremial;
    }

    public void setDescGremial(boolean descGremial) {
        this.descGremial = descGremial;
    }

    public boolean isCampDeportivo() {
        return campDeportivo;
    }

    public void setCampDeportivo(boolean campDeportivo) {
        this.campDeportivo = campDeportivo;
    }
    
    @Override
    public void calcularPrecio() {
    }
}
