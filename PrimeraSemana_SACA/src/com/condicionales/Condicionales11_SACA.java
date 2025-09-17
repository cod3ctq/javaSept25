package com.condicionales;

import java.util.Scanner;

public class Condicionales11_SACA {

    /*
        Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América
        Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y
        la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:

        ZONA UBICACIÓN COSTO/KILOGRAMO

        1 América del Norte -------24,00 euros
        2 América Central ---------20, 00 euros
        3 América del Sur ---------21,00 euros
        4 Europa ------------------10,00 euros
        5 Asia --------------------18,00 euros

        Parte de su política implica que los paquetes con un peso superior a 5kg no son transportados, por
        cuestiones de logística y seguridad.
        Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo
        de la entrega.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Zona de Ubicación

        System.out.println("░░░----Zonas disponibles----░░░");
        System.out.println("    1 América del Norte");
        System.out.println("    2 América Central");
        System.out.println("    3 América del Sur");
        System.out.println("    4 Europa");
        System.out.println("    5 Asia");

        System.out.println("»Indica el numero al lugar donde desea realizar su envio:       ");
        int zona = scanner.nextInt();
        System.out.println("\n»Ingresa el peso del paquete: ");
        double pesoPaquete = scanner.nextDouble();

        if (pesoPaquete > 5) {
            System.out.println("Por politica de la empresa los paquetes con un peso superior a 5kg no pueden ser transportados.");
        }else {
            double costo = calcularCosto(zona,pesoPaquete);
            if (costo < 0){
                System.out.println("Zona ingresada no válida");
            }else {
                System.out.printf("El costo por la entrega del paquete es: %.2f euros\n", costo);
            }
        }
        scanner.close();
}

public static double calcularCosto(int zona, double peso){
        double costoPorKg;
        switch (zona){
            case 1: // América del Norte
                costoPorKg = 24.00;
                break;
            case 2: // América Central
                costoPorKg = 20.00;
                break;
            case 3: // América del Sur
                costoPorKg = 21.00;
                break;
            case 4: // Europa
                costoPorKg = 10.00;
                break;
            case 5: // Asia
                costoPorKg = 18.00;
                break;
            default:
                return -1;
        }
        return costoPorKg*peso;
    }
}
