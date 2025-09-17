package com.condicionales;

import java.util.Scanner;

public class Condicionales14_SACA {
    /*
        Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40
        horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las
        primeras 40 horas y $20 por cada hora extra.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de horas trabajadas en la semana: ");
        double  horasTrabajo = scanner.nextDouble();
        double salario;
        if (horasTrabajo <= 40) {
            salario = horasTrabajo * 16;
        }else {
            double horasExtras =horasTrabajo -40;
            salario = (40*16) + (horasExtras*20);
        }

        System.out.printf("El salario semanal es: $%.2f\n", salario);
        scanner.close();
    }
}
