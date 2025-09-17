package com.condicionales;

import java.util.Scanner;

public class Condicionales10_SACA {
    /*
        10.Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el
        mes correspondiente.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número entre el 1-12 para ver el número de dias que tiene el mes: ");
        int mes = scanner.nextInt();
        System.out.println("\nIntroduce el año: ");
        int ano = scanner.nextInt();
        int diasMes;
        switch (mes) {
            //Meses que tiene 31 días.
            case 1: //Enero
            case 3: //Marzo
            case 5: //Mayo
            case 7: //Julio
            case 8: //Agosto
            case 10: //Octubre
            case 12: //Diciembre
                diasMes=31;
                break;
            case 4: //Abril
            case 6: //Junio
            case 9: //Septiembre
            case 11: //Noviembre
                diasMes=30;
                break;
            case 2: //Febrero
                if(anoBisiesto(ano)){
                    diasMes=29;
                }else {
                    diasMes = 28;
                }
                break;
            default:
                diasMes = -1;
        }
        if (diasMes != -1) {
            System.out.println("\nEl mes " + mes + " del año " + ano + " tiene " + diasMes + " días.");
        }else {
            System.out.println("\nError");
        }
        scanner.close();
    }
    public static boolean anoBisiesto(int ano) {
        return (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0);
    }
}
