package com.herencia;
    //Aunque aquí no se ve, aquí se esta heredando de Object.
    //Object es la clase madre de Java, la cual descienden en general.
public class Grabadora {
    String marca;
    String color;
    int parlantes;
    boolean antena;
    int conteoBotones;
    String tipoAlimentacion;
    int volumenActual=15;
    double frecuencia = 97.4;
    boolean reproduciendo;



    public Grabadora (){

    }

    public Grabadora(String marca, String color, int parlantes, boolean antena, int conteoBotones, String tipoAlimentacion) {
        this.marca = marca;
        this.color = color;
        this.parlantes = parlantes;
        this.antena = antena;
        this.conteoBotones = conteoBotones;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getParlantes() {
        return parlantes;
    }

    public void setParlantes(int parlantes) {
        this.parlantes = parlantes;
    }

    public boolean isAntena() {
        return antena;
    }

    public void setAntena(boolean antena) {
        this.antena = antena;
    }

    public int getConteoBotones() {
        return conteoBotones;
    }

    public void setConteoBotones(int conteoBotones) {
        this.conteoBotones = conteoBotones;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    @Override
    public String toString() {
        return "Grabadora{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", parlantes=" + parlantes +
                ", antena=" + antena +
                ", conteoBotones=" + conteoBotones +
                ", tipoAlimentacion='" + tipoAlimentacion + '\'' +
                '}';
    }

    //Comportamiento de la clase

    /*
        Play/pausa
        adelantar/retroceder
        Subir/Bajar volumen
        SintonizarEstación

        Las clases pueden adquirir comportamiento de 3 formas:
        1 - Metodos Nativos
        2 - Metodos Heredados (se sobreescriben)
        3 - Metodos Implementados (traidos de interfaces)
     */

    //this : apuntar o acceder al atributo de instancia.
    public void subirVolumen(){
        this.volumenActual = volumenActual + 5;
    }

    public void bajarVolumen(){
        this.volumenActual = volumenActual - 5;
    }

    public void sintonizarEstacion (double frecuencia){
        this.frecuencia = frecuencia;
    }

    public void play(){
        this.reproduciendo = true;
    }

    public void pause(){
        this.reproduciendo = false;
    }

}
