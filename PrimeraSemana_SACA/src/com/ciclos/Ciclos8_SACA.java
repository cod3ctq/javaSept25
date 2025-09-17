package com.ciclos;

import java.util.Scanner;

public class Ciclos8_SACA {
    /*
        Programa Java que lea dos números y muestre los números desde el menor hasta el
        mayor
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        int menor = Math.min(num1, num2);//verifico cual es el mayor y menor
        int mayor = Math.max(num1, num2);
        System.out.println("Números desde " + menor + " hasta " + mayor + ":");
        for (int i = menor; i <= mayor; i++) { //muestro desde el menor al mayor.
            System.out.println(i);
        }
    }
}
