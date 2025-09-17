package com;

public class EstructurasCondicionales {
    public static void main(String[] args) {
        // Estructuras Condicionales o Decisión if/else

        /* Si ( esto se cumple o es verdadero) {
                se ejecutaria este bloque de codigo
           } Si no {
               se ejecutaria este bloque de codigo
         */
        int x = 10;
        System.out.println("\nProbando estructura if/else");

        if (x<=10){
            System.out.println("Cierto");
        }else{
            System.out.println("Falso");
        }

        //Condiciones compuestas utilizando operadores lógicos (AND, OR, NOT, DIFERENTE DE, IGUALDAD).

        //AND - && - Ejecuta elm primer bloque (true) cuando TODAS LAS CONDICIONES SE CUMPLEN.

        System.out.println("\nProbando el operador AND - &&");
        if (x<=10 && x>1){
            System.out.println("Cierto");
        }else {
            System.out.println("Falso");
        }

        //OR - || - Ejecuta el bloque true al menos una condicion.

        System.out.println("\nProbando el operador OR - ||");
        if (x<=10 || x>1){
            System.out.println("Cierto");
        }else {
            System.out.println("Falso");
        }

        //NOT - Niega una condicion, o cambia su valor de verdadero a falso o viceversa
        System.out.println("\nProbando el operador NOT - !");
        if (!(x>1)){
            System.out.println("Cierto");
        }else {
            System.out.println("Falso");
        }

        //IGUALDAD O COMPARACION - == - Compara dos valores y devuelve true si son iguales.
        System.out.println("\nProbando el operador IGUALDAD O COMPARACION - == -");
        if (x==10){
            System.out.println("Cierto");
        }else {
            System.out.println("Falso");
        }

        //DIFERENTE DE - != - Devuelve true cuando los valores a comparar son diferentes.
        System.out.println("\nProbando el operador DIFERENTE DE - !=");
        if (x!=9){
            System.out.println("Cierto");
        }else {
            System.out.println("Falso");
        }

        //if else anidado: Es una estructura que nos permite evaluar una condicion de a cuerdo a más posibilidades.

        int dia = 2;

        if (dia == 1){
            System.out.println("Lunes");
        } else if (dia == 2) {
            System.out.println("Martes");

        } else if (dia == 3) {
            System.out.println("Miercoles");
        } else if (dia == 4) {
            System.out.println("Jueves");
        } else if (dia == 5) {
            System.out.println("Viernes");
        }else{
            System.out.println("Error");
        }

        //switch-case - Ejecuta un bloque de codigo de acuerdo al caso que el cambie el valor de una variable.

        switch (dia){
            case 1:
                System.out.println("\nLunes");
                break;
            case 2:
                System.out.println("\nMartes");
                break;
            case 3:
                System.out.println("\nMiercoles");
                break;
            case 4:
                System.out.println("\nJueves");
                break;
            case 5:
                System.out.println("\nViernes");
                break;
            default:
                System.out.println("\nError");
                break;
        }


    }

}
