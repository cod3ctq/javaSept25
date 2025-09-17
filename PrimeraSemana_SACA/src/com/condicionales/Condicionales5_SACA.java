package com.condicionales;

import java.util.Scanner;

public class Condicionales5_SACA {
    public static void main(String[] args) {
        /*  5. Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes
            parámetros: edad, nota y sexo.
            * Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
            * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
            * Otros casos -> NO ACEPTADA
        */

        //Creo mi clase Scanner
        Scanner scanner = new Scanner(System.in);
        //Ingresaremos la edad
        System.out.println("Ingresa la edad: ");
        int edad = scanner.nextInt();
        //Ingresaremos la nota
        System.out.println("\nIngresa la nota: ");
        double nota = scanner.nextDouble();
        //Ingresaremos el Género
        System.out.println("\n Ingresa el genero (M/F) "); //Masculino/Femenino
        char genero = scanner.next().toUpperCase().charAt(0); // Indico que "charAt(0) para que asigne el primer caracter que sería M/F.

        if (nota >= 5 && edad >= 18) {  //Indico si mi nota es menor o igual a 5 y mi edad es mayor o igual me indique si soy aceptada o posible acuerdo a mi genero.
            if (genero == 'M') {
                System.out.println("\nPOSIBLE");
            } else if (genero == 'F') {
                System.out.println("\nACEPTADA");
            } else {
                System.out.println("\nGENERO NO VALIDO");
            }
        } else {
            System.out.println("\nNO ES ACEPTADA");
        }

        scanner.close();
    }
}

