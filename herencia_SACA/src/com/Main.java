package com;

import com.herencia.Discman;
import com.herencia.Grabadora;

public class Main {
    public static void main(String[] args) {

        Grabadora g1= new Grabadora("Sony", "Negro", 4, true, 20, "Directa");
        System.out.println(g1);


        g1.sintonizarEstacion(105);
        g1.bajarVolumen();
        g1.subirVolumen();
        g1.play();
        g1.pause();



        Discman d1 = new Discman();

        d1.sintonizarEstacion(98.5);
        d1.bajarVolumen();
        d1.subirVolumen();
        d1.play();
        d1.pause();
        d1.leerDiscos();



    }
}
