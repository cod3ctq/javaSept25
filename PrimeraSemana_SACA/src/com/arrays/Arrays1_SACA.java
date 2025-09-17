package com.arrays;

import java.util.Scanner;

public class Arrays1_SACA {
    public static void main(String[] args) {
    /*
           1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
        Muestra por consola el índice y el valor al que corresponde.
     */
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un numero para la posicion "+ i + ": ");
            numeros[i] = scanner.nextInt();
        }
        System.out.println("\n Contenido del array: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Indice " + i + " »Valor: " + numeros[i]);
        }
    }
}
