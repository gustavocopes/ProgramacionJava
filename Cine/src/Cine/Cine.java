package Cine;

import java.util.ArrayList;
import java.util.Scanner;

public class Cine {

    private String[][] asientos = new String[8][6];

    private ArrayList<Espectador> clientes = new ArrayList();

    private Pelicula movie;

    private double precio = 350;
    
    int espectadoresHabilitados;

    @Override
    public String toString() {
        return "Cine{" + "asientos=" + asientos + ", clientes=" + clientes + ", movie=" + movie + ", precio=" + precio + '}';
    }

    public void cargarSala() {
        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 6; j++) {

                switch (j) {
                    case 0:
                        asientos[i][j] = (i + 1) + "A";
                        break;
                    case 1:
                        asientos[i][j] = (i + 1) + "B";
                        break;
                    case 2:
                        asientos[i][j] = (i + 1) + "C";
                        break;
                    case 3:
                        asientos[i][j] = (i + 1) + "D";
                        break;
                    case 4:
                        asientos[i][j] = (i + 1) + "E";
                        break;
                    case 5:
                        asientos[i][j] = (i + 1) + "F";
                        break;

                }
            }
        }
        for (int i = 0; i < 8; i++) {// para validar como se cargó la matriz
            for (int j = 0; j < 6; j++) {
                System.out.print(asientos[i][j]);
                System.out.print("|");

            }
            System.out.println(" ");

        }

    }

    public void cargarEspectador() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String opc = null;
        do {
            Espectador ps = new Espectador();
            System.out.println("Ingrese el nombre del espectador: ");
            ps.setNombre(sc.next());
            System.out.println("Ingrese la edad del espectador: ");
            ps.setEdad(sc.nextInt());
            System.out.println("Ingrese el dinero disponible del espectador: ");
            ps.setDinero(sc.nextDouble());

            clientes.add(ps);

            System.out.println("Desea cargar otro espectador?:  s/n");
            opc = sc.next();
        } while (opc.equalsIgnoreCase("s"));
        System.out.println(clientes);// control

    }

    public void cargarPelicula() {
        movie = new Pelicula("Avatar", "James Cameron", 16, 184);
        System.out.println(movie);
    }
    
    public void comprobarEntrada(){// cuento cuántos espectadores no puden ingresar
        int cont = 0;
        for (Espectador aux : clientes) {
            if (aux.getDinero()< precio || aux.getEdad()< movie.getEdadMinima()) {
               cont++;
            }
            
        }
        espectadoresHabilitados =  clientes.size() - cont;
     
    }

    public void ubicarEspectador() {
        comprobarEntrada();
        int cont = 0;
        do {//los ubico aleatoriamente

            int i = (int) (Math.random() * 7);
            int j = (int) (Math.random() * 5);
            while (asientos[i][j].contains("X")) {//compruebo que el asiento no esté ocupado
                int k = (int) (Math.random() * 7);
                int l = (int) (Math.random() * 5);
                asientos[k][l] = asientos[k][l] + "X";
            }
            asientos[i][j] = asientos[i][j] + " X";

            cont++;
        } while (cont < espectadoresHabilitados);//hago esto tantas veces como espectadores habilitados tenga
        
    }

    public void mostrarCine() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(asientos[i][j]);
                System.out.print("|");

            }
            System.out.println(" ");

        }
    }
}
