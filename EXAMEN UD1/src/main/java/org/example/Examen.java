package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Examen {
    public void ejercicio1() {
        Scanner entrada = new Scanner(System.in);
                //Pedimos la nota del primer trimestre y la leemos
                System.out.println("Introduce la nota del trimestre 1");
                int num1 = entrada.nextInt();
                //Pedimos la nota del segundo trimestre y la leemos
                System.out.println("Introduce la nota del trimistre 2");
                int num2 = entrada.nextInt();
                //Pedimos la nota del tercer trimestre y la leemos
                System.out.println("Introduce la nota del trimestre 3");
                int num3 = entrada.nextInt();
                //Hacemos la suma de las notas dadas
                int resultado = num1 + num2 + num3;
                //Con el resultado de la suma de las notas lo dividimos entre 3
                int resultado_total = resultado / 3;

                System.out.println("El resultado obtenido es de " + resultado_total);
                //Si el resultado es mayor o igual a 5 pone aprobado y si suspendido
                if (resultado_total >= 5) {

                    System.out.println("APROBADO");
                } else {
                    System.out.println("SUSPENDIDO");
                }

            }


    public void ejercicio2() {

        Scanner entrada = new Scanner(System.in);
        //Pedimos y leemos el numero
        System.out.println("Introduce un numero...");
        int num1 = entrada.nextInt();
        //Si el numero introducido es mayor a 0 decimos que numero es si no lo multiplicamos por -1
        if (num1 > 0) {
            System.out.println("El numero introducido es " + num1);
        } else if (num1 < 0) {
            int resultado = num1 * (-1);
            System.out.println("El valor absoluto es " + resultado);
        }
    }
}
