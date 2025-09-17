package com.profesionistas;

import com.Profesionista;

public class Arquitecto extends Profesionista implements IArquitecto {
    String domicilioConstruccion;

    @Override
    public void trabajar() {
        System.out.println("Planos, Prediales, diseños, construcciones");
    }

    public Arquitecto(String titulo, String nombre, String especialidad, String cedula, String domicilioConstruccion) {
        super(titulo, nombre, especialidad, cedula);
        this.domicilioConstruccion = domicilioConstruccion;
    }

    @Override
    public String toString() {
        return "Arquitecto{" +
                "domicilioConstruccion='" + domicilioConstruccion + '\'' +
                ", titulo='" + titulo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", cedula='" + cedula + '\'' +
                '}';
    }
//Metodos de la forma 3: Traídos de interfaces
    @Override
    public void interpretarPlanos() {

    }

    @Override
    public void disenarPlanos() {

    }

    @Override
    public void calcularPresupuesto() {

    }

    @Override
    public void generarEstudioSuelo() {

    }
}
