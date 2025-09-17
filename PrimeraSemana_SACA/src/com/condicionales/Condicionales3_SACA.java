package com.condicionales;

import java.util.Scanner;

public class Condicionales3_SACA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Solicito el primer numero
        System.out.print("Ingrese el numero dividendo: ");
        double numero1 = scanner.nextDouble();
        //Solicito el segundo numero
        System.out.print("Ingrese el numero divisor: ");
        double numero2 = scanner.nextDouble();
        if (numero2 == 0){
            System.out.println("\nError: No se puede dividir entre 0.");
        }else {
            double r = numero1/numero2;
            System.out.println("\n El resultado de la division es: " + r);
        }
        //Cierro el scanner
        scanner.close();
    }
}
