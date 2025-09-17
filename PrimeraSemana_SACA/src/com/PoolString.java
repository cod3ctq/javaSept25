package com;

public class PoolString {
    public static void main(String[] args) {
        //¿Que es el Pool de Strings?

        String nombre = "Alex";
        String otroNombre = "Alex";
        String nombre3 = new String("Alex"); //Si se crea un nuevo String con la declaracion de new, entonces se crea otro en memoria.

        //Veamos que pasa si comparamos los Strings pero con eñ operador de igualdad ==

        if (nombre == nombre3){
            System.out.println("Cierto");
        }else {
            System.out.println("Falso");
        }
    }
}
