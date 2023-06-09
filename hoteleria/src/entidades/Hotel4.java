package entidades;

import java.util.Comparator;

public class Hotel4 extends Hotel {

    private boolean gym;

    private String resto;

    private Integer capResto;


    public Hotel4(boolean gym, String resto, Integer capResto, Integer hab, Integer camas, Integer pisos, Integer precioHab, String nombre, String direccion, String localidad, String gerente) {
        super(hab, camas, pisos, precioHab, nombre, direccion, localidad, gerente);
        this.gym = gym;
        this.resto = resto;
        this.capResto = capResto;
    }

    public Hotel4(Integer hab, Integer camas, Integer pisos, Integer precioHab, String nombre, String direccion, String localidad, String gerente) {
        super(hab, camas, pisos, precioHab, nombre, direccion, localidad, gerente);
    }


    public Hotel4() {
    }

    public boolean isGym() {
        return gym;
    }

    public void setGym(boolean gym) {
        this.gym = gym;
    }

    public String getResto() {
        return resto;
    }

    public void setResto(String resto) {
        this.resto = resto;
    }

    public int getCapResto() {
        return capResto;
    }

    public void setCapResto(int capResto) {
        this.capResto = capResto;
    }

    @Override
    public void calcularPrecio() {
        setPrecioHab(50 + (getCamas() * getHab() * getPisos()) + (tipoGym()) + comprobarResto() );
    }
    public int tipoGym(){
        if(isGym()){// true del tipo A, false del tipo B
            return 50;
        }
        return 30;
    }   
     
    public int comprobarResto(){
        
        if(getCapResto() < 30){
            return 10;
        }
        if(getCapResto() >= 30 && getCapResto() <= 50){
            return 30;
        }
        
            return 50;
        
    }
}
    

