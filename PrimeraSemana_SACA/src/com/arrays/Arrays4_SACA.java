package com.arrays;

public class Arrays4_SACA {
    public static void main(String[] args) {
        /*
            Dado un array de números de 5 posiciones con los siguientes valores:
            {1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con
            los valores invertidos, es decir, que el segundo array deberá tener los valores
            {5,4,3,2,1}.
         */
        int [] arrayNormal = {1,2,3,4,5};
        int [] arrayInvertido = new int[arrayNormal.length];
        for (int i = 0; i < arrayNormal.length; i++) {
            arrayInvertido[i] = arrayNormal[arrayNormal.length - 1 - i];
        }
        System.out.println("Array normal: " );
        for (int num : arrayNormal){
            System.out.print(num + " ");

        }
        System.out.println("\nArray invertido: ");
        for (int num: arrayInvertido){
            System.out.print(num + " ");
        }

    }
}
