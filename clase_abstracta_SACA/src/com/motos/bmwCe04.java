package com.motos;

public class bmwCe04 extends Motos {
    String tipoLlave;
    @Override
    public void acelerar() {
        System.out.println("La BMW CE04 puede acelerar hasta 200km/h" );
    }

    public bmwCe04(String motor, String color, String cilindrada, int numLlantas, String tipoLlave) {
        super(motor, color, cilindrada, numLlantas);
        this.tipoLlave = tipoLlave;
    }

    @Override
    public String toString() {
        return "bmwCe04{" +
                "tipoLlave='" + tipoLlave + '\'' +
                ", motor='" + motor + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada='" + cilindrada + '\'' +
                ", numLlantas=" + numLlantas +
                '}';
    }
}
