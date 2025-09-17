package com;

public class MetodosString {
    public static void main(String[] args) {
        //Metods de la clase String para manipular cadenas de texto.
        String fecha = "Hoy es 2 de Septiembre de 2025";
        //.length() - Nos devuelve el tamaño de nuestra cadena de texto en valor entero.
        System.out.println(fecha.length());
        int tamaño = fecha.length();//30

        //charAt () - Nos devuelve el caracter que se encuentra en un determinado índice o posicion de la cadena de texto.
        System.out.println("\nProbando el metodo .charAt()");
        System.out.println(fecha.charAt(fecha.length()-1));
        //.substring() -Nos devuelve una subcadena de texto a partir de un indice especificado.
        System.out.println("\nProbando el metodo .substring()");
        System.out.println(fecha.substring(4)); // imprime este valor: es 2 de Septiembre de 2025.
        System.out.println(fecha.substring(4,11)); // imprime este valor: es 2 de


        //toLowerCase - Convierte una cadena de texto a minusculas.
        System.out.println("\nProbando el metodo .toLowerCase");
        System.out.println(fecha.toLowerCase());

        //toUpperCase
        System.out.println("\nProbando el metodo .toUpperCase");
        System.out.println(fecha.toUpperCase());

        //.equals() -Compara dos objetos, en este caso dos String y devuelve un valor booleano true si son iguales.

        System.out.println("\nProbando el metodo .equals()");
        System.out.println(fecha.equals("Hoy es 2 de Septiembre de 2025")); // tienen que ser iguales para que la comparacion sea true.

        //.equalsIgnoreCase - Comapra dos cadenas de texto en contenido y omite si son diferentes en mayusculas o minusculas.

        System.out.println("\nProbando el metodo .equalsIgnoreCase()");
        String fechaMezclada = "hOy eS 2 dE sEpTiEmBrE dE 2025";
        System.out.println(fecha.equalsIgnoreCase(fechaMezclada));

        //.contains - Devuleve True o False si se encuentra alguna secuencia de caracteres o caracter.

        System.out.println("\nProbando el metodo .contains");
        System.out.println(fecha.contains("2023")); // Nos devuelve un valor flaso ya que "2023" no se encuentra en la cadena de texto.

        //.replace - Reemplaza un caracter o secuencia de caracteres con otro en la cadena de texto.

        System.out.println("\n Probando el metodo .replace()");
        System.out.println(fecha.replace("2025","2026")); //Resultado: Hoy es 2 de Septiembre de 2026
        System.out.println(fecha.replace("e","$")); // Resultado: Hoy $s 2 d$ S$pti$mbr$ d$ 2025
        System.out.println(fecha.replace(" ","-")); // Resultado: Hoy-es-2-de-Septiembre-de-2025
        System.out.println(fecha.replace(" ","")); // Resultado: Hoyes2deSeptiembrede2025





    }
}
