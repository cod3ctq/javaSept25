package com.condicionales;

import java.util.Scanner;

public class Condicionales1_SACA {
    public static void main(String[] args) {
        //Implementamos la clase Scanner para poder introduccir caracteres al teclado.
        Scanner scanner = new Scanner(System.in);
        // Solicitare el primer numero
        System.out.print("Ingresa el primer número: \t");
        //int ya que solicitare un numero entero
        int numero1 = scanner.nextInt();
        // Solicitare el primer numero
        System.out.print("Ingresa el segundo número: \t");
        int numero2 = scanner.nextInt();

        if (numero1>numero2){
            System.out.println("\nEl número mayor es:\t" + numero1);
        } else if (numero2>numero1) {
            System.out.println("\nEl número mayor es:\t"+ numero2);
        }else{
            System.out.println("\nLos números son iguales");
        }
        //Cierro el recurso de System.in después de haber utilizado.
        scanner.close();

    }
}
