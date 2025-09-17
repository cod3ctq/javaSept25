package com.condicionales;

import java.util.Scanner;

public class Condicionales9_SACA {
    /*
      9.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si
        introducimos otro número nos da un error.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número del 1 al 7: ");
        int dia = scanner.nextInt();

        String nombreDia;
        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miercoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = null;
        }

        if (nombreDia != null){
            System.out.println("\nEl día corresponde a el dia " + nombreDia);
        }else {
            System.out.println("¡¡¡Error el numero introducido es incorrecto!!!");
        }
        scanner.close();

    }
}
