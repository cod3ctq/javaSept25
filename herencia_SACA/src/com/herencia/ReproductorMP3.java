package com.herencia;

public class ReproductorMP3 extends Discman{

   /*
        Java solo existe la herencia simple
        Una clase solo puede heredar de 1 en particular
        Una clase no puede tener 2 extends o más al mismo tiempo

        Una clase SI puede ser heredada por 2 o más clases.

        Los hijos acceden a los componentes heredados de sus padres, pero los padres NO pueden acceder a los componentes propios de los Hijos.

    */

    public ReproductorMP3(String marca, String color, int parlantes, boolean antena, int conteoBotones, String tipoAlimentacion, String cds) {
        super(marca, color, parlantes, antena, conteoBotones, tipoAlimentacion, cds);

    }




}
