package entidades;

public class Hotel5 extends Hotel4 {

    private int salones;

    private int suites;

    private int limos;
   

    public Hotel5() {
    }

    public Hotel5(int salones, int suites, int limos, boolean gym, String resto, int capResto, int hab, int camas, int pisos, int precioHab, String nombre, String direccion, String localidad, String gerente) {
        super(gym, resto, capResto, hab, camas, pisos, precioHab, nombre, direccion, localidad, gerente);
        this.salones = salones;
        this.suites = suites;
        this.limos = limos;
    }

    public Hotel5(boolean gym, String resto, int capResto, int hab, int camas, int pisos, int precioHab, String nombre, String direccion, String localidad, String gerente) {
        super(gym, resto, capResto, hab, camas, pisos, precioHab, nombre, direccion, localidad, gerente);
    }
    

    public int getSalones() {
        return salones;
    }

    public void setSalones(int salones) {
        this.salones = salones;
    }

    public int getSuites() {
        return suites;
    }

    public void setSuites(int suites) {
        this.suites = suites;
    }

    public int getLimos() {
        return limos;
    }

    public void setLimos(int limos) {
        this.limos = limos;
    }
    @Override
    public void calcularPrecio() {
            setPrecioHab(50 + (getCamas() * getHab() * getPisos()) + (tipoGym()) + comprobarResto() + (getLimos() * 15));
    }
    
    }

