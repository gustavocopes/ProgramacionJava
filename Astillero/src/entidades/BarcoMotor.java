package entidades;

public class BarcoMotor extends Barco {

    private double potencia;

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public BarcoMotor(double potencia, String matricula, double slora, int annio) {
        super(matricula, slora, annio);
        this.potencia = potencia;
    }

    public BarcoMotor(double potencia) {
        this.potencia = potencia;
    }

    public BarcoMotor() {
    }

    
    @Override
    public double calcularModulo(){
        return (getSlora() * 10 + potencia);
    }
}
