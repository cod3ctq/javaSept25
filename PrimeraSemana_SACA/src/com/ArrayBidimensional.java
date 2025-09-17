package com;

public class ArrayBidimensional {
    public static void main(String[] args) {
        //Arrays Bidimensional
        /*
            Son conocidos tambien como matrices y nos permiten
            almacenazr una mayor cantidad de informacion ya que
            ahora contaremos con una estructura "tabular"
            Ahora al almacenar la información, tendremos una dimension que
            actuara sobre las filas y otra sobre las columnas.
         */
        // Ej. declarar un array de dos dimensiones de numeros enteros
        int [][] matriz = new int [3][3]; //[filas],[columnas]

        //Llenando una matriz de numeros enteros

        matriz[0][0]=1;
        matriz[0][1]=2;
        matriz[0][2]=3; // [1] [2] [3] - fila con el indice 0

        matriz[1][0]=4;
        matriz[1][1]=5;
        matriz[1][2]=6;//[4] [5] [6] - fila con el indice 1

        matriz[2][0]=7;
        matriz[2][1]=8;
        matriz[2][2]=9;//[7] [8] [9] - fila con el indice 2

        //Otra forma de crear una array de dos dimensiones es con los valores asignados desde un inicio

        int [][] matriz2 = {{1,2,3,10},{4,5,6,11},{7,8,9,12}};
        System.out.println(matriz2[2][0]); //7

        //Recorrer un array de dos dimensiones en una sola intencion podemos hacer uso de un ciclo for anidado.

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
