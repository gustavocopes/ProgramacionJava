package entidades;

public class Yate extends Barco {

    private double potencia;

    private int camarotes;

    public Yate(double potencia, int camarotes, String matricula, double slora, int annio) {
        super(matricula, slora, annio);
        this.potencia = potencia;
        this.camarotes = camarotes;
    }

    public Yate(double potencia, int camarotes) {
        this.potencia = potencia;
        this.camarotes = camarotes;
    }

    public Yate() {
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }
    @Override
     public double calcularModulo(){
         return ((getSlora() * 10) + camarotes + potencia);
    }
}
