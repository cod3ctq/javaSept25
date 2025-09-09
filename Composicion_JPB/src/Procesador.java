public class Procesador {

    String fabricante;
    String modelo;
    int nucleos;
    double frecuencia;

    public Procesador(){

    }

    public Procesador(String fabricante, int nucleos, String modelo, double frecuencia) {
        this.fabricante = fabricante;
        this.nucleos = nucleos;
        this.modelo = modelo;
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

    public double getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
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
