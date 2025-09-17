package com.condicionales;

import java.util.Scanner;

public class Condicionales12_SACA {
    /*
     12.Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2
        [m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:
            <16          Criterio de ingreso en hospital
            de 16 a 17   infrapeso
            de 17 a 18   bajo peso
            de 18 a 25   peso normal(saludable)
            de 25 a 30   sobrepeso (obesidad de grado 1)
            de 30 a 35   sobrepeso crónico( obesidad grado 2)
            de 35 a 40   obesidad premorbida (obesidad grado 3)
            >40          obesidad morbida (obesidad grado 4)
        Nota 1: se recomienda el empleo de sentencias if–else anidadas. Nota 2: Los operandos (peso y altura) deben
        ser introducidos por teclado por el usuario.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Introducimos datos
        System.out.println("»Introduce tu peso en kilogramos:");
        double peso = scanner.nextDouble();
        System.out.println("»Introduce la altura en metros:");
        double altura = scanner.nextDouble();

        //IMC
        double imc = peso / (altura*altura);
        System.out.printf("Tu IMC es: %.2f\n", imc);
        if (imc < 16){
            System.out.println("Criterio de ingreso en hospital");
        } else {
            if (imc <17){
                System.out.println("infrapeso");
            }else {
                if (imc < 18){
                    System.out.println("bajo peso");
                }else {
                    if (imc <25){
                        System.out.println("peso normal(saludable)");
                    }else {
                        if (imc <30){
                            System.out.println("sobrepeso (obesidad de grado 1)");
                        }else{
                            if (imc<35){
                                System.out.println("sobrepeso crónico( obesidad grado 2)");
                            }else {
                                if (imc<40){
                                    System.out.println("obesidad premorbida (obesidad grado 3)");
                                }else {
                                    System.out.println("obesidad morbida (obesidad grado 4)");
                                }
                            }
                        }
                    }
                }
            }
        }
        scanner.close();
    }
}
