/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de adivinanza de números.
El primer jugador elige un número y el segundo jugador intenta adivinarlo.
El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo" después de cada intento.
El juego termina cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado
 */
package Casino;

import java.util.Scanner;

/**
 *
 * @author gcopes
 */
public class Juego {

    private float numero1;
    private float numero2;

    public Juego() {

    }

    public Juego(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    Scanner sc = new Scanner(System.in);

    public void crearNumero() {

        System.out.println("Jugador 1 ingrese el número secreto: ");
        setNumero1(sc.nextFloat());

    }

    public void adivinarNumero() {

        System.out.println("Adivine el número: ");
        numero2 = sc.nextFloat();
        int i = 0;
        while (numero1 != numero2 && i < 5) {

            i++;
            if (numero2 > numero1) {
                System.out.println("El número es más bajo");

            } else {
                System.out.println("El número es más alto");
            }
            System.out.println("Intente nuevamente");
            setNumero2(sc.nextFloat());

        }
        if (numero1 == numero2) {
            System.out.println("Adivinó!");
        }

    }
}
