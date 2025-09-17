package com.condicionales;

import java.util.Scanner;
        /*
             6. La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se
                clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta
                es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que
                entrega en un embarque considerando lo siguiente:
                * Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si
                es de tamaño 2.
                * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de
                tamaño 2.
                Precio inicial se recibe desde teclado
         */
public class Condicionales6_SACA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Datos a ingresar con scanner
        System.out.println("Ingrese el precio inicial por kilo de uva: ");
        double precioInicial = scanner.nextDouble();

        System.out.println("\nIngrese el tipo de uva ya sea de tipo A/B: ");
        char tipoUva = scanner.next().toUpperCase().charAt(0);//Indico que "charAt(0) para que asigne el primer caracter que sería A/B

        System.out.println("\nIngrese el tamaño de la uva sea (1/2): ");
        int tamanoUva = scanner.nextInt();
        double precioFinal = precioInicial;

        if (tipoUva == 'A') {
            if (tamanoUva == 1) {
                precioFinal += 0.20;
            } else if (tamanoUva == 2) {
                precioFinal += 0.30;
            } else {
                System.out.println("\nTamaño no es válido.");
                scanner.close();
                return;
            }
        } else if (tipoUva == 'B') {
            if (tamanoUva == 1) {
                precioFinal -= 0.30;
            } else if (tamanoUva == 2) {
                precioFinal -= 0.50;
            } else {
                System.out.println("\nTamaño no es válido");
                scanner.close();
                return;
            }
        } else {
            System.out.println("\nTipo de uva no es válido");
            scanner.close();
            return;
        }
        System.out.printf("\nEl precio final por kilo de una uva es: %.2f%n", precioFinal);
        scanner.close();
    }
}