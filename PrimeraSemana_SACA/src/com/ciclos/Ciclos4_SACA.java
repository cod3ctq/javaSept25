package com.ciclos;

import java.util.Scanner;

public class Ciclos4_SACA {
    /*
        Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado
        cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje
        “Carácter no encontrado”.
     */
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("»Introduce una frase: ");
        String frase = scanner.nextLine();
        System.out.println("»Introduce una letra: ");
        String letra = scanner.nextLine().toUpperCase();
        if (letra.length()!=1){
            System.out.println("Por favor, introduce solo una letra");
            return;
        }

        char letraIn = letra.charAt(0);
        int contador=0;
        for (int i = 0; i < frase.length(); i++) {
            if (Character.toLowerCase(frase.charAt(i)) == Character.toLowerCase(letraIn)){
                contador++;
            //Con Character cuento cuantas veces aparece las letra en la frase donde le indico que clase se encuentra la frase y tambien le indico cual letra es.
            }
        }
        if (contador > 0){
            System.out.println("La letra '" + letraIn + "' aparaece "+ contador + " veces en la frase.");
        }else {
            System.out.println("Letra no aparece");
        }
    }
}
