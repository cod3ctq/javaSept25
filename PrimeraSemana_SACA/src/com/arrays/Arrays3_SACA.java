package com.arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Arrays3_SACA {
    public static void main(String[] args) {
        /*
            Pide al usuario por teclado una frase y pasa sus caracteres a un array de caracteres.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = scanner.nextLine();
        char[] caracteres = new char[frase.length()]; //toCharArray() este metodo te ayuda a pasar una frase a un array de caracteres.
        for (int i = 0; i < frase.length(); i++) {
            caracteres[i] = frase.charAt(i);
        }
        System.out.print("Array de caracteres: ");
        for (char c : caracteres){
            System.out.print(c + " ");
        }

    }
}
