package com.condicionales;

import java.util.Scanner;

public class Condicionales4_SACA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        String texto = scanner.nextLine();
        // Usamos una expresión regular para verificar si hay alguna letra mayúscula
        if (texto.matches(".*[A-Z].*")) {
            System.out.println("La cadena contiene letras mayúsculas.");
        } else {
            System.out.println("La cadena no contiene letras mayúsculas.");
        }
        scanner.close();
    }
}
