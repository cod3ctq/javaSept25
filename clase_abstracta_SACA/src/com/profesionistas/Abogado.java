package com.profesionistas;

import com.Profesionista;

public class Abogado extends Profesionista {
    String departamento;
    @Override
    public void trabajar() {
        System.out.println("Tramite de divorcios, demandas, amparos");
    }

    public Abogado(String titulo, String nombre, String especialidad, String cedula, String departamento) {
        super(titulo, nombre, especialidad, cedula);
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Abogado{" +
                "departamento='" + departamento + '\'' +
                ", titulo='" + titulo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", cedula='" + cedula + '\'' +
                '}';
    }
}
