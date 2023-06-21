package entidades;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class Alquiler {

    private String nombre;

    private int doc;

    private LocalDate fechaInicio;

    private LocalDate fechaFin;

    private int posicion;

    private Barco nave;
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Alquiler(String nombre, int doc, LocalDate fechaInicio, LocalDate fechaFin, int posicion, Barco nave) {
        this.nombre = nombre;
        this.doc = doc;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.posicion = posicion;
        this.nave = nave;
       
    }

    public Alquiler() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDoc() {
        return doc;
    }

    public void setDoc(int doc) {
        this.doc = doc;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Barco getNave() {
        return nave;
    }

    public void setNave(Barco nave) {
        this.nave = nave;
    }
    
    public void menu(){
        
        int opc = 0;
        do{
        System.out.println("-----------");
        System.out.println("1. Barco a motor.");
        System.out.println("2. Velero.");
        System.out.println("3. Yate.");
        System.out.println("4. Salir.\n");
        System.out.println("Indique el tipo de embarcación que desea alquilar: \n");
        opc = sc.nextInt();
        
        switch (opc){
            case 1: Barco bm = new BarcoMotor(30d, "MLS-350", 12d, 2012);
            
                    System.out.println("El costo del alquiler del barco a motor, matrícula: " + bm.getMatricula() +", es: $" + calculoAlquiler(bm.calcularModulo()));
                break;
            case 2: Barco vel =  new Velero(3, "JKL-124", 8, 2015);
                System.out.println("El costo del alquiler del velero, matrícula: " + vel.getMatricula() + ", es:  $"+ calculoAlquiler(vel.calcularModulo()));
                break;
            case 3: Barco yt = new Yate(62, 3, "LMN-054", 10, 2013);
                System.out.println("El costo del alquiler del yate, matrícula: " + yt.getMatricula() + ", es: $" + calculoAlquiler(yt.calcularModulo()));
                break;
            case 4: System.out.println("Fin!");
            break;
            default: System.out.println("Ingrese un opación válida");
            
        }
    }while(opc != 4);
    }

    /*Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).*/
    
    public double calculoAlquiler(double modulo) {
        System.out.println("Ingrese día, mes y año de retiro de la embarcación: ");
        int diaI = sc.nextInt();
        int mesI  = sc.nextInt();
        int annioI = sc.nextInt();
        System.out.println("Ingres día, mes y año de devolución de la embarcación: ");
        int diaF = sc.nextInt();
        int mesF  = sc.nextInt();
        int annioF = sc.nextInt();
       fechaInicio = LocalDate.of(annioI, mesI, diaI);        
       fechaFin = LocalDate.of(annioF, mesF, diaF);
        System.out.println("Fue alquilado por " + ChronoUnit.DAYS.between(fechaInicio, fechaFin ) + "dias");
       
       return (ChronoUnit.DAYS.between(fechaInicio, fechaFin) * modulo);
    }
}
