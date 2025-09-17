package com.herencia;
/*
    Herencia permite reutilizar y/o absorber los miembros de una clase
    en otra.

    Especialización - Agregar o modificar, sobreescribir algo en la clase.
 */

public class Discman extends Grabadora {
    String cds;
    //Si no se hace ningún constructor en alguna clase, Java otorga el vació por default.


    public Discman(String marca, String color, int parlantes, boolean antena, int conteoBotones, String tipoAlimentacion, String cds) {
        super(marca, color, parlantes, antena, conteoBotones, tipoAlimentacion);
        this.cds = cds;
    }

    public Discman(){}

    public String getCds() {
        return cds;
    }

    public void setCds(String cds) {
        this.cds = cds;
    }

    //Comportamiento Heredado y sobreescrito.
    @Override // Esto indica sobre escritura.
    public void subirVolumen(){
        this.volumenActual = volumenActual + 10;
    }

    public void bajarVolumen(){
        this.volumenActual = volumenActual - 10;
    }
    //Metodo nativo y propio de la clase hija.
    public void leerDiscos(){

    }

}
