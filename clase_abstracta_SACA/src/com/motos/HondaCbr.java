package com.motos;

public class HondaCbr extends Motos {
    String escape;
    @Override
    public void acelerar() {
        System.out.println("La BMW CE04 puede acelerar hasta 200km/h" );

    }

    public HondaCbr(String motor, String color, String cilindrada, int numLlantas, String escape) {
        super(motor, color, cilindrada, numLlantas);
        this.escape = escape;
    }

    @Override
    public String toString() {
        return "HondaCbr{" +
                "escape='" + escape + '\'' +
                ", motor='" + motor + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada='" + cilindrada + '\'' +
                ", numLlantas=" + numLlantas +
                '}';
    }


}
