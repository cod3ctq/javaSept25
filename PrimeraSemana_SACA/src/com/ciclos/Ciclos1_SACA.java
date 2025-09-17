package com.ciclos;

public class Ciclos1_SACA {
    //Programa un algoritmo que realice la tabla de multiplicar del 12
    public static void main(String[] args) {
       int numero = 12;
       //limite de la tabla de multiplicar sera 10
        int numLimite = 11;

        for (int i = 1; i < numLimite; i++) {
            int r = numero*i;
            System.out.println(numero+"x"+i+"="+r);
        }
    }
}
