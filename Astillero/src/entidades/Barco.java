package entidades;

public class Barco {

    private String matricula;

    private double slora;

    private int annio;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSlora() {
        return slora;
    }

    public void setSlora(double slora) {
        this.slora = slora;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public Barco(String matricula, double slora, int annio) {
        this.matricula = matricula;
        this.slora = slora;
        this.annio = annio;
    }

    public Barco() {
    }
    
    public double calcularModulo(){
        return slora * 10;
    }
}
