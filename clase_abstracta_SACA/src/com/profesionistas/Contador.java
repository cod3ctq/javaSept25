package com.profesionistas;

import com.Profesionista;

public class Contador extends Profesionista implements IArquitecto, IMedicina,IMatematicas {
    String domicilioDespacho;
    @Override
    public void trabajar() {
        System.out.println("Facturas, declaración de impuestos, estado de resultados");
    }

    public Contador(String titulo, String nombre, String especialidad, String cedula, String domicilioDespacho) {
        super(titulo, nombre, especialidad, cedula);
        this.domicilioDespacho = domicilioDespacho;
    }

    @Override
    public String toString() {
        return "Contador{" +
                "domicilioDespacho='" + domicilioDespacho + '\'' +
                ", titulo='" + titulo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", cedula='" + cedula + '\'' +
                '}';
    }

//IArquitecto
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

//IMedicina
    @Override
    public void primerosAuxilios() {

    }

    @Override
    public void checarPresion() {

    }

    @Override
    public void inyectar() {

    }

    @Override
    public void diagnosticar() {

    }
//IMatematicas
    @Override
    public double raizCuadrada(double num) {
        return Math.sqrt(num);
    }

    @Override
    public double seno(double angulo) {
        return 0;
    }


    //Polimorfismo:
    /*
    1.- Sobre de argumentos: Puede haber varios metodos con el mismo nombre pero diferente cantidad y tipo de argumentos.
    2.-Sobreescritura: Redefinicion de la logica de un metodo, ya que sea por herencia o por implementacion de interfaces.
    3.- Mutacion de las clases al implementar metodos multiples de interfaces.
   */
    //SOLID : Principipos para diseñar y desarrolar codigo con calidad.
}
