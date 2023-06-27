package entidades;

import java.util.Comparator;

public class Hotel5 extends Hotel4 {

    private Integer salones;

    private Integer suites;

    private Integer limos;
   

    public Hotel5() {
    }

    public Hotel5(Integer salones, Integer suites, Integer limos, boolean gym, String resto, Integer capResto, Integer hab, Integer camas, Integer pisos, Integer precioHab, String nombre, String direccion, String localidad, String gerente) {
        super(gym, resto, capResto, hab, camas, pisos, precioHab, nombre, direccion, localidad, gerente);
        this.salones = salones;
        this.suites = suites;
        this.limos = limos;
    }

    public Hotel5(boolean gym, String resto, Integer capResto, Integer hab, Integer camas, Integer pisos, Integer precioHab, String nombre, String direccion, String localidad, String gerente) {
        super(gym, resto, capResto, hab, camas, pisos, precioHab, nombre, direccion, localidad, gerente);
    }
    

    public Integer getSalones() {
        return salones;
    }

    public void setSalones(Integer salones) {
        this.salones = salones;
    }

    public Integer getSuites() {
        return suites;
    }

    public void setSuites(Integer suites) {
        this.suites = suites;
    }

    public Integer getLimos() {
        return limos;
    }

    public void setLimos(Integer limos) {
        this.limos = limos;
    }
    @Override
    public void calcularPrecio() {
            setPrecioHab(50 + (getCamas() * getHab() * getPisos()) + (tipoGym()) + comprobarResto() + (getLimos() * 15));
    }
//     public static Comparator<Hotel5> compararPrecio = new Comparator<Hotel5>(){
//        @Override
//        public int compare(Hotel5 h1, Hotel5 h2) {
//            return (h2.getPrecioHab().compareTo(h1.getPrecioHab()));
//        }
//    };
    }

