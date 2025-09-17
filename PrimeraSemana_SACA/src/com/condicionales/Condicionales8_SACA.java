package com.condicionales;

import java.util.Scanner;

public class Condicionales8_SACA {
    /*
        Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de
        seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado
        obtenido.
        Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
        Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje:
        “ERROR: número incorrecto”.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Agrego Scanner
        System.out.println("Introduce el resultado del dado (1-6): ");
        int resultado = scanner.nextInt();
        if (resultado < 1 || resultado > 6) {
            System.out.println("\nError: número incorrecto");
        } else {
            int caraOpuesta = 7 - resultado; //Si el número introducido está dentro de (1-6) se procesará a través del switch, ejemplo si el valor introducido es 2 su cara opuesta por consiguiente seria el 5. al 7 se le resta el número introducido
            String numeroLetras;
            switch (caraOpuesta) {
                case 1:
                    numeroLetras = "uno";
                    break;
                case 2:
                    numeroLetras = "dos";
                    break;
                case 3:
                    numeroLetras = "tres";
                    break;
                case 4:
                    numeroLetras = "cuatro";
                    break;
                case 5:
                    numeroLetras = "cinco";
                    break;
                case 6:
                    numeroLetras = "seis";
                    break;
                default:
                    numeroLetras = "error";
            }
            System.out.println("\nLa cara opuesta es: " + numeroLetras);
        }
        scanner.close();
    }
}
