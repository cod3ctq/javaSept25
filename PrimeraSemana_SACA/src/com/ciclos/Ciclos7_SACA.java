package com.ciclos;

public class Ciclos7_SACA {
    /*
            Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés
        mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mestodo el
        dinero?
     */
    public static void main(String[] args) {
        double inversion = 700.00;
        double interes = 0.02;
        double cantidadFinal = 1500.00;
        double cantidadInicial = inversion;
        int meses= 0;
        while (cantidadInicial<=cantidadFinal){
            cantidadInicial = cantidadInicial * (1+ interes);
            meses++;
        }
        System.out.printf("Se necesitan %d meses para que la inversión supere los $%.2f.%n", meses, cantidadFinal);
        //Se necesitan 39 meses para que la inversión supere los $1500.00.
        System.out.printf("Monto final: $%.2f%n", cantidadInicial);
        //Monto final: $1515.32
    }
}
