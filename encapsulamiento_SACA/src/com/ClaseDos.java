package com;

import principal.ClaseUno;

public class ClaseDos {
    //Objeto de una clase de otro paquete.
    ClaseUno ob = new ClaseUno();


    public ClaseDos(){

        //Miembros protect no son alcanzables en clases de otros paquetes
        //ob.atributo3 = 40;
        //ob.atributo4 = 40;
        //miembros privados mucho menos
        //ob.atributo5 = 40;
        //ob.atributo6 = 40;

        //Solo los miembros publicos son alcanzables en clases de otros paquetes
        //this.atributo1="wqeqwf";
        //Miembros protected no son alcanzables en calses de otros paquetes a menos que se aplique herencia.
        //this.atributo4=54;


    }

    ClaseDos o2 = new ClaseDos();


}
