package com.arrays;

public class Arrays5_SACA {
    /*
        Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
        respectivos precios. Muestra en consola la lista de productos y sus precios.
        Por lo menos 5 productos o artículos.
     */
    public static void main(String[] args) {
        String [] juegos = {"Call of Duty", "GTAV", "Elden Ring", "RD2", "FIFA"};
        Double [] precios = {20.00, 25.00, 45.90, 49.99, 27.99};
        System.out.println("Lista de juegos y sus precios: ");
        for (int i = 0; i < juegos.length; i++) {
            System.out.printf("%-10s : $%.2f%n", juegos[i], precios[i]);//Formato para que sean en dólares y espacio.
        }


    }
}
