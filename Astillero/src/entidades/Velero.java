package entidades;

public class Velero extends Barco{

    private int mastiles;

    public Velero(int mastiles, String matricula, double slora, int annio) {
        super(matricula, slora, annio);
        this.mastiles = mastiles;
    }

    public Velero(int mastiles) {
        this.mastiles = mastiles;
    }

    public Velero() {
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }
    
    @Override
    public double calcularModulo(){
         return ((getSlora() * 10) + mastiles);
    }
}
