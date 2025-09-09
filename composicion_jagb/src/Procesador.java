import java.security.PublicKey;

public class Procesador {

    String fabricante, modelo;
    int nucleos;
    double frecuencia;

    public Procesador(){}

    public Procesador(String fabricante, String modelo, int nucleos, double frecuencia) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.nucleos = nucleos;
        this.frecuencia = frecuencia;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public double getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
    }

    @Override
    public String toString() {
        return "Procesador{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", nucleos=" + nucleos +
                ", frecuencia=" + frecuencia +
                '}';
    }
}
