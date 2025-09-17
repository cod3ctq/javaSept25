package com.ciclos;

import java.util.Scanner;

public class Ciclos10_SACA {
    /*
        Programa que lea 20 números e indique si son positivos o negativos y pares o
        impares y además muestre la sumatoria de los positivos y sumatoria de los impares.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumaPositivos = 0;
        int sumaImpares = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.print("Introduce el número " + i + ": ");
            int num = scanner.nextInt();
            if (num >= 0) {
                System.out.print("Positivo, ");
                sumaPositivos += num;               // Positivo o negativo
            } else {
                System.out.print("Negativo, ");
            }
            if (num % 2 == 0) {
                System.out.println("par.");         // Par o impar
            } else {
                System.out.println("impar.");
                sumaImpares += num;
            }
        }
        System.out.println("\nSumatoria de números positivos: " + sumaPositivos);
        System.out.println("Sumatoria de números impares: " + sumaImpares);

    }
}
