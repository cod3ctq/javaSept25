package com.condicionales;

import java.util.Scanner;

public class Condicionales7_SACA {
    public static void main(String[] args) {
        /*
                El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto
                debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de
                cobrar es la siguiente:
                * Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
                * De 50 a 99 alumnos, el costo es de 70 euros.
                * De 30 a 49 alumnos, el costo es de 95 euros.
                * Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de
                alumnos.
                Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe
                pagar cada alumno por el viaje.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el numero de alumno: ");
        int numeroAlumno = scanner.nextInt();

        double costoAlumno;
        double pagoCompania;

        if (numeroAlumno >= 100){ //Costo por mas o igual de 100 alumnos, costo por boleto de 65euros
            costoAlumno = 65;
            pagoCompania = numeroAlumno * costoAlumno;
        }else if (numeroAlumno >= 50) { //De 50 a 99 alumnos, el costo es de 70 euros.
            costoAlumno = 70;
            pagoCompania = numeroAlumno * costoAlumno;

        } else if (numeroAlumno >= 30) { //De 30 a 49 alumnos, el costo es de 95 euros.
            costoAlumno= 95;
            pagoCompania = numeroAlumno * costoAlumno;

        }else {
            pagoCompania = 4000; //Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.

            costoAlumno = pagoCompania / numeroAlumno;
        }

        System.out.println("\nPago hacia la compañia de autobuses: " + pagoCompania + " euros");
        System.out.println("\nCosto por alumno: " + costoAlumno + " euros");
    }
}
