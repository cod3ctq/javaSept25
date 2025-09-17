package com.ciclos;

import java.util.Scanner;

public class Ciclos2_SACA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Pido el numero a multiplicar
        System.out.print("»Introduce el número para la tabla de multiplicar: ");
        int numMultiplicar = scanner.nextInt();
        //Solícita el número hasta donde quieres llegar la multiplicacion.
        System.out.println("\n»Introduce hasta que numero quieres que llegue la multiplicacion: ");
        int numLimite = scanner.nextInt()+1;

        for (int i = 1; i < numLimite; i++) {
            int r = numMultiplicar*i;
            System.out.println(numMultiplicar + "x" + i + "=" + r);
        }
    }
}
