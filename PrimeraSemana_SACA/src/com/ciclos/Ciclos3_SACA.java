package com.ciclos;

import java.util.Scanner;

public class Ciclos3_SACA {
    //Realiza un programa para determinar si un String es palíndromo.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("»Introduce una palabra o frase: ");
        String palabraFrase =scanner.nextLine();
        String frase=palabraFrase.replaceAll("\\s+","").toLowerCase();
        int tamano=frase.length();
        boolean palindromo=true; //Aqui estoy indicando true ya que es palindromo la palabra
        for (int i = 0; i < tamano/2; i++) { //Evaluo  si no es un palindromo.
            if (frase.charAt(i)!= frase.charAt(tamano-1-i)){
                palindromo=false; //aqui estoy indicando si no es polindromo
                break;
            }
        }
        if (palindromo){
            System.out.println("\"" + palabraFrase + "\" es un palíndromo.");
        }else {
            System.out.println("\"" + palabraFrase + "\" no es un palíndromo.");
        }
    }
}
