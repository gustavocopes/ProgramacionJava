/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subprogramas.java;

import java.util.Scanner;

/**
 *
 * @author jere5
 */
public class Ejercicio_2_consigna_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num, num2;
        int op;
        do {

            System.out.println("Ingrese el primer número:");
            num = read.nextInt();
            System.out.println("Ingrese el segundo número:");
            num2 = read.nextInt();
            do {
                System.out.println("");
                System.out.println("MENU");
                System.out.println("1.sumar");
                System.out.println("2.restar");
                System.out.println("3.multiplicar");
                System.out.println("4.dividir");
                System.out.println("5. Cambiar números");
                System.out.println("6.salir");
                System.out.println("eliga una opcion:");
                op = read.nextInt();

                switch (op) {
                    case 1:
                        System.out.println("La suma entre " + num + " y " + num2 + " es de: " + suma(num, num2));
                        System.out.println("Presione ENTER para continuar");
                        new java.util.Scanner(System.in).nextLine();
                        break;
                    case 2:
                        System.out.println("La resta entre " + num + " y " + num2 + " es de: " + resta(num, num2));
                        System.out.println("Presione ENTER para continuar");
                        new java.util.Scanner(System.in).nextLine();
                        break;
                    case 3:
                        System.out.println("La multiplicación entre " + num + " y " + num2 + " es de: " + multiplicar(num, num2));
                        System.out.println("Presione ENTER para continuar");
                        new java.util.Scanner(System.in).nextLine();
                        break;
                    case 4:
                        System.out.println("La división entre " + num + " y " + num2 + " es de: " + dividir(num, num2));
                        System.out.println("Presione ENTER para continuar");
                        new java.util.Scanner(System.in).nextLine();
                        break;
                }
            } while (op != 5 && op != 6);

        } while (op != 6);

    }

    public static int suma(int num, int num2) {
        int sumar;
        sumar = num + num2;
        return sumar;
    }

    public static int resta(int num, int num2) {
        int res;
        res = num - num2;
        return res;
    }

    public static int multiplicar(int num, int num2) {
        int mul;
        mul = num * num2;
        return mul;
    }

    public static int dividir(int num, int num2) {
        int div;
        div = num / num2;
        return div;
    }

}
