package com.ciclos;

public class Ciclos6_SACA {
    /*
         Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés
        mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si
        stodo el dinero lo reinvierte.

     */
    public static void main(String[] args) {
        double inversionPersona = 1000.00;
        double tasaMensual = 0.02;
        int meses = 12; //Plazo en meses que tendra dinero si lo reinvierte.
        double cantidadObtenida = inversionPersona * Math.pow(1+tasaMensual,meses);
        System.out.printf("Despues de un año, la cantidad obtenida sera: $%.2f%n", cantidadObtenida);
        //Despues de un año, la cantidad obtenida sera: $1268.24
    }
}
