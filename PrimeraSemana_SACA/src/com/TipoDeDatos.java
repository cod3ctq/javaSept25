package com;

public class TipoDeDatos {
    public static void main(String[] args) {
        //Comentarios de una linea

        /*Comentarios de
        varias lineas
         */

        //Numericos Enteros

        //Podemos declarar variables sin valor asignado
        byte miVariableUno;   // Ej. de declarar una variable
        miVariableUno = 100;    // esto me permite lienas mas abajo, poder asignarle un valor. Ej. guardar el numero 100 en ella.

        //Podemos declarar variables con sus valores asignados desde un inicio
        short sh = 32000;
        int i = 2147483647;     // Int es el dato mas ocupado para trabajar numeros enteros.
        long largo = 2147483649544856L;     // Las variables para que puedan almacenar valores que van mas alla de los int, necesitan el sufijo de la letra L.

        // TIPOS DE DATOS PRIMITIVOS NUMERICOS EN COMA FLOTANTE
        float pulgadas = 2.54F; // 4 bytes de memoria y tienen  una precisión decimal de 6 a 7 digitos
        double pi = 3.1415178465478; //Su precision decimal es hasta 15 digitos, el dato comodin mas utilizado.

        // TIPOS DE DATOS PRIMITIVOS BOOLEANOS Y CARACTER
        boolean evalua = false;     //Este tipo de dato es utilizado para evaluar expresiones o condiciones.
        char letra = 'A'; //Manera simple
        char arroba = 64;   //Manera ASCII

        // TIPOS DE DATOS NO PRIMITIVOS
        // TIPOS DE DATOS OBJETO
        // TIPOS DE DATOS ESTRUCTURADO

        //String - Nos permite almacenar una secuencia de caracteres (cadenas de texto).
        String nombre = "Saul Antonio Castillo Aguilar";
        String numeroTelefono = "288118692351"; // Podemos almacenar numeros pero serian reconocidos como texto.
        //Wrapper (envoltorio) "Envuelven" a los tipos de dato primitivo en "Clases" y les otorgan algunas funcionalidades

        Byte b = 100;
        Short s = 1000;
        Integer entero = 10000;
        Long largo2 = 741894466887749L;
        Float milla = 1.6F;
        Double frecuencia = 22666.33;
        Boolean indicador = true;
        Character simbolo = '?';

        b.toString(); // La clase "b" la convertimos a string "100".

        //Darle Salida a nuestros datos en consola.
        System.out.println(nombre);
        System.out.println(entero); //"println" se imprime en salto de linea.
        System.out.print(1); //"print" se imprime segui consecutivamente.
        System.out.print(2);
        System.out.print(3);
        System.out.println();
        System.out.println(200+150);

        int x = 200;
        int y = 150;
        System.out.println(x+y);
        //Concatenacion de texto.
        System.out.println("El resultado es: " + (x+y));

    }
}
