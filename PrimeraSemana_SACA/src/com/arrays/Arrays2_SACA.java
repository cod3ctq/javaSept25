package com.arrays;

public class Arrays2_SACA {
    public static void main(String[] args) {
        /*
             2. Crea un array de números de 100 posiciones, que contendrá los números del
            1 al 100. Obtén la suma de todos ellos y la media.
         */
        int suma=0;
        int [] numeros =  new int[100];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]= i + 1;

           // System.out.println(numeros); compruebo si imprime los 100 numeros del array registrados en memoria [I@65ab7765

        }
        for (int num : numeros){
            suma+= num;
        }
        double media = (double) suma / numeros.length;
        System.out.println("suma: "+ suma);
        System.out.println("media: "+ media);
    }
}
