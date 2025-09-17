package com;

public class EstructurasCiclicas {
    public static void main(String[] args) {
        //Estructuras ciclicas, de iteracion o bucles. Son estructuras que nos ayudan a repetir n veces una sentencia o instruccion Podemos encontrar bucles inderteminados o determinados.

        //Ciclos inderteminados

        //whie - mientras ...

        /*
            mientras (esto se cumpla/ sea verdadero){
            se ejecutara este bloque de codigo
            }
         */
       /*
        while (x < 5) {
            System.out.println(x + ".-Hola Mundo");
            //Si queremos que el ciclo llegue a culminar en algun momento debemos introducir e algun momneto debemos introducir un cambio, tal vez un incremento en "x".
            //x=x+1;
            //Otra forma de incrementar 1 en 1 es.
            x++;
        }
        */


        //do - while - Primero haceo ejecuta y despues pregunta si debe seguir ejecutandose.

        /*
            ejecuta, haz lo siguiente{
                sejecuta esta instruccion
            } mientras (esto se cumple);

        //Con esto aseguramos de que en caso que exista una condicion imposible el programa se ejecute por lo menos 1 vez.
        int  x=1;
        do {
            System.out.println("Hola Mundo"); // Primero realiza la accion
        }while (x>10);  // después evalua si se debe seguir realizando.
        */

        //Ciclo for - ciclo determinado.
        //Ya va a contar con una variable que nos ayudara a la aiteracion una condicion y un incremeto para controrarlo

        /*
            para (estos parametros) {
                se ejecutara lo siguiente
             }
             (una variavle; una condicion; un incremento;)
         */

        for (int i = 0; i <= 5; i++) {
            System.out.println(i + ".-Hola Mundo");
        }


    }
}
