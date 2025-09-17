package com.ciclos;

import java.util.Scanner;

public class Ciclos9_SACA {
    /*
    Programa Java que lea dos números y muestre los números pares entre ellos.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer número: "); //Introducir los numeros
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        int menor = Math.min(num1, num2);//verifico cual es el mayor y menor
        int mayor = Math.max(num1, num2);
        System.out.println("Números pares entre " + menor + " y " + mayor + ":");
        boolean hayPares = false; //indico los pares
        for (int i = menor; i <= mayor; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                hayPares = true;
            }
        }
        if (!hayPares) {
            System.out.println("No hay números pares en ese rango.");
        }
    }
}
