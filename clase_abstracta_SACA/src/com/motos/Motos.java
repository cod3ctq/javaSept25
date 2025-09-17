package com.motos;

public abstract class Motos {
    String motor;
    String color;
    String cilindrada;
    int numLlantas;

    public Motos(){

    }

    public Motos(String motor, String color, String cilindrada, int numLlantas) {
        this.motor = motor;
        this.color = color;
        this.cilindrada = cilindrada;
        this.numLlantas = numLlantas;
    }

    @Override
    public String toString() {
        return "Motos{" +
                "motor='" + motor + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada='" + cilindrada + '\'' +
                ", numLlantas=" + numLlantas +
                '}';
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getNumLlantas() {
        return numLlantas;
    }

    public void setNumLlantas(int numLlantas) {
        this.numLlantas = numLlantas;
    }
    public abstract void acelerar();
}
