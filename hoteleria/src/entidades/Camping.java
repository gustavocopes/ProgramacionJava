package entidades;

public class Camping extends ExtraHotel {

    private int carpas;

    private int banios;

    private boolean comedor;

    public Camping(int carpas, int banios, boolean comedor, boolean priv, double sup, String nombre, String direccion, String localidad, String gerente) {
        super(priv, sup, nombre, direccion, localidad, gerente);
        this.carpas = carpas;
        this.banios = banios;
        this.comedor = comedor;
    }

    public Camping(int carpas, int banios, boolean comedor, boolean priv, double sup) {
        super(priv, sup);
        this.carpas = carpas;
        this.banios = banios;
        this.comedor = comedor;
    }

    public Camping(int carpas, int banios, boolean comedor) {
        this.carpas = carpas;
        this.banios = banios;
        this.comedor = comedor;
    }

    public Camping() {
    }

    public int getCarpas() {
        return carpas;
    }

    public void setCarpas(int carpas) {
        this.carpas = carpas;
    }

    public int getBanios() {
        return banios;
    }

    public void setBanios(int banios) {
        this.banios = banios;
    }

    public boolean isComedor() {
        return comedor;
    }

    public void setComedor(boolean comedor) {
        this.comedor = comedor;
    }
    
  
}
