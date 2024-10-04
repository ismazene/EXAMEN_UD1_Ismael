package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Examen {
    public void ejercicio1() {
        Scanner entrada = new Scanner(System.in);

                System.out.println("Introduce la nota del trimestre 1");
                int num1 = entrada.nextInt();

                System.out.println("Introduce la nota del trimistre 2");
                int num2 = entrada.nextInt();

                System.out.println("Introduce la nota del trimestre 3");
                int num3 = entrada.nextInt();

                int resultado = num1 + num2 + num3;
                int resultado_total = resultado / 3;

                System.out.println("El resultado obtenido es de " + resultado_total);

                if (resultado_total >= 5) {

                    System.out.println("APROBADO");
                } else {
                    System.out.println("SUSPENDIDO");
                }

            }


    public void ejercicio2() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un numero...");
        int num1 = entrada.nextInt();

        if (num1 > 0) {
            System.out.println("El numero introducido es " + num1);
        } else if (num1 < 0) {
            int resultado = num1 * (-1);
            System.out.println("El valor absoluto es " + resultado);
        }
    }
}
