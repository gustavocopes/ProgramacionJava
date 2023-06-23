package entidades;

public class ExtraHotel extends Resort {

    private boolean priv;

    private double sup;

    public ExtraHotel(boolean priv, double sup, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.priv = priv;
        this.sup = sup;
    }

    public ExtraHotel(boolean priv, double sup) {
        this.priv = priv;
        this.sup = sup;
    }

    public ExtraHotel() {
    }

    public boolean isPriv() {
        return priv;
    }

    public void setPriv(boolean priv) {
        this.priv = priv;
    }

    public double getSup() {
        return sup;
    }

    public void setSup(double sup) {
        this.sup = sup;
    }
    
    
}
