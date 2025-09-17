package com.ciclos;

import java.util.Scanner;

public class Ciclos11_SACA {
    /*
        11.Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el
        ancho y el alto. Ejemplo: 8 x 8
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el ancho: ");
        int ancho = scanner.nextInt();
        System.out.print("Introduce el alto: ");
        int alto = scanner.nextInt();
        for (int fila = 1; fila <= alto; fila++) {
            for (int columna = 1; columna <= ancho; columna++) {
                /*
                if (fila == 1 || fila == alto || columna == 1 || columna == ancho) {
                    System.out.print(" ▄ "); //codigo ascii 220 = ▄
                } else {
                    System.out.print(" ▄ ");
                }

                 */
                System.out.print(" ▄ ");



            }
            System.out.println();
        }
        scanner.close();
    }
}
