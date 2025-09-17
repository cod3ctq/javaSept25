package com;

import java.util.Scanner;

public class EntradaDeDatos {
    public static void main(String[] args) {
        //Introducir valores numericos a través del teclado
        //Primero preparamos la variable donde queremos guardaar el valor.
      /*  int numero;
        //Necesitamos la clase Scaner para poder introducir o leer valores a traves del teclado.
        Scanner entrada = new Scanner(System.in);
        //Enviamos un msj en la consola para saber que se esta solicitando.
        System.out.println("Ingresa un numero: ");
        numero = entrada.nextInt();
        System.out.println("El valor puesto es \t" +  (numero));

        /*Existe una clase mas, que es la clase Math, que cuenta
        con algunas operaciones que nos pueden ayudar.
        Ejemplo obtener la raiz cuadrada de un numero.

        System.out.println(Math.sqrt(numero));
        System.out.printf("%.2f", Math.sqrt(numero));
        */


        //Operador Módulo %: Nos devuelve el valor del residuo de una division.
        int x= 10;
        int resultado = x%3;
        System.out.println(resultado); //Valor devuelto es 1. ya que es la division de 10/3 devuelve 1.


    }
}
