package com.ciclos;

public class Ciclos5_SACA {
    /*
        Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos
        de un día desde las 00:00:00 horas hasta las 23:59:59 horas
     */
    public static void main(String[] args) {
        for (int hora = 0; hora < 24; hora++) { //Asig. de horas
            for (int minuto = 0; minuto < 60; minuto++) { //Asig. de minutos
                for (int segundo = 0; segundo < 60; segundo++) { //Asig. de segundos
                    String tiempo = String.format("%02d:%02d:%02d", hora, minuto, segundo); //Doy formato a la hora, minutos y segundo en con dos digitos.
                    System.out.println(tiempo);
                }
            }
        }
    }
}
