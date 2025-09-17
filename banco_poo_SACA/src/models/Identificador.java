package models;

import java.time.LocalDate;

public class Identificador {

        private String numCuenta;
        private LocalDate fecha;
        public Identificador(){

        }

    public Identificador(String numCuenta, LocalDate fecha) {
        this.numCuenta = numCuenta;
        this.fecha = fecha;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Identificador{" +
                "numCuenta='" + numCuenta + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
