package com;
//Clase abstracta - Es aquella que contiene al menos 1 metodo abstracto.
public abstract class Profesionista {

    public String titulo;
    public String nombre;
    public String especialidad;
    public String cedula;

    public Profesionista () {

    }

    public Profesionista(String titulo, String nombre, String especialidad, String cedula) {
        this.titulo = titulo;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Profesionista{" +
                "titulo='" + titulo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", cedula='" + cedula + '\'' +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    //Metodo abstracto: Metodo sin cuerpo o logica establecida.

    public abstract void trabajar();

    /*
        Una clase abstracta puede contener miembros abstractos y no abstractos ( Constructores
        cuando hay por lo metodos abstracto puede contener mas de 1 metodo abstracto.1
     */

}
