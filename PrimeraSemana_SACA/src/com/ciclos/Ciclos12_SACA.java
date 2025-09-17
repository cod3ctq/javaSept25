package com.ciclos;

import java.util.Scanner;

public class Ciclos12_SACA {
    /*
        12.Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara
        cuando el promedio de las edades sea superior a 25.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumaEdades = 0;
        int contador = 0;
        double promedio = 0.0;
        while (promedio <= 25) {
            System.out.print("Introduce una edad: ");
            int edad = scanner.nextInt();
            sumaEdades += edad;
            contador++;
            promedio = (double) sumaEdades / contador;
            System.out.printf("Promedio actual: %.2f%n", promedio);
        }
        System.out.println("El promedio de edades es superior a 25. Fin del programa.");
    }
}
