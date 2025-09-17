package com.condicionales;

import java.util.Scanner;

public class Condicionales13_SACA {
    /*
        Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un
        centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
        Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños
        y el resto se invierte en la bolsa.
        Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de
        niños y el resto se invierte en la bolsa.
        La institución desea saber cuánto de dinero destinará a cada rubro anualmente.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("»Ingrese el monto de la donacion anual: ");
        double donacion=scanner.nextDouble();

        double centroSalud, comedor, inversion;

        if (donacion >= 10000) {
            centroSalud = donacion * 0.30;
            comedor = donacion * 0.50;
            inversion = donacion - (centroSalud + comedor);
        } else {
            centroSalud = donacion * 0.25;
            comedor = donacion * 0.60;
            inversion = donacion - (centroSalud + comedor);
        }

        System.out.println("Distribucion de la donacion:");
        System.out.printf("Centro de salud: $%.2f\n", centroSalud);
        System.out.printf("Comedor de niños: $%.2f\n", comedor);
        System.out.printf("Inversión en la bolsa: $%.2f\n", inversion);

        scanner.close();
    }
}

