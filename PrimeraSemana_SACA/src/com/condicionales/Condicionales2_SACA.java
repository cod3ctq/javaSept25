package com.condicionales;

import java.util.Scanner;

public class Condicionales2_SACA {
    public static void main(String[] args) {
        //Implementamos la clase Scanner para poder introduccir caracteres al teclado.
        Scanner scanner = new Scanner(System.in);
        //Solicito el número
        System.out.println("Ingresa un número:\t");
        int numero = scanner.nextInt();
        //Realizare un un ciclo if - else
        if (numero % 2 == 0){
            System.out.println("\nEl número " + numero + " es par.");
        }else{
            System.out.println("\nEl número " + numero + " es impar.");
        }
        //Cierro Scanner.
        scanner.close();
    }
}
