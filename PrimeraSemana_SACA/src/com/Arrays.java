package com;

public class Arrays {
    public static void main(String[] args) {
        //Arrays
        //Tambien son conocidos como vectores, Son una estructura de datos que nos permite almacenar elemenontos en comun.

        //Ventajas - podemos tener varios elementos en una sola variable a los accedemos "facilmente" a traves de un indice.
        //Desventajas - Los arrays no pueden crecer en tiempo de ejeccion.

        //Ej. Cear un array para almacenar un conjunto de numeros eneteros.
        //Ej. de array de numeros con su tamaño declarado.
        int[] numeros = new int[6];
        //Introducir o almacenar elementos en nuestro array llamando a cada posicion
        numeros[0] = 10;
        numeros[1] = 9;
        numeros[2] = 1;
        numeros[3] = 2;
        numeros[4] = 3;
        numeros[5] = 6;
        //Si queremos utilizar o darle salida en consola a una posicion pués llamamos a esa unica posicion.
        System.out.println(numeros[5]);

        //Otro ejemplo de iniciar una array ya con sus valores declarados o asignados
        int[] numeros2 = {1,2,3,4,5};
        System.out.println(numeros2[2]);
        //Para poder recorrer un array podemos valornos de un ciclo
        for (int i = 0; i < numeros2.length; i++) {
            System.out.print(numeros2[i] +" ");
        }

        //¿Hay algina forma de tener un array que almacene mas de un tipo de dato?

        /*
        Object nombre = "Alejandro";

        Object numero = 1000;
        Object decimal = 3.1416;
        Object indicador = true;
        Object simbolo = '# ;

                Object [] varios = {100, "Alex",'/', true, 2.54};

        */


    }
}
